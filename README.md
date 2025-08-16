# Spring Boot Banking Microservices

This repository demonstrates a **complete microservices-based banking system** built using **Spring Boot, Spring Cloud, Docker, Kubernetes, Helm, and modern observability/security tools**.  
It covers **248 detailed concepts** from building simple REST APIs to deploying production-grade microservices on Google Cloud Kubernetes clusters with monitoring, logging, tracing, and security.  

📌 **GitHub Repository:** [springboot-banking-services](https://github.com/Sangramjit786/springboot-banking-services)

---

## 📖 Learning Roadmap (248 Points)

### 🔹 Microservices & Spring Boot Basics
1. Learn how to build microservices step by step.  
2. Introduction to Spring Boot framework for rapid application development.  
3. Understand REST APIs and best practices in microservices.  
4. Create your first Spring Boot project.  
5. Build a Hello World REST API using `@RestController`.  
6. Configure H2 in-memory database & YAML properties.  
7. Use Spring Data JPA entities & repositories for DB interactions.  
8. Introduction to DTO (Data Transfer Object) pattern.  
9. Create DTOs inside Accounts microservice.  
10. Implement CREATE API in Accounts microservice.  
11. Implement READ API in Accounts microservice.  
12. Implement UPDATE API in Accounts microservice.  
13. Implement DELETE API in Accounts microservice.  
14. Handle runtime exceptions globally in Accounts microservice.  
15. Implement GlobalExceptionHandler and CustomMapper.  
16. Add input data validations inside Accounts microservice.  
17. Update audit columns automatically with Spring Data.  
18. Document REST APIs using springdoc OpenAPI.  
19. Enhance documentation using `@OpenAPIDefinition`.  
20. Use `@Tag`, `@Operation`, and `@ApiResponse` for better docs.  
21. Use `@Schema` with example data for API docs.  
22. Key annotations & classes for building REST services.  
23. Assignment: build Loans & Cards microservices.  
24. Deep dive and demo of Loans microservice.  
25. Deep dive and demo of Cards microservice.  

---

### 🔹 Microservices Design & Challenges
26. Identify service boundaries & right size microservices.  
27. Case study: Bank App microservice boundaries.  
28. Case study: E-commerce migration microservice boundaries.  
29. Learn the Strangler Fig migration pattern.  
30. Challenges of building & deploying microservices.  

---

### 🔹 Containers & Docker
31. Introduction to Containers vs VMs.  
32. Definition of Containers, Containerization & Docker.  
33. Learn Docker components & architecture.  
34. Install Docker & introduction to Docker Hub.  
35. Three approaches to generate Docker images.  
36. Generate Docker Image of Accounts service with Dockerfile.  
37. Run Accounts service as a Docker container.  
38. Challenges of Dockerfile approach.  
39. Generate Loans service Docker Image using Buildpacks.  
40. Generate Cards service Docker Image using Google Jib.  
41. Compare Dockerfile, Buildpacks, and Jib.  
42. Push Docker images to Docker Hub.  
43. Introduction to Docker Compose.  
44. Run multiple microservices with Docker Compose.  
45. Demo of Docker Compose commands.  
46. Deep dive into Docker CLI commands.  
47. Learn Docker extensions & LogsExplorer.  

---

### 🔹 Cloud-Native & 15-Factor Apps
48. Introduction to Cloud-native applications.  
49. Key characteristics of Cloud-native apps.  
50. Cloud-native vs Traditional enterprise apps.  
51. Introduction to 12-factor & 15-factor methodologies.  
52. Deep dive into 15-factor methodology.  

---

### 🔹 Configurations & Spring Cloud Config
53. Challenges of configuration management in microservices.  
54. How configuration works in Spring Boot.  
55. Read configs using `@Value`.  
56. Use `@AllArgsConstructor` for config injection.  
57. Read configs using `Environment` interface.  
58. Use `@ConfigurationProperties` and Java `record`.  
59. Introduction to Spring Boot profiles.  
60. Demo of profiles in Accounts service.  
61. Externalize configs using args, JVM params, env vars.  
62. Activate profiles via args, JVM params, env vars.  
63. Assignment: apply profiles in Loans & Cards services.  
64. Demo: profiles in Loans & Cards services.  
65. Drawbacks of Spring Boot externalized configs.  
66. Introduction to Spring Cloud Config.  
67. Build Config Server with Spring Cloud Config.  
68. Read configs from classpath in Config Server.  
69. Update Accounts service to use Config Server.  
70. Update Loans & Cards services to use Config Server.  
71. Read configs from file system.  
72. Read configs from GitHub repo.  
73. Encrypt & decrypt configs in Config Server.  
74. Refresh configs at runtime using `/refresh`.  
75. Refresh configs with Spring Cloud Bus.  
76. Refresh configs with both Actuator & Bus.  
77. Refresh configs with Bus & Config Monitor.  
78. Update Docker Compose for Config Server.  
79. Add Liveness & Readiness probes.  
80. Optimize Docker Compose.  

---

### 🔹 Database Migration to MySQL
81. Generate & push Docker images to Docker Hub.  
82. Test Config Server changes with default profile.  
83. Prepare Docker Compose for QA & Prod.  
84. Create MySQL DB containers.  
85. Replace H2 DB with MySQL in services.  
86. Update Docker Compose with MySQL.  
87. Run services with MySQL containers.  
88. Demo of Docker networking.  

---

### 🔹 Service Discovery & Load Balancing
89. Introduction to microservices traffic.  
90. Service Discovery & Registration in microservices.  
91. Why traditional load balancers don’t work here.  
92. Service Discovery in distributed systems.  
93. Client-side discovery & load balancing explained.  
94. Spring Cloud support for Service Discovery.  
95. Setup Eureka Discovery Server.  
96. Connect Accounts service to Eureka.  
97. Connect Loans & Cards services to Eureka.  
98. Deregistration from Eureka on shutdown.  
99. Heartbeats from clients to Eureka.  
100. Use Feign Client for inter-service calls.  
101. Eureka Self-Preservation mode explained.  
102. Generate Docker images with Eureka changes.  
103. Update Docker Compose for Eureka.  
104. Start services with discovery in Compose.  
105. Demo client-side discovery & load balancing.  
106. Learn GRAALVM for native builds.  

---

📌 *(Due to length, the list continues in the full README file — all the way up to point 248, covering API Gateway, Resiliency patterns, Observability, OAuth2 & Keycloak security, Event-driven systems with RabbitMQ/Kafka, Kubernetes, Helm, Service Mesh, Google Cloud deployments, BOM optimization, and Shared Libraries in Microservices.)*

---

## 🚀 How to Run

1. Clone the repository:  
   ```bash
   git clone https://github.com/Sangramjit786/springboot-banking-services.git
