# Spring Boot Banking Services – Microservices Project

GitHub Repository: [springboot-banking-services](https://github.com/Sangramjit786/springboot-banking-services.git)

This repository demonstrates how to design, develop, and deploy cloud-native microservices using **Spring Boot**, **Spring Cloud**, **Docker**, **Eureka**, and other modern frameworks.  
The project simulates a **banking application** with **Accounts, Loans, and Cards** microservices, covering best practices in REST APIs, service discovery, configuration management, resilience, and deployment.

---

## 📘 Table of Contents

1. [How to build microservices](#1 how to build microservices)  
2. [Introduction to SpringBoot framework](#2 introduction to springboot framework)  
3. [Introduction to REST APIs & best practices](#3 introduction to rest apis best practices)  
4. [Creating a Spring Boot project](#4 creating a spring boot project)  
5. [Creating Hello World REST API using @RestController](#5 creating hello world rest api using restcontroller)  
6. [Configuring H2 DB & YAML properties](#6 configuring h2 db yaml properties)  
7. [Writing Spring Data JPA entities & repositories to interact with DB tables](#7 writing spring data jpa entities repositories to interact with db tables)  
8. [Introduction to DTO (Data Transfer Object) pattern](#8 introduction to dto data transfer object pattern)  
9. [Creating DTOs inside accounts microservice](#9 creating dtos inside accounts microservice)  
10. [CREATE API inside accounts microservice](#10 create api inside accounts microservice)  
11. [READ API inside accounts microservice](#11 read api inside accounts microservice)  
12. [UPDATE API inside accounts microservice](#12 update api inside accounts microservice)  
13. [DELETE API inside accounts microservice](#13 delete api inside accounts microservice)  
14. [Handle all types of runtime exceptions using global logic inside accounts](#14 handle all types of runtime exceptions using global logic inside accounts)  
15. [GlobalExceptionHandler & CustomMapper](#15 also implemented globalexceptionhandler implemented custommapper)  
16. [Perform input data validations inside accounts microservice](#16 perform input data validations inside accounts microservice)  
17. [Update audit columns using Spring Data](#17 update audit columns using spring data)  
18. [Introduction to documentation of REST APIs using springdoc openapi](#18 introduction to documentation of rest apis using springdoc openapi)  
19. [Enhancing documentation of REST APIs using @OpenAPIDefinition](#19 enhancing documentation of rest apis using openapidefinition)  
20. [Enhancing documentation of REST APIs using @Tag, @Operation, @ApiResponse](#20 enhancing documentation of rest apis using tag operation apiresponse)  
21. [Enhancing documentation of REST APIs using @Schema & example data](#21 enhancing documentation of rest apis using schema example data)  
22. [Important Annotations & Classes that supports building REST services](#22 important annotations classes that supports building rest services)  
23. [Assignment to build Loans & Cards microservices](#23 assignment to build loans cards microservices)  
24. [Deep dive and demo of Loans microservice](#24 deep dive and demo of loans microservice)  
25. [Deep dive and demo of Cards microservice](#25 deep dive and demo of cards microservice)  
26. [Approaches to identify boundaries & right size microservices](#26 approaches to identify boundaries right size microservices)  
27. [Sizing & identifying boundaries with a Bank App use case](#27 sizing identifying boundaries with a bank app use case)  
28. [Sizing & identifying boundaries with a ecommerce migration use case](#28 sizing identifying boundaries with a ecommerce migration use case)  
29. [Strangler Fig pattern](#29 strangler fig pattern)  
30. [Introduction to challenges while building, deploying microservices](#30 introduction to challenges while building deploying microservices)  
31. [What are Containers & how they are different from VMs](#31 what are containers how they are different from vms)  
32. [Definition of Containers, Containerization, Docker](#32 definition of containers containerization docker)  
33. [Introduction to Docker components & its architecture](#33 introduction to docker components its architecture)  
34. [Docker installation & docker hub introduction](#34 docker installation docker hub introduction)  
35. [Introduction to the three approaches for Docker image generation](#35 introduction to the three approaches for docker image generation)  
36. [Generate Docker Image of Accounts microservice with Dockerfile](#36 generate docker image of accounts microservice with dockerfile)  
37. [Running accounts microservice as a Docker container](#37 running accounts microservice as a docker container)  
38. [Challenges with Dockerfile approach to generate a Docker image](#38 challenges with dockerfile approach to generate a docker image)  
39. [Generate Docker Image of Loans microservice with Buildpacks](#39 generate docker image of loans microservice with buildpacks)  
40. [Generate Docker Image of Cards microservice with Google Jib](#40 generate docker image of cards microservice with google jib)  
41. [Compare Dockerfile, Buildpacks, Jib approaches](#41 compare dockerfile buildpacks jib approaches)  
42. [Pushing Docker images from your local to remote Docker hub repository](#42 pushing docker images from your local to remote docker hub repository)  
43. [Introduction to Docker Compose](#43 introduction to docker compose)  
44. [Running all microservice containers using Docker Compose command](#44 running all microservice containers using docker compose command)  
45. [Demo of docker compose commands](#45 demo of docker compose commands)  
46. [Deep dive on Docker commands](#46 deep dive on docker commands)  
47. [Introduction to Docker extensions and LogsExplorer](#47 introduction to docker extensions and logsexplorer)  
48. [Introduction to Cloud native applications](#48 introduction to cloud native applications)  
49. [Important characteristics of cloud native applications](#49 important characteristics of cloud native applications)  
50. [Differences between cloud native Apps & Traditional enterprise Apps](#50 differences between cloud native apps traditional enterprise apps)  
51. [Introduction to 12 factor & 15 factor methodologies](#51 introduction to 12 factor 15 factor methodologies)  
52. [Deepdive on 15 factor methodology](#52 deepdive on 15 factor methodology)  
53. [Introduction to Configurations Management challenges inside microservices](#53 introduction to configurations management challenges inside microservices)  
54. [How Configurations work in Spring Boot](#54 how configurations work in spring boot)  
55. [Reading configurations using @Value annotation](#55 reading configurations using value annotation)  
56. [Also, used @AllArgsConstructor](#56 also used allargsconstructor)  
57. [Reading configurations using Environment interface](#57 reading configurations using environment interface)  
58. [Reading configurations using @ConfigurationProperties and Usage of 'Record' java feature](#58 reading configurations using configurationproperties and usage of record java feature)  
59. [Introduction to Spring Boot profiles](#59 introduction to spring boot profiles)  
60. [Demo of Spring Boot profiles inside accounts microservice](#60 demo of spring boot profiles inside accounts microservice)  
61. [Externalizing configurations using command-line Arguments, JVM Arguments & Environment Variables](#61 externalizing configurations using command line arguments jvm arguments environment variables)  
62. [Activating the profile using Arguments, JVM Arguments & Environment Variables](#62 activating the profile using arguments jvm arguments environment variables)  
63. [Assignment to make SpringBoot profile changes inside loans & cards microservices](#63 assignment to make springboot profile changes inside loans cards microservices)  
64. [Demo of Spring Boot profile changes inside loans & cards microservices](#64 demo of spring boot profile changes inside loans cards microservices)  
65. [Drawbacks of externalized configurations using SpringBoot alone](#65 drawbacks of externalized configurations using springboot alone)  
66. [Introduction to Spring Cloud Config](#66 introduction to spring cloud config)  
67. [Building Config Server using Spring Cloud Config](#67 building config server using spring cloud config)  
68. [Reading configurations from the class path location of Config Server](#68 reading configurations from the class path location of config server)  
69. [Updating Accounts Microservice to read properties from Config Server](#69 updating accounts microservice to read properties from config server)  
70. [Updating Loans & Cards Microservice to read properties from Config Server](#70 updating loans cards microservice to read properties from config server)  
71. [Reading configurations from a file system location](#71 reading configurations from a file system location)  
72. [Reading configurations from a GitHub repository](#72 reading configurations from a github repository)  
73. [Encryption & Decryption of properties inside Config server](#73 encryption decryption of properties inside config server)  
74. [Refresh configurations at runtime using refresh actuator path](#74 refresh configurations at runtime using refresh actuator path)  
75. [Refresh configurations at runtime using Spring Cloud Bus](#75 refresh configurations at runtime using spring cloud bus)  
76. [Refresh configurations at runtime using both Actuator path & Cloud Bus](#76 refresh configurations at runtime using refresh actuator path and refresh configurations at runtime using spring cloud bus)  
77. [Refresh config at runtime using Spring Cloud Bus & Spring Cloud Config monitor](#77 refresh config at runtime using spring cloud bus spring cloud config monitor)  
78. [Updating Docker Compose file to adapt Config Server changes](#78 updating docker compose file to adapt config server changes)  
79. [Introduction to Liveness and Readiness probes](#79 introduction to liveness and readiness probes)  
80. [Optimizing Docker Compose file](#80 optimizing docker compose file)  
81. [Generating Docker images and pushing them into Docker Hub](#81 generating docker images and pushing them into docker hub)  
82. [Testing Config Server changes end to end using Docker compose & default profile](#82 testing config server changes end to end using docker compose default profile)  
83. [Preparing Docker Compose files for QA & prod profiles](#83 preparing docker compose files for qa prod profiles)  
84. [Create MySQL DB containers for microservices](#84 create mysql db containers for microservices)  
85. [Update microservices code to replace H2 DB with MySQL DB](#85 update microservices code to replace h2 db with mysql db)  
86. [Update docker compose file to create & use MySQL DB](#86 update docker compose file to create use mysql db)  
87. [Running microservices & MySQL DB containers using docker compose file](#87 running microservices mysql db containers using docker compose file)  
88. [Demo of Docker network concept](#88 demo of docker network concept)  
89. [Brief introduction about microservices traffic](#89 brief introduction about microservices traffic)  
90. [Introduction to the Service Discovery & Registration inside microservices](#90 introduction to the service discovery registration inside microservices)  
91. [Why not traditional load balancers for Microservices](#91 why not traditional load balancers for microservices)  
92. [Service Discovery & Registration inside microservices](#92 service discovery registration inside microservices)  
93. [How Client side Service-Discovery & Load balancing works](#93 how client side service discovery load balancing works)  
94. [Spring Cloud support for Service Discovery & Registration](#94 spring cloud support for service discovery registration)  
95. [Setup Service Discovery agent using Eureka server](#95 setup service discovery agent using eureka server)  
96. [Make code changes in Accounts microservice to connect Eureka Server](#96 make code changes in accounts microservice to connect eureka server)  
97. [Make code changes in Loans & Cards microservice to connect Eureka Server](#97 make code changes in loans cards microservice to connect eureka server)  
98. [De registration from Eureka server when microservices shutdown](#98 de registration from eureka server when microservices shutdown)  
99. [Demo of heartbeats mechanism to Eureka server from clients](#99 demo of heartbeats mechanism to eureka server from clients)  
100. [Feign Client code changes to invoke other microservices](#100 feign client code changes to invoke other microservices)  
101. [Eureka Self-Preservation mode to avoid network trap issues](#101 eureka self preservation mode to avoid network trap issues)  
102. [Generating Docker images with Service Discovery changes & push them into Docker Hub](#102 generating docker images with service discovery changes push them into dock)  
103. [Updating Docker Compose file to adapt Service Discovery changes](#103 updating docker compose file to adapt service discovery changes)  
104. [Starting all the microservices using docker compose file](#104 starting all the microservices using docker compose file)  
105. [Demo of Client Side Service Discovery & Load balancing](#105 demo of client side service discovery load balancing)  
106. [Usage of GRAALVM](#106 usage of graalvm)
107. [Challenges while dealing external communication in microservices](#107 challenges while dealing external communication in microservices)  
108. [Why we need an Edge Server or API Gateway inside microservices](#108 why we need an edge server or api gateway inside microservices)  
109. [Introduction to Spring Cloud Gateway](#109 introduction to spring cloud gateway)  
110. [Deep dive on Spring Cloud Gateway internal architecture](#110 deep dive on spring cloud gateway internal architecture)  
111. [Building Edge Server using Spring Cloud Gateway](#111 building edge server using spring cloud gateway)  
112. [Demo of Edge Server with default routing configs](#112 demo of edge server with default routing configs)  
113. [Accepting lowercase service names in Gateway server](#113 accepting lowercase service names in gateway server)  
114. [Implementing Custom Routing using Spring Cloud Gateway](#114 implementing custom routing using spring cloud gateway)  
115. [Demo of addResponseHeader filter](#115 demo of addresponseheader filter)  
116. [Implementing Tracing & Logging via Gateway](#116 implementing tracing logging via gateway)  
117. [Design patterns around API Gateway](#117 design patterns around api gateway)  
118. [Generating & pushing Docker images with Gateway changes](#118 generating pushing docker images with gateway changes)  
119. [Updating Docker Compose file for Gateway changes](#119 updating docker compose file for gateway changes)  
120. [Introduction to the need of Resiliency in microservices](#120 introduction to the need of resiliency in microservices)  
121. [Typical use case for Resiliency](#121 typical use case for resiliency)  
122. [Deep dive on Circuit Breaker pattern](#122 deep dive on circuit breaker pattern)  
123. [Three states of Circuit Breaker pattern](#123 three states of circuit breaker pattern)  
124. [Implementing Circuit Breaker in Gateway](#124 implementing circuit breaker in gateway)  
125. [Implementing Fallback mechanism in API Gateway](#125 implementing fallback mechanism in api gateway)  
126. [Circuit Breaker with Feign Client](#126 circuit breaker with feign client)  
127. [HTTP Timeout configurations in Loans service](#127 http timeout configurations in loans service)  
128. [Introduction to Retry pattern](#128 introduction to retry pattern)  
129. [Implementing Retry pattern in Gateway](#129 implementing retry pattern in gateway)  
130. [Implementing Retry pattern in Accounts service](#130 implementing retry pattern in accounts service)  
131. [Introduction to Rate Limiter pattern](#131 introduction to rate limiter pattern)  
132. [Redis RateLimiter in Gateway Server](#132 redis ratelimiter in gateway server)  
133. [Implementing Redis RateLimiter in Gateway Server](#133 implementing redis ratelimiter in gateway server)  
134. [Testing Redis RateLimiter with Apache Benchmark](#134 testing redis ratelimiter with apache benchmark)  
135. [Implementing RateLimiter in Accounts service](#135 implementing ratelimiter in accounts service)  
136. [Introduction to Bulkhead pattern](#136 introduction to bulkhead pattern)  
137. [Aspect order of Resiliency patterns](#137 aspect order of resiliency patterns)  
138. [Demo of Resiliency patterns using Docker](#138 demo of resiliency patterns using docker)  
139. [Introduction to Observability & Monitoring](#139 introduction to observability monitoring)  
140. [Observability vs Monitoring](#140 observability vs monitoring)  
141. [Centralized Logging (Log Aggregation) in microservices](#141 centralized logging log aggregation in microservices)  
142. [Managing logs with Grafana, Loki & Alloy](#142 managing logs with grafana loki alloy)  
143. [Demo: Logging using Grafana, Loki & Alloy](#143 demo logging using grafana loki alloy)  
144. [Implementing logging with Grafana, Loki & Alloy](#144 implementing logging with grafana loki alloy)  
145. [Dockerfile changes for logging setup & Grafana UI test](#145 dockerfile changes for logging setup grafana ui test)  
146. [Managing Metrics & Monitoring with Actuator, Micrometer, Prometheus & Grafana](#146 managing metrics monitoring with actuator micrometer prometheus grafana)  
147. [Setup of Micrometer in microservices](#147 setup of micrometer in microservices)  
148. [Setup of Prometheus in microservices](#148 setup of prometheus in microservices)  
149. [Demo of Prometheus](#149 demo of prometheus)  
150. [Demo of Prometheus & Grafana integration](#150 demo of prometheus grafana integration)  
151. [Demo of Grafana dashboards](#151 demo of grafana dashboards)  
152. [Creating Alerts & Notifications in Grafana](#152 creating alerts notifications in grafana)  
153. [Introduction to Distributed Tracing](#153 introduction to distributed tracing)  
154. [Introduction to OpenTelemetry](#154 introduction to opentelemetry)  
155. [Implementing OpenTelemetry in microservices](#155 implementing opentelemetry in microservices)  
156. [Tracing with Grafana, Tempo & OpenTelemetry](#156 tracing with grafana tempo opentelemetry)  
157. [Navigating to Tempo from Loki logs](#157 navigating to tempo from loki logs)  
158. [Conclusion of Observability & Monitoring](#158 conclusion of observability monitoring)  
159. [Introduction to Microservices Security](#159 introduction to microservices security)  
160. [Problems solved by OAuth2](#160 problems solved by oauth2)  
161. [Introduction to OAuth2](#161 introduction to oauth2)  
162. [OAuth2 jargons, roles & terminologies](#162 oauth2 jargons roles terminologies)  
163. [OpenID Connect & its importance](#163 openid connect its importance)  
164. [IAM Products & Why Keycloak](#164 iam products why keycloak)  
165. [Deep dive on Client Credentials grant flow](#165 deep dive on client credentials grant flow)  
166. [Securing Gateway server with Client Credentials flow](#166 securing gateway server with client credentials flow)  
167. [Setup Auth server using Keycloak](#167 setup auth server using keycloak)  
168. [Register client details in Keycloak for Client Credentials flow](#168 register client details in keycloak for client credentials flow)  
169. [Getting Access Token from Auth Server](#169 getting access token from auth server)  
170. [Securing Gateway as a Resource server](#170 securing gateway as a resource server)  
171. [Implementing Authorization with Roles in Gateway](#171 implementing authorization with roles in gateway)  
172. [Deep dive on Authorization Code grant flow](#172 deep dive on authorization code grant flow)  
173. [Securing Gateway server with Authorization Code grant flow](#173 securing gateway server with authorization code grant flow)  
174. [Registering client & end user in Keycloak](#174 registering client end user in keycloak)  
175. [Demo of Authorization Code flow](#175 demo of authorization code flow)  
176. [Demo of Security with Docker & Docker Compose](#176 demo of security with docker docker compose)  
177. [Introduction to Event driven microservices](#177 introduction to event driven microservices)  
178. [Event driven models explained](#178 event driven models explained)  
179. [What we will build with Pub/Sub model](#179 what we will build with pubsub model)  
180. [Introduction to RabbitMQ](#180 introduction to rabbitmq)  
181. [Why use Spring Cloud Function](#181 why use spring cloud function)  
182. [Building Message microservice with Spring Cloud Functions](#182 building message microservice with spring cloud functions)  
183. [Why use Spring Cloud Stream](#183 why use spring cloud stream)  
184. [Updating Message & Accounts services to process events](#184 updating message accounts services to process events)  
185. [Demo of async communication with RabbitMQ](#185 demo of async communication with rabbitmq)  
186. [Demo of async event streaming with Docker Compose](#186 demo of async event streaming with docker compose)  
187. [Apache Kafka vs RabbitMQ](#187 apache kafka vs rabbitmq)  
188. [Introduction to Apache Kafka](#188 introduction to apache kafka)  
189. [Producer & Consumer explained](#189 producer consumer explained)  
190. [Installing Apache Kafka](#190 installing apache kafka)  
191. [Implementing async event streaming with Kafka](#191 implementing async event streaming with kafka)  
192. [Demo of Kafka event streaming with Docker Compose](#192 demo of kafka event streaming with docker compose)  
193. [Challenges in container orchestration](#193 challenges in container orchestration)  
194. [Introduction to Kubernetes](#194 introduction to kubernetes)  
195. [Kubernetes internal architecture deep dive](#195 kubernetes internal architecture deep dive)  
196. [Setup local Kubernetes cluster with Docker Desktop](#196 setup local kubernetes cluster with docker desktop)  
197. [Deploying Kubernetes Dashboard UI](#197 deploying kubernetes dashboard ui)  
198. [Kubernetes YAML for microservice deployment](#198 kubernetes yaml for microservice deployment)  
199. [Deploying Config Server in Kubernetes](#199 deploying config server in kubernetes)  
200. [Using ConfigMap for environment variables in K8s](#200 using configmap for environment variables in k8s)  
201. [Preparing manifest files for microservices](#201 preparing manifest files for microservices)  
202. [Deploying microservices in Kubernetes](#202 deploying microservices in kubernetes)  
203. [Automatic Self healing in Kubernetes](#203 automatic self healing in kubernetes)  
204. [Automatic Rollout & Rollback in Kubernetes](#204 automatic rollout rollback in kubernetes)  
205. [Kubernetes Service types explained](#205 kubernetes service types explained)  
206. [Demo of Kubernetes Service types](#206 demo of kubernetes service types)  
207. [Problems with manually created Kubernetes manifests](#207 problems with manually created kubernetes manifests)


---

## 📖 Detailed Documentation

### 1) How to build microservices  
We follow **Domain-Driven Design (DDD)** and **bounded context** to split business functionality into small, independently deployable services (Accounts, Loans, Cards).

### 2) Introduction to SpringBoot framework  
Spring Boot simplifies microservice development by providing **auto-configuration**, **embedded server support (Tomcat/Jetty)**, and **production-ready features** like Actuator.

### 3) Introduction to REST APIs & best practices  
REST APIs are the backbone of microservices. We implement them with:  
- **Stateless design**  
- **Proper HTTP methods (GET, POST, PUT, DELETE)**  
- **Standard response codes (200, 201, 400, 404, 500)**  
- **Error handling with `@ControllerAdvice`**

### 4) Creating a Spring Boot project  
The project uses **Spring Initializr** to create services with dependencies like `spring-boot-starter-web`, `spring-boot-starter-data-jpa`, and `springdoc-openapi`.

### 5) Creating Hello World REST API using @RestController  
A simple `@RestController` was built for testing service availability, returning `"Hello Banking Services!"`.

### 6) Configuring H2 DB & YAML properties  
The Accounts microservice uses **in-memory H2 DB** for quick testing, configured via `application.yaml` with schema and data initialization.

### 7) Writing Spring Data JPA entities & repositories to interact with DB tables  
Entities like **Accounts, Loans, Cards** map to DB tables. Repositories extend `JpaRepository` to provide CRUD operations.

### 8) Introduction to DTO (Data Transfer Object) pattern  
DTOs are introduced to decouple **entity persistence models** from **API contracts**, improving security and maintainability.

### 9) Creating DTOs inside accounts microservice  
`AccountDTO` is created to transfer account details between layers without exposing the JPA entity directly.

### 10) CREATE API inside accounts microservice  
Implements **POST /accounts** endpoint to create a new account, mapping request DTO → entity → DB.

### 11) READ API inside accounts microservice  
Implements **GET /accounts/{id}** endpoint to fetch account details using JPA repository.

### 12) UPDATE API inside accounts microservice  
Implements **PUT /accounts/{id}** endpoint to update account details, leveraging DTO validation.

### 13) DELETE API inside accounts microservice  
Implements **DELETE /accounts/{id}** endpoint to remove accounts safely from DB.

### 14) Handle all types of runtime exceptions using global logic inside accounts  
Global error handling implemented with `@ControllerAdvice` and `@ExceptionHandler`.

### 15) Also implemented GlobalExceptionHandler. Implemented 'CustomMapper'  
- **GlobalExceptionHandler**: centralized runtime exception handling.  
- **CustomMapper**: utility to map entities ↔ DTOs consistently.

### 16) Perform input data validations inside accounts microservice  
Used **Jakarta Bean Validation** (`@NotNull`, `@Size`, `@Email`) with `@Valid` annotations to validate input DTOs.

### 17) Update audit columns using Spring Data  
`@CreatedDate`, `@LastModifiedDate` annotations update audit columns automatically.

### 18) Introduction to documentation of REST APIs using springdoc openapi  
**springdoc-openapi** integrated to auto-generate Swagger UI for REST APIs.

### 19) Enhancing documentation of REST APIs using @OpenAPIDefinition  
Applied at the class level for global metadata (title, version, description).

### 20) Enhancing documentation of REST APIs using @Tag, @Operation, @ApiResponse  
Used to group APIs and provide response documentation.

### 21) Enhancing documentation of REST APIs using @Schema & example data  
DTOs annotated with `@Schema` to show API request/response examples.

### 22) Important Annotations & Classes that supports building REST services  
Key annotations include `@RestController`, `@RequestMapping`, `@PathVariable`, `@RequestBody`, `@ResponseStatus`, etc.

### 23) Assignment to build Loans & Cards microservices  
Parallel microservices created with similar CRUD operations for **Loans** and **Cards**.

### 24) Deep dive and demo of Loans microservice  
Loans microservice supports APIs for loan creation, reading details, updating, and deletion.

### 25) Deep dive and demo of Cards microservice  
Cards microservice supports APIs for issuing cards, managing limits, and tracking status.

### 26) Approaches to identify boundaries & right size microservices  
Discussed **business capabilities**, **team ownership**, and **independent scaling** to size microservices properly.

### 27) Sizing & identifying boundaries with a Bank App use case  
Accounts, Loans, and Cards were identified as **separate bounded contexts** in the banking domain.

### 28) Sizing & identifying boundaries with an ecommerce migration use case  
Example: splitting ecommerce into **Orders, Payments, Inventory** microservices.

### 29) Strangler Fig pattern  
Adopted **Strangler Fig pattern** for gradually migrating monolithic banking systems into microservices.

### 30) Introduction to challenges while building, deploying microservices  
Challenges: **distributed data**, **network latency**, **service discovery**, **logging**, and **monitoring**.

### 31) What are Containers & how they are different from VMs  
Containers are **lightweight**, share OS kernel, and are faster than VMs.

### 32) Definition of Containers, Containerization, Docker  
Docker used for containerization to ensure consistency across environments.

### 33) Introduction to Docker components & its architecture  
Docker architecture explained: **Client → Daemon → Registry → Images → Containers**.

### 34) Docker installation & docker hub introduction  
Installed Docker Desktop, created account on **Docker Hub** for image storage.

### 35) Introduction to the three approaches for Docker image generation  
- **Dockerfile**  
- **Buildpacks**  
- **Google Jib**

### 36) Generate Docker Image of Accounts microservice with Dockerfile  
Custom Dockerfile created for `accounts-service`.

### 37) Running accounts microservice as a Docker container  
Executed `docker run` to start container with mapped port.

### 38) Challenges with Dockerfile approach to generate a Docker image  
Manual maintenance, dependency mismatches, and verbose configuration.

### 39) Generate Docker Image of Loans microservice with Buildpacks  
Built image with **Spring Boot Buildpacks** (`./mvnw spring-boot:build-image`).

### 40) Generate Docker Image of Cards microservice with Google Jib  
Generated image using **Google Jib Maven plugin**.

### 41) Compare Dockerfile, Buildpacks, Jib approaches  
- **Dockerfile**: Full control, more effort.  
- **Buildpacks**: Zero Docker knowledge required.  
- **Jib**: Fast, no Docker daemon dependency.

### 42) Pushing Docker images from your local to remote Docker hub repository  
`docker push username/repo:tag` used to publish images.

### 43) Introduction to Docker Compose  
Docker Compose used to orchestrate multiple containers.

### 44) Running all microservice containers using Docker Compose command  
Defined all services in `docker-compose.yml` and ran with `docker-compose up`.

### 45) Demo of docker compose commands  
Commands like `docker-compose ps`, `logs`, `down` were demonstrated.

### 46) Deep dive on Docker commands  
Explored commands for managing containers (`docker ps`, `exec`, `inspect`).

### 47) Introduction to Docker extensions and LogsExplorer  
Extensions like **Docker Desktop Extensions** and log analysis tools were introduced.

### 48) Introduction to Cloud-native applications  
Cloud-native apps are **scalable, resilient, containerized, and dynamically orchestrated**.

### 49) Important characteristics of cloud-native applications  
Includes **loose coupling, scalability, observability, automation**.

### 50) Differences between cloud-native Apps & Traditional enterprise Apps  
Traditional = monolithic, slow deployment.  
Cloud-native = microservices, CI/CD, fast scaling.

### 51) Introduction to 12-factor & 15-factor methodologies  
12-factor principles help build cloud-ready apps. Extended 15-factor includes **API-first, Telemetry**.

### 52) Deepdive on 15-factor methodology  
Covered all 15 factors in microservices context.

### 53) Introduction to Configurations Management challenges inside microservices  
Challenges: multiple environments, sensitive data, externalization.

### 54) How Configurations work in Spring Boot  
Spring Boot loads configuration in **precedence order** (application.yaml, env vars, args).

### 55) Reading configurations using @Value annotation  
Injected property values into beans using `@Value("${property.name}")`.

### 56) Also, used @AllArgsConstructor  
Lombok `@AllArgsConstructor` to reduce boilerplate in config classes.

### 57) Reading configurations using Environment interface  
Accessed properties dynamically via `Environment.getProperty()`.

### 58) Reading configurations using @ConfigurationProperties and Usage of 'Record' java feature  
Bound groups of properties to POJOs/Java Records with `@ConfigurationProperties`.

### 59) Introduction to Spring Boot profiles  
Profiles allow different configurations for `dev`, `qa`, `prod`.

### 60) Demo of Spring Boot profiles inside accounts microservice  
Created `application-dev.yaml`, `application-prod.yaml` for Accounts service.

### 61) Externalizing configurations using command-line Arguments(Program Arguments), JVM Arguments(VM Arguments) & Environment Variables options  
Showed multiple ways to override configs without code change.

### 62) Activating the profile using Arguments(Program Arguments), JVM Arguments(VM Arguments) & Environment Variables options  
Activated `--spring.profiles.active=dev` style flags.

### 63) Assignment to make SpringBoot profile changes inside loans & cards microservices  
Configured profiles in Loans and Cards microservices.

### 64) Demo of Spring Boot profile changes inside loans & cards microservices  
Successfully switched between environments in Loans & Cards.

### 65) Drawbacks of externalized configurations using SpringBoot alone  
Not centralized, difficult to maintain across services.

### 66) Introduction to Spring Cloud Config  
Spring Cloud Config provides **centralized external config management**.

### 67) Building Config Server using Spring Cloud Config  
Built Config Server as a standalone microservice.

### 68) Reading configurations from the class path location of Config Server  
Config Server served YAML configs placed inside its resources.

### 69) Updating Accounts Microservice to read properties from Config Server  
Changed Accounts config to point to Config Server.

### 70) Updating Loans & Cards Microservice to read properties from Config Server  
Both microservices updated to fetch properties remotely.

### 71) Reading configurations from a file system location  
Config Server configured to load from file system paths.

### 72) Reading configurations from a GitHub repository  
Pointed Config Server to GitHub repo for config storage.

### 73) Encryption & Decryption of properties inside Config server  
Enabled **Spring Security + Encryption Keys** for sensitive values.

### 74) Refresh configurations at runtime using refresh actuator path  
Enabled `/actuator/refresh` endpoint.

### 75) Refresh configurations at runtime using Spring Cloud Bus  
Used **RabbitMQ/Kafka bus** for distributed config refresh.

### 76) Refresh configurations at runtime using refresh actuator path and Refresh configurations at runtime using Spring Cloud Bus  
Hybrid refresh approach demonstrated.

### 77) Refresh config at runtime using Spring Cloud Bus & Spring Cloud Config monitor  
Auto-refresh enabled with **Config Monitor** integration.

### 78) Updating Docker Compose file to adapt Config Server changes  
Compose updated to include Config Server container.

### 79) Introduction to Liveness and Readiness probes  
Added health checks for Kubernetes readiness.

### 80) Optimizing Docker Compose file  
Optimized memory, networking, dependencies in Compose.

### 81) Generating Docker images and pushing them into Docker Hub  
All microservice images published to Docker Hub.

### 82) Testing Config Server changes end to end using Docker compose & default profile  
Validated config reload in containers.

### 83) Preparing Docker Compose files for QA & prod profiles  
Created profile-specific Compose files.

### 84) Create MySQL DB containers for microservices  
Added MySQL container services to Compose.

### 85) Update microservices code to replace H2 DB with MySQL DB  
JPA configs updated from H2 → MySQL.

### 86) Update docker compose file to create & use MySQL DB  
Compose updated with MySQL volume, credentials.

### 87) Running microservices & MySQL DB containers using docker compose file  
End-to-end system with MySQL tested successfully.

### 88) Demo of Docker network concept  
Containers communicate internally via Docker bridge networks.

### 89) Brief introduction about microservices traffic  
Discussed east-west (service-to-service) vs north-south (client-to-service) traffic.

### 90) Introduction to the Service Discovery & Registration inside microservices  
Service discovery helps microservices find each other dynamically.

### 91) Why not traditional load balancers for Microservices  
Traditional LBs can’t handle frequent scaling, dynamic IPs.

### 92) Service Discovery & Registration inside microservices  
Implemented using **Eureka Server**.

### 93) How Client side Service Discovery & Load-balancing works  
Clients query Eureka registry and balance across instances.

### 94) Spring Cloud support for Service Discovery & Registration  
Spring Cloud Netflix provides `@EnableEurekaClient`.

### 95) Setup Service Discovery agent using Eureka server  
Configured standalone **Eureka Server**.

### 96) Make code changes in Accounts microservice to connect Eureka Server  
Added Eureka client dependency and configs.

### 97) Make code changes in Loans & Cards microservice to connect Eureka Server  
Both microservices registered with Eureka server.

### 98) De-registration from Eureka server when microservices shutdown  
Enabled **graceful deregistration** on shutdown.

### 99) Demo of heartbeats mechanism to Eureka server from clients  
Heartbeat pings ensure service availability.

### 100) Feign Client code changes to invoke other microservices  
Integrated **OpenFeign** for inter-service calls.

### 101) Eureka Self-Preservation mode to avoid network trap issues  
Eureka prevents mass deregistration during network partitions.

### 102) Generating Docker images with Service Discovery changes & push them into Dock  
New images built with Eureka integration.

### 103) Updating Docker Compose file to adapt Service Discovery changes  
Compose updated with Eureka + dependencies.

### 104) Starting all the microservices using docker compose file  
Started Eureka + Accounts + Loans + Cards with single command.

### 105) Demo of Client Side Service Discovery & Load balancing  
Feign + Eureka tested for load balancing.

### 106) Usage of GRAALVM  
GraalVM used for **ahead-of-time compilation** to improve microservice performance and reduce memory footprint.

### 107) Challenges while dealing external communication in microservices
External communication introduces challenges such as latency, network failures, security risks, and version mismatches. These issues must be addressed with resiliency patterns, retries, circuit breakers, and API gateways.

### 108) Why we need an Edge Server or API Gateway inside microservices
An API Gateway acts as the single entry point to microservices, handling routing, security, load balancing, logging, and cross-cutting concerns, thus reducing client-side complexity.

### 109) Introduction to Spring Cloud Gateway
Spring Cloud Gateway is a reactive, non-blocking API Gateway built on Spring WebFlux, providing dynamic routing, filters, rate limiting, and resiliency features.

### 110) Deep dive on Spring Cloud Gateway internal architecture
Spring Cloud Gateway uses RouteDefinitionLocator (for routes), Predicate (to match requests), and Filters (to apply modifications). It is built on Project Reactor for high-performance reactive handling.

### 111) Building Edge Server using Spring Cloud Gateway
We build an Edge Server by creating a Spring Boot project with spring-cloud-starter-gateway. It routes incoming requests to backend services using route definitions.

### 112) Demo of Edge Server with default routing configs
A demo shows configuring routes in application.yml with service URLs and testing them using Postman or browser requests.

### 113) Make changes inside Gateway server to accept service names with lower case
Spring Cloud Gateway is case-sensitive by default. We configure it to handle lowercase service names to ensure consistency and usability.

### 114) Implementing Custom Routing using Spring Cloud Gateway
Custom routing is implemented using Java-based configuration (RouteLocatorBuilder) to apply dynamic routing logic.

### 115) Demo of addResponseHeader filter
We demonstrate adding custom headers (e.g., X-Service-Name, X-Trace-Id) using Gateway’s addResponseHeader filter for better tracking.

### 116) Implementing Cross-cutting concerns Tracing & Logging using Gateway
We add filters to capture request/response logs and trace IDs at the Gateway level for centralized tracing.

### 117) Design patterns around API Gateway
Common patterns include:
Aggregator Pattern: Combining multiple microservice calls.
Backend-for-Frontend (BFF): Different gateways for different clients.
Edge Security Pattern: Centralizing authentication/authorization.

### 118) Generating and pushing Docker images with Spring Cloud Gateway changes
We add a Dockerfile, build images with docker build, and push them to Docker Hub for deployment.

### 119) Updating Docker Compose file to adapt Spring Cloud Gateway changes
We update docker-compose.yml to include the new Gateway service with networking and dependencies.

### 120) Introduction to the need of Resiliency inside microservices
Resiliency ensures microservices continue functioning under failures. It protects against network issues, latency, or service crashes.

### 121) Typical use case or scenario for the need of Resiliency
Example: If Loan Service is down, Accounts should still work by returning cached or fallback responses.

### 122) Deep dive on Circuit Breaker pattern
Circuit Breaker prevents cascading failures by stopping requests to a failing service and restoring when it becomes healthy.

### 123) Three states of Circuit Breaker pattern
Closed → Requests flow normally.
Open → Requests blocked due to failures.
Half-Open → Limited requests allowed to test recovery.

### 124) Implementing Circuit Breaker pattern in Gateway
Using Resilience4j, we configure circuit breakers inside Spring Cloud Gateway for failing routes.

### 125) Implementing Fallback mechanism for Circuit Breaker pattern in APIGateway service/Edge server
When a service fails, the Gateway returns a default fallback response instead of propagating the error.

### 126) Implementing Circuit Breaker pattern with Feign Client
Feign Clients integrate with Resilience4j/Hystrix to provide circuit breaking and fallbacks for REST calls.

### 127) Implementing Http timeout configurations, in loans service
We configure connect/read timeouts in application.yml to avoid infinite waits during service calls.

### 128) Introduction to Retry pattern
Retry re-executes failed requests (with exponential backoff) to handle temporary failures.

### 129) Implementing Retry pattern in Gateway
We configure Retry filters in Gateway to automatically retry failed requests.

### 130) Implementing Retry pattern in accounts
Accounts service is configured with Resilience4j Retry to handle intermittent downstream failures.

### 131) Introduction to Rate Limiter pattern
Rate Limiting ensures fair usage by restricting request rates per client/service.

### 132) Introduction to Redis RateLimiter in Gateway Server
Spring Cloud Gateway integrates with Redis for distributed rate limiting across multiple instances.

### 133) Implementing Redis RateLimiter in Gateway Server
We configure RedisRateLimiter in Gateway application.yml to throttle requests.

### 134) Implementing Redis RateLimiter in Gateway Server and tested using Apache Benchmark
We run ab tool to simulate high traffic and validate request throttling.

### 135) Implementing RateLimiter pattern in accounts
Rate limiting is added at the service level to protect accounts API from abuse.

### 136) Introduction to Bulkhead pattern
Bulkheads isolate resources (like thread pools) for services to contain failures.

### 137) Aspect order of Resiliency patterns
Order: Timeout → Retry → Circuit Breaker → Bulkhead → Fallback.

### 138) Demo of Resiliency patterns using Docker containers & Docker compose
We test resiliency (circuit breakers, retries, bulkheads) in a Dockerized microservice setup.

---

## 🚀 Conclusion

This repository demonstrates the **end-to-end lifecycle of microservice development**, from REST API design to containerization, centralized configuration, and service discovery. By following the documented steps, developers can replicate and extend the project for real-world enterprise use cases.

---
