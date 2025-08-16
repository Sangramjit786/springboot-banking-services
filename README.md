# Spring Boot Banking Services – Microservices Project

GitHub Repository: [springboot-banking-services](https://github.com/Sangramjit786/springboot-banking-services.git)

This repository demonstrates how to design, develop, and deploy cloud-native microservices using **Spring Boot**, **Spring Cloud**, **Docker**, **Eureka**, and other modern frameworks.  
The project simulates a **banking application** with **Accounts, Loans, and Cards** microservices, covering best practices in REST APIs, service discovery, configuration management, resilience, and deployment.

---

## 📘 Table of Contents

## 1) Getting Started with Microservices
1. [How to build microservices](#1 how to build microservices)  
2. [Introduction to SpringBoot framework](#2 introduction to springboot framework)  
3. [Introduction to REST APIs & best practices](#3 introduction to rest apis best practices)  

## 2) Building Your First Spring Boot Project
4. [Creating a Spring Boot project](#4 creating a spring boot project)  
5. [Creating Hello World REST API using @RestController](#5 creating hello world rest api using restcontroller)  
6. [Configuring H2 DB & YAML properties](#6 configuring h2 db yaml properties)  
7. [Writing Spring Data JPA entities & repositories to interact with DB tables](#7 writing spring data jpa entities repositories to interact with db tables)  

## 3) Working with DTOs and CRUD Operations
8. [Introduction to DTO (Data Transfer Object) pattern](#8 introduction to dto data transfer object pattern)  
9. [Creating DTOs inside accounts microservice](#9 creating dtos inside accounts microservice)  
10. [CREATE API inside accounts microservice](#10 create api inside accounts microservice)  
11. [READ API inside accounts microservice](#11 read api inside accounts microservice)  
12. [UPDATE API inside accounts microservice](#12 update api inside accounts microservice)  
13. [DELETE API inside accounts microservice](#13 delete api inside accounts microservice) 

## 4) Exception Handling & Validations 
14. [Handle all types of runtime exceptions using global logic inside accounts](#14 handle all types of runtime exceptions using global logic inside accounts)  
15. [GlobalExceptionHandler & CustomMapper](#15 also implemented globalexceptionhandler implemented custommapper)  
16. [Perform input data validations inside accounts microservice](#16 perform input data validations inside accounts microservice)  
17. [Update audit columns using Spring Data](#17 update audit columns using spring data)  

## 5. API Documentation with OpenAPI
18. [Introduction to documentation of REST APIs using springdoc openapi](#18 introduction to documentation of rest apis using springdoc openapi)  
19. [Enhancing documentation of REST APIs using @OpenAPIDefinition](#19 enhancing documentation of rest apis using openapidefinition)  
20. [Enhancing documentation of REST APIs using @Tag, @Operation, @ApiResponse](#20 enhancing documentation of rest apis using tag operation apiresponse)  
21. [Enhancing documentation of REST APIs using @Schema & example data](#21 enhancing documentation of rest apis using schema example data)  
22. [Important Annotations & Classes that supports building REST services](#22 important annotations classes that supports building rest services)  

## 6. Expanding Microservices – Loans & Cards
23. [Assignment to build Loans & Cards microservices](#23 assignment to build loans cards microservices)  
24. [Deep dive and demo of Loans microservice](#24 deep dive and demo of loans microservice)  
25. [Deep dive and demo of Cards microservice](#25 deep dive and demo of cards microservice)  

## 7. Designing Microservices – Boundaries & Patterns
26. [Approaches to identify boundaries & right size microservices](#26 approaches to identify boundaries right size microservices)  
27. [Sizing & identifying boundaries with a Bank App use case](#27 sizing identifying boundaries with a bank app use case)  
28. [Sizing & identifying boundaries with a ecommerce migration use case](#28 sizing identifying boundaries with a ecommerce migration use case)  
29. [Strangler Fig pattern](#29 strangler fig pattern)  

## 8. Challenges & Containerization Basics
30. [Introduction to challenges while building, deploying microservices](#30 introduction to challenges while building deploying microservices)  
31. [What are Containers & how they are different from VMs](#31 what are containers how they are different from vms)  
32. [Definition of Containers, Containerization, Docker](#32 definition of containers containerization docker)  
33. [Introduction to Docker components & its architecture](#33 introduction to docker components its architecture)  
34. [Docker installation & docker hub introduction](#34 docker installation docker hub introduction)  
35. [Introduction to the three approaches for Docker image generation](#35 introduction to the three approaches for docker image generation)  

## 9. Docker Images & Container Management
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

## 10. Cloud Native Applications 
48. [Introduction to Cloud native applications](#48 introduction to cloud native applications)  
49. [Important characteristics of cloud native applications](#49 important characteristics of cloud native applications)  
50. [Differences between cloud native Apps & Traditional enterprise Apps](#50 differences between cloud native apps traditional enterprise apps)  
51. [Introduction to 12 factor & 15 factor methodologies](#51 introduction to 12 factor 15 factor methodologies)  
52. [Deepdive on 15 factor methodology](#52 deepdive on 15 factor methodology)  

## 11. Configuration Management
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

## 12. Spring Cloud Config
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

## 13. Database Management
84. [Create MySQL DB containers for microservices](#84 create mysql db containers for microservices)  
85. [Update microservices code to replace H2 DB with MySQL DB](#85 update microservices code to replace h2 db with mysql db)  
86. [Update docker compose file to create & use MySQL DB](#86 update docker compose file to create use mysql db)  
87. [Running microservices & MySQL DB containers using docker compose file](#87 running microservices mysql db containers using docker compose file)  
88. [Demo of Docker network concept](#88 demo of docker network concept)  

## 14. Service Discovery & Load Balancing
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

## 15. API Gateway & Edge Services
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

## 16. Resiliency Patterns 
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

## 17. Observability & Monitoring 
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

## 18. Security & OAuth2
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

## 19. Event-Driven Microservices
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

## 20. Kubernetes & Orchestration 
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

## 21. Helm & Kubernetes Automation
208. [Introduction to Helm & the problems that it solves](#208 introduction to helm the problems that it solves)  
209. [Installing Helm](#209 installing helm)  
210. [Installing a sample Helm Chart](#210 installing a sample helm chart)  
211. [Understanding Helm Chart structure](#211 understanding helm chart structure)  
212. [Creating our own Helm chart & template files](#212 creating our own helm chart template files)  
213. [Creating Helm chart for Accounts microservice](#213 creating helm chart for accounts microservice)  
214. [Creating Helm charts for other microservices](#214 creating helm charts for other microservices)  
215. [Creating Helm charts for Dev, QA and Prod environment](#215 creating helm charts for dev qa and prod environment)  
216. [Demo of helm template command](#216 demo of helm template command)  
217. [Install KeyCloak in Kubernetes Cluster using Helm Chart](#217 install keycloak in kubernetes cluster using helm chart)  
218. [Install Kafka in Kubernetes Cluster using Helm Chart](#218 install kafka in kubernetes cluster using helm chart)  
219. [Install Prometheus in Kubernetes Cluster using Helm Chart](#219 install prometheus in kubernetes cluster using helm chart)  
220. [Install Grafana Loki & Tempo in Kubernetes Cluster using Helm Chart](#220 install grafana loki tempo in kubernetes cluster using helm chart)  
221. [Install Grafana in Kubernetes Cluster using Helm Chart](#221 install grafana in kubernetes cluster using helm chart)  
222. [Install eazybank microservices in Kubernetes Cluster using Helm Chart](#222 install eazybank microservices in kubernetes cluster using helm chart)  
223. [Demo of helm upgrade command](#223 demo of helm upgrade command)  
224. [Demo of helm history and rollback commands](#224 demo of helm history and rollback commands)  
225. [Demo of helm uninstall command](#225 demo of helm uninstall command)  
226. [Quick revision of important helm commands](#226 quick revision of important helm commands) 

## 22. Server-Side Discovery & Cloud Deployment 
227. [Introduction to Server side service discovery and load balancing](#227 introduction to server side service discovery and load balancing)  
228. [How to setup discovery server in K8s cluster using spring cloud kubernetes](#228 how to setup discovery server in k8s cluster using spring cloud kubernetes)  
229. [Install spring cloud kubernetes discovery server in K8s cluster](#229 install spring cloud kubernetes discovery server in k8s cluster)  
230. [Making Kubernetes Discovery Client changes in microservices](#230 making kubernetes discovery client changes in microservices)  
231. [Updating Helm charts for Kubernetes Discovery Server changes](#231 updating helm charts for kubernetes discovery server changes)  
232. [Demo of Server side service discovery and load balancing](#232 demo of server side service discovery and load balancing)   
233. [Kubernetes support by Cloud providers](#233 kubernetes support by cloud providers)  
234. [Set up Google Cloud account & install Google Cloud SDK](#234 set up google cloud account install google cloud sdk)  
235. [Create a Kubernetes cluster in Google Cloud](#235 create a kubernetes cluster in google cloud)  
236. [Installing all our microservices and supporting components in Google Cloud K8s](#236 installing all our microservices and supporting components in google cloud k8s)  
237. [Demo of eazybank microservices using Google Cloud Kubernetes Cluster](#237 demo of eazybank microservices using google cloud kubernetes cluster)  
238. [Validate Grafana components in Google Cloud Kubernetes Cluster](#238 validate grafana components in google cloud kubernetes cluster)  
239. [Deleting the Google Cloud Kubernetes Cluster](#239 deleting the google cloud kubernetes cluster)  

## 23. Kubernetes Ingress & Service Mesh
240. [Quick introduction to Kubernetes Ingress](#240 quick introduction to kubernetes ingress)  
241. [Deep dive on Kubernetes Ingress & Ingress Controller](#241 deep dive on kubernetes ingress ingress controller)  
242. [Benefits of Kubernetes Ingress & the kind of traffic it handles](#242 benefits of kubernetes ingress the kind of traffic it handles)  
243. [Introduction to Service Mesh & it's capabilities](#243 introduction to service mesh its capabilities)  
244. [Introduction to Service mesh components](#244 introduction to service mesh components)  
245. [Introduction to mTLS & deep dive on how TLS works](#245 introduction to mtls deep dive on how tls works)  
246. [How does mTLS works](#246 how does mtls works)  

## 24. Optimization & Shared Resources
247. [Optimizing Microservices Development with Spring Boot BOM](#247 optimizing microservices development with spring boot bom)  
248. [Shared Libraries in Microservices](#248 shared libraries in microservices)  


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

### 139) Introduction to Observability And Monitoring Of Microservices
Observability is about understanding the internal state of a system by examining its logs, metrics, and traces. Monitoring is about collecting and analyzing this data to ensure the system behaves as expected. Together, they provide end-to-end visibility into microservices health.

### 140) Observability vs Monitoring
Monitoring = Collecting predefined data (CPU, memory, errors).
Observability = Deriving insights about unknown issues by analyzing logs, metrics, and traces.
👉 Observability is broader; monitoring is a subset.

### 141) Introduction to centralized logging or Log Aggregation in microservices
In microservices, logs are spread across containers. Centralized logging tools like ELK Stack or Grafana Loki aggregate logs in one place for easier debugging, correlation, and search.

### 142) Introduction to managing logs with Grafana, Loki & Alloy
Loki → log aggregation system.
Grafana → visualization & dashboards.
Alloy → log shipping agent.
They work together to provide a lightweight, cost-efficient alternative to ELK stack.

### 143) Sample demo of logging using Grafana, Loki & Alloy
Alloy installed as a sidecar/container.
Logs shipped from microservices → Loki.
Grafana dashboards configured to visualize logs.

### 144) Implementing logging using Grafana, Loki & Alloy
Add Alloy agent in Docker Compose.
Configure Loki endpoint.
Update microservice Dockerfiles to write structured logs.
Connect Grafana with Loki.

### 145) Docker file changes for implementing logging using Grafana, Loki & Alloy. Also, tested using Grafana UI
Modify Dockerfile to include JSON log format.
Use stdout & stderr (not files).
Configure Grafana UI queries to test service-level logs.

### 146) Managing metrics & monitoring with Actuator, Micrometer, Prometheus & Grafana
Spring Boot Actuator → exposes metrics endpoints.
Micrometer → instrumentation library.
Prometheus → stores metrics.
Grafana → visualizes metrics.

### 147) Setup of Micrometer inside microservices
Add dependency: micrometer-registry-prometheus.
Enable Actuator metrics (/actuator/metrics).
Configure custom metrics with @Timed, Counter, Gauge.

### 148) Setup of Prometheus inside microservices
Define prometheus.yml config.
Configure targets (microservice endpoints).
Run Prometheus container with Docker Compose.

### 149) Demo of Prometheus
Access Prometheus UI (http://localhost:9090).
Run queries like http_server_requests_seconds_count.
Verify data scraping from microservices.

### 150) Demo of Prometheus & Grafana integration
Add Prometheus as a data source in Grafana.
Build dashboards (CPU, memory, request latency).
Set alerts for SLA violations.

### 151) Demo of Grafana inbuilt & custom Dashboards
Use inbuilt dashboards for JVM, Spring Boot.
Create custom dashboards with query editor.
Share dashboards with team.

### 152) Create Alerts & Send notifications using Grafana with 2 different Approach
Alert rules in Grafana → email/SMS/Slack notifications.
Alertmanager (Prometheus) integration → advanced alert routing.

### 153) Introduction to Distributed Tracing in microservices
Tracing follows requests across service boundaries, identifying bottlenecks and latency sources.

### 154) Introduction to OpenTelemetry
OpenTelemetry (OTel) is an open standard for collecting telemetry data (logs, metrics, traces). Supported by Prometheus, Grafana, and Jaeger.

### 155) Implement OpenTelemetry changes inside microservices
Add opentelemetry-javaagent.jar.
Configure exporter (OTLP → Tempo/Jaeger).
Inject tracing context in REST calls via headers.

### 156) Implementing Tracing using Grafana, Tempo & OpenTelemetry
Tempo stores traces.
Logs/metrics linked to traces via correlation IDs.
Grafana integrates Tempo for trace visualization.

### 157) Navigating to Tempo from Loki logs
From a log entry in Loki → click trace ID → jump to Tempo → visualize end-to-end request journey.

### 158) Conclusion of Observability and Monitoring
Observability ensures debuggability, reliability, and performance optimization by combining logs, metrics, and traces with tools like Grafana, Loki, Prometheus, and Tempo.

### 159) Introduction to Microservices Security
Security ensures services are confidential, authenticated, and authorized. Managed via OAuth2, OpenID Connect, and IAM tools like Keycloak.

### 160) Problems that OAuth2 solves
Delegated access (apps act on behalf of users).
Eliminates sharing credentials.
Centralized token-based authentication.

### 161) Introduction to OAuth2
OAuth2 is an authorization framework allowing applications to access resources via access tokens.

### 162) OAuth2 jargons or terminologies or roles
Resource Owner → user.
Client → application.
Resource Server → API.
Authorization Server → issues tokens.

### 163) What is OpenID Connect & why it is important
OpenID Connect = OAuth2 + Identity layer.
Provides authentication + user profile info.
Enables SSO (Single Sign-On).

### 164) Introduction to IAM products & why KeyCloak
IAM manages identity, roles, policies.
Keycloak is open-source, supports OAuth2, OIDC, SAML, and integrates easily with Spring Boot.

### 165) Deep dive of Client Credentials grant type flow
Used for service-to-service authentication.
Client authenticates directly with Auth Server → receives access token.

### 166) Securing Gateway server using Client Credentials grant type flow
Gateway acts as client.
Uses client ID/secret to fetch tokens from Keycloak.
Validates tokens for downstream services.

### 167) Setup Auth server using KeyCloak
Run Keycloak in Docker.
Create Realm, Client, Roles, Users.
Configure token settings.

### 168) Register client details inside KeyCloak for Client credentials grant flow
Register microservice as client.
Assign roles.
Enable "Service Accounts" for client credentials.

### 169) Getting Access token from Auth Server in Client credentials grant flow
Use POST /realms/{realm}/protocol/openid-connect/token.
Pass client ID/secret.
Receive access token.

### 170) Securing Gateway server as a Resource server
Enable Spring Security Resource Server.
Configure JWT decoder with Keycloak public key.
Protect APIs with @PreAuthorize.

### 171) Implement Authorization inside Gateway server using Roles
Map Keycloak roles → Spring Security roles.
Use annotations (@PreAuthorize("hasRole('ADMIN')")).
Role-based access enforcement.

### 172) Deep dive of Authorization Code grant type flow
User logs in via Auth Server → redirected to app with code → app exchanges code for token.
Used for user login flows.

### 173) Securing Gateway server using Authorization Code grant type flow
Configure Spring Security OAuth2 client.
Redirect to Keycloak login.
Fetch user tokens and forward to microservices.

### 174) Register client & end user inside KeyCloak for Authorization code grant flow
Create client with redirect URIs.
Register users in realm.
Enable login with username/password.

### 175) Demo of Authorization code grant type flow
Run Gateway → redirect to Keycloak login.
Login → redirected back with code → access microservices securely.

### 176) Demo of Microservices Security using Docker containers & Docker compose
Run Keycloak + Gateway + services in Docker Compose.
End-to-end secure microservices demo.

### 177) Introduction to Event-driven microservices
Event-driven = services communicate asynchronously via events instead of REST. Improves decoupling, scalability, and resilience.

### 178) Introduction to Event-driven models
Pub/Sub model (publishers, subscribers).
Event streaming (continuous stream processing).

### 179) What we are going to build using a pub sub model
Build a Message Service publishing events → Accounts & Notifications services subscribe and react asynchronously.

### 180) Introduction to RabbitMQ
RabbitMQ is a message broker supporting AMQP protocol. Provides queues, exchanges, routing keys.

### 181) Why to use Spring Cloud Function
Promotes functional programming style.
Abstracts vendor-specific code.
Easily integrates with Spring Cloud Stream.

### 182) Develop message microservice using Spring Cloud Functions
Define Function<Message, Message>.
Publish messages via RabbitMQ.
Consumers automatically subscribed.

### 183) Why to use Spring Cloud Stream
Abstracts messaging middleware (Kafka, RabbitMQ).
Provides simple binder-based integration.
Allows switching brokers with minimal config.

### 184) Update message & accounts microservices to stream & process the events
Configure Spring Cloud Stream bindings.
Accounts service subscribes to messages.
Process data asynchronously.

### 185) Demo of Async communication or event streaming using Rabbit MQ
Publish event in Message service.
Accounts service processes event in real-time.
Verified using RabbitMQ UI.

### 186) Demo of Async comm or event streaming using Docker containers & Docker compose
Run RabbitMQ container + services in Compose.
End-to-end event streaming across services.

### 187) Apache Kafka Vs RabbitMQ
RabbitMQ → traditional broker, good for queues.
Kafka → distributed log, great for high throughput streaming.

### 188) Introduction to Apache Kafka
Kafka is a distributed event streaming platform with brokers, topics, partitions, producers, consumers.

### 189) Producer and Consumer side stories
Producer → publishes events to topic.
Consumer → subscribes to topics, processes events.

### 190) Installation of Apache Kafka
Run Kafka with Zookeeper in Docker.
Create topics.
Configure services.

### 191) Implement & Demo of Async communication or event streaming using Kafka
Publish messages from Message service.
Accounts service consumes them.
Verified with Kafka CLI commands.

### 192) Demo of Async comm or event streaming using Docker containers & Docker Compose
Run Kafka, Zookeeper, services in Docker Compose.
Validate async streaming end-to-end.

### 193) Introduction to the challenges related to container orchestration
Managing scaling, networking, storage, resilience.
Ensuring security, monitoring, upgrades.

### 194) Introduction to Kubernetes
Kubernetes (K8s) is an open-source container orchestration platform. Provides scaling, load balancing, self-healing, and automation.

### 195) Deep dive on Kubernetes internal architecture
Master components (API Server, Scheduler, Controller Manager, ETCD).
Worker nodes (Kubelet, Kube Proxy, Pods).

### 196) Setup a local Kubernetes cluster using Docker Desktop
Enable Kubernetes in Docker Desktop.
Verify using kubectl get nodes.

### 197) Deploying the Kubernetes Dashboard UI
Install dashboard YAML.
Access via kubectl proxy.
View pods, services, deployments.

### 198) Deep dive on Kubernetes YAML configurations to deploy a microservice
Deployment → replicas, strategy.
Service → expose pods.
ConfigMap/Secret → externalize configs.

### 199) Deploying ConfigServer into Kubernetes Cluster
Create deployment YAML for ConfigServer.
Use Service to expose internally.

### 200) Create environment variables inside Kubernetes Cluster using ConfigMap
Define configmap.yaml.
Mount as env variables in pod.

### 201) Preparing Kubernetes manifest files for remaining microservices
Write YAML for Accounts, Loans, Cards.
Define services + deployments.

### 202) Deploying remaining microservices into Kubernetes Cluster
Apply manifests via kubectl apply -f.
Verify pods running.

### 203) Automatic Self healing inside Kubernetes cluster
If pod fails → kubelet restarts automatically.
Ensures high availability.

### 204) Automatic Rollout & Rollback inside Kubernetes cluster
kubectl rollout allows gradual deployment.
Rollback in case of failure.

### 205) Introduction to Kubernetes Service types
ClusterIP → internal only.
NodePort → exposed on nodes.
LoadBalancer → external traffic.

### 206) Demo of Kubernetes Service types
Deploy test services.
Expose with ClusterIP, NodePort, LoadBalancer.
Access via browser.

### 207) Problems with manually created Kubernetes manifest files
Manual YAML creation = error-prone, repetitive, hard to scale.
Solution: Helm charts, Kustomize, GitOps.

### 208) Introduction to Helm & the problems that it solves
Helm is a package manager for Kubernetes that simplifies deployment and management of applications. It solves problems like:
Managing large YAML manifests for complex microservices.
Versioning and rolling back deployments.
Reusing templates across environments (Dev/QA/Prod).
Reducing human errors by providing parameterized templates.

### 209) Installing Helm
Download Helm from helm.sh.
Install via package manager (e.g., brew install helm for Mac, choco install kubernetes-helm for Windows).
Verify installation:
helm version

### 210) Installing a sample Helm Chart
Helm provides predefined charts (e.g., nginx).
helm repo add bitnami https://charts.bitnami.com/bitnami
helm install my-nginx bitnami/nginx

This deploys nginx with default values into Kubernetes.

### 211) Understanding Helm Chart structure
A Helm chart has the following structure:
charts/
templates/   # Kubernetes YAML files with placeholders
values.yaml  # Default configuration values
Chart.yaml   # Chart metadata
This modular approach allows parameterization of Kubernetes resources.

### 212) Creating our own Helm chart & template files
We generate a custom chart for our project:
helm create accounts-chart
Modify values.yaml for DB config, replicas, ports.
Adjust templates/deployment.yaml & service.yaml with variables.

### 213) Creating Helm chart for Accounts microservice
The Accounts microservice chart includes:
Deployment (Spring Boot container).
ConfigMap for DB connection.
Service for internal communication.
Ingress for external access.

### 214) Creating Helm charts for other microservices
Similar charts are created for Loans, Cards, Gateway, ConfigServer, Eureka, Kafka, Keycloak, etc.
This ensures consistent deployment across all services.

### 215) Creating Helm charts for Dev, QA and Prod environment
We use values files per environment:
values-dev.yaml → lightweight config, fewer replicas.
values-qa.yaml → stable testing setup.
values-prod.yaml → production-grade (autoscaling, monitoring).
Deploy using:
helm install accounts -f values-prod.yaml ./accounts-chart

### 216) Demo of helm template command
The helm template command renders manifests without applying them:
helm template accounts ./accounts-chart
Useful for debugging YAMLs before applying.

### 217) Install KeyCloak in Kubernetes Cluster using Helm Chart
Deploy Keycloak via Bitnami Helm chart:
helm install keycloak bitnami/keycloak
Used for authentication and authorization of banking services.

### 218) Install Kafka in Kubernetes Cluster using Helm Chart
Deploy Kafka for event-driven microservices:
helm install kafka bitnami/kafka
This powers async communication between services.

### 219) Install Prometheus in Kubernetes Cluster using Helm Chart
Prometheus collects metrics from microservices.
helm install prometheus bitnami/prometheus

### 220) Install Grafana Loki & Tempo in Kubernetes Cluster using Helm Chart
Loki: log aggregation.
Tempo: distributed tracing.
helm install loki grafana/loki-stack
helm install tempo grafana/tempo

### 221) Install Grafana in Kubernetes Cluster using Helm Chart
Grafana is installed to visualize metrics, logs, and traces:
helm install grafana grafana/grafana

### 222) Install eazybank microservices in Kubernetes Cluster using Helm Chart
Custom charts for Accounts, Loans, Cards, Gateway, ConfigServer are installed with:
helm install accounts ./accounts-chart
helm install loans ./loans-chart

### 2### 23) Demo of helm upgrade command
Upgrade running services without downtime:
helm upgrade accounts ./accounts-chart

### 224) Demo of helm history and rollback commands
Check deployment history:
helm history accounts
Rollback to version 1:
helm rollback accounts 1

### 225) Demo of helm uninstall command
Uninstall service:
helm uninstall accounts

### 226) Quick revision of important helm commands
helm install → deploy chart.
helm upgrade → upgrade release.
helm rollback → rollback release.
helm uninstall → remove release.
helm history → view version history.
helm template → preview manifests.

### 227) Introduction to Server-side service discovery and load balancing
Kubernetes handles service discovery internally using DNS-based discovery and load balancing using ClusterIP, NodePort, LoadBalancer services.

### 228) How to setup discovery server in K8s cluster using Spring Cloud Kubernetes
Spring Cloud Kubernetes allows microservices to auto-discover each other using ConfigMaps and Kubernetes Services, avoiding Eureka when inside K8s.

### 229) Install spring cloud kubernetes discovery server in K8s cluster
Discovery server Helm chart deployed with:
helm install discovery ./discovery-chart

### 230) Making Kubernetes Discovery Client changes in microservices
Update pom.xml:
<dependency>
  <groupId>org.springframework.cloud</groupId>
  <artifactId>spring-cloud-starter-kubernetes-client-all</artifactId>
</dependency>
Enable via bootstrap.yaml.

### 231) Updating Helm charts for Kubernetes Discovery Server changes
Modify service Helm charts to remove Eureka configs and rely on Kubernetes DNS discovery.

### 232) Demo of Server-side service discovery and load balancing
Deploy services and validate:
kubectl get svc
Access services by DNS: http://accounts.default.svc.cluster.local.

### 233) Kubernetes support by Cloud providers
GCP: GKE (Google Kubernetes Engine).
AWS: EKS (Elastic Kubernetes Service).
Azure: AKS (Azure Kubernetes Service).
These offer managed K8s clusters with auto-scaling, security, monitoring.

### 234) Set up Google Cloud account & install Google Cloud SDK
Create free GCP account.
Install SDK:
gcloud init

### 235) Create a Kubernetes cluster in Google Cloud
gcloud container clusters create eazybank-cluster --zone=us-central1-a

### 236) Installing all our microservices and supporting components in Google Cloud K8s
Use Helm to install all services:
helm install accounts ./accounts-chart --namespace eazybank
helm install keycloak ./keycloak-chart

### 237) Demo of eazybank microservices using Google Cloud Kubernetes Cluster
Access services via LoadBalancer IPs.
Validate that Accounts, Loans, and Cards microservices interact seamlessly.

### 238) Validate Grafana components in Google Cloud Kubernetes Cluster
Check dashboards for metrics, logs, and tracing inside GCP-managed Grafana.

### 239) Deleting the Google Cloud Kubernetes Cluster
gcloud container clusters delete eazybank-cluster --zone=us-central1-a

### 240) Quick introduction to Kubernetes Ingress
Ingress is a Kubernetes resource that manages external access (HTTP/HTTPS) to services inside the cluster.

### 241) Deep dive on Kubernetes Ingress & Ingress Controller
Ingress Resource → defines rules for routing traffic.
Ingress Controller (e.g., Nginx) → enforces rules and provides SSL termination.

### 242) Benefits of Kubernetes Ingress & the kind of traffic it handles
Consolidates routing in one place.
Supports SSL/TLS termination.
Handles HTTP and HTTPS traffic.
Reduces need for multiple LoadBalancers.

### 243) Introduction to Service Mesh & it's capabilities
Service Mesh (e.g., Istio, Linkerd) adds observability, traffic control, retries, circuit breaking, mTLS between microservices.

### 244) Introduction to Service mesh components
Data Plane → sidecar proxies (Envoy).
Control Plane → manages policies, configurations, and observability.

### 245) Introduction to mTLS & deep dive on how TLS works
TLS encrypts communication between client and server. mTLS (mutual TLS) ensures both client and server authenticate each other, increasing security.

### 246) How does mTLS works
Client requests connection → sends certificate.
Server validates client cert.
Server sends its certificate → client validates.
Secure encrypted channel established.

### 247) Optimizing Microservices Development with Spring Boot BOM
BOM (Bill of Materials) manages common dependencies.
Ensures consistency across microservices without version conflicts.
Example:
<dependencyManagement>
   <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-dependencies</artifactId>
     <version>3.2.0</version>
     <type>pom</type>
     <scope>import</scope>
   </dependency>
</dependencyManagement>

### 248) Shared Libraries in Microservices
We create shared libraries for common code (DTOs, exception handling, utilities).
Reduces duplication.
Speeds up development.
Ensures consistency across services.

---

## 🚀 Conclusion

This repository demonstrates the **end-to-end lifecycle of microservice development**, from REST API design to containerization, centralized configuration, and service discovery. By following the documented steps, developers can replicate and extend the project for real-world enterprise use cases.

---
