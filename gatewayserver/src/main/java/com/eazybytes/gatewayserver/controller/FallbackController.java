package com.eazybytes.gatewayserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    /**
     * Provides a fallback message for the contact support endpoint.
     * <p>
     * This method returns a Mono containing a message indicating that an error occurred
     * and advises the user to try again later or contact the support team.
     * The endpoint is accessed via "/contactSupport".
     *
     * @return Mono containing the fallback message.
     */

    @RequestMapping("/contactSupport")
    public Mono<String> contactSupport() {
        return Mono.just("An error occurred. Please try after some time or contact support team!!!");
    }
}
