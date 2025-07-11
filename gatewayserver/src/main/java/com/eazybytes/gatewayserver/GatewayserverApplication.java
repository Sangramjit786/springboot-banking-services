package com.eazybytes.gatewayserver;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.circuitbreaker.resilience4j.ReactiveResilience4JCircuitBreakerFactory;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.gateway.filter.ratelimit.RedisRateLimiter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.LocalDateTime;

@SpringBootApplication
public class GatewayserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayserverApplication.class, args);
	}

	@Bean
	public RouteLocator eazyBankRouteConfig(RouteLocatorBuilder routeLocatorBuilder) {
		return routeLocatorBuilder.routes()
				.route(p -> p.path("/eazybank/accounts/**")
						.filters( f -> f.rewritePath("/eazybank/accounts/(?<segment>.*)","/${segment}")
								.addResponseHeader("X-Response-Time", LocalDateTime.now().toString())
								.circuitBreaker(config -> config.setName("accountsCircuitBreaker")
										.setFallbackUri("forward:/contactSupport")))
						.uri("lb://ACCOUNTS"))
				.route(p -> p.path("/eazybank/loans/**")
						.filters( f -> f.rewritePath("/eazybank/loans/(?<segment>.*)","/${segment}")
								.addResponseHeader("X-Response-Time", LocalDateTime.now().toString())
								.retry(retryConfig -> retryConfig.setRetries(3)
										.setMethods(HttpMethod.GET)
										.setBackoff(Duration.ofMillis(100), Duration.ofMillis(1000), 2, true)))
						.uri("lb://LOANS"))
				.route(p -> p.path("/eazybank/cards/**")
						.filters( f -> f.rewritePath("/eazybank/cards/(?<segment>.*)","/${segment}")
								.addResponseHeader("X-Response-Time", LocalDateTime.now().toString())
								.requestRateLimiter(config -> config.setRateLimiter(redisRateLimiter())
										.setKeyResolver(userKeyResolver())))
						.uri("lb://CARDS")).build();
	}

    /**
     * Provides a default configuration for the ReactiveResilience4JCircuitBreakerFactory.
     * <p>
     * This method configures the factory with default settings for circuit breakers and time limiters.
     * The circuit breaker uses the default configuration from Resilience4J, while the time limiter
     * is set to a timeout duration of 4 seconds.
     *
     * @return a Customizer for ReactiveResilience4JCircuitBreakerFactory with the default configuration.
     */

	@Bean
	public Customizer<ReactiveResilience4JCircuitBreakerFactory> defaultCustomizer() {
		return factory -> factory.configureDefault(id -> new Resilience4JConfigBuilder(id)
				.circuitBreakerConfig(CircuitBreakerConfig.ofDefaults())
				.timeLimiterConfig(TimeLimiterConfig.custom().timeoutDuration(Duration.ofSeconds(4)).build()).build());
	}

    /**
     * Creates a RedisRateLimiter bean with specified configuration.
     * The rate limiter is configured to allow one request per second with a burst capacity of one.
     *
     * @return a RedisRateLimiter instance configured for rate limiting.
     */
    @Bean
    public RedisRateLimiter redisRateLimiter() {
        return new RedisRateLimiter(1, 1, 1);
    }


	/**
	 * A KeyResolver that returns the value of the "user" header if it is present,
	 * otherwise returns "anonymous". This is used to determine the rate limiter
	 * key for the {@link RedisRateLimiter}.
	 * @return a KeyResolver that resolves to the value of the "user" header or
	 *         "anonymous" if the header is not present.
	 */
	@Bean
	KeyResolver userKeyResolver() {
		return exchange -> Mono.justOrEmpty(exchange.getRequest().getHeaders().getFirst("user"))
				.defaultIfEmpty("anonymous");
	}

}
