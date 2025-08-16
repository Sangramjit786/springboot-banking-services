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

---

## 🚀 Conclusion

This repository demonstrates the **end-to-end lifecycle of microservice development**, from REST API design to containerization, centralized configuration, and service discovery. By following the documented steps, developers can replicate and extend the project for real-world enterprise use cases.

---
