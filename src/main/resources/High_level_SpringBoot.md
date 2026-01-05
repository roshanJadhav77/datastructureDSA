
# Spring Boot Interview Questions and Answers

## 1. What is Spring Boot and what are its main features?

Spring Boot is an extension of the Spring Framework that simplifies the development of production-ready applications.[1]
Its main **features** include:[1]
- Auto-configuration based on dependencies present in the classpath
- Standalone applications with embedded servers (Tomcat, Jetty, Undertow)
- Opinionated defaults to reduce configuration
- Production-ready features like metrics, health checks, and externalized configuration (Actuator)
- No XML or code generation
- Starter dependencies for simplified dependency management

***

## 2. What are the advantages of Spring Boot over the Spring Framework?

Spring Boot provides several advantages over traditional Spring Framework:[1]
- Reduced boilerplate and minimal configuration
- Embedded server, so no need to deploy WAR files to external servers
- Simplified dependency management via starters, reducing version conflicts
- Auto-configuration using intelligent defaults
- Built-in Actuator for monitoring and management
- Faster project setup using Spring Initializr
- Well-suited for microservices and cloud-native applications

***

## 3. What is the use and effect of the `@SpringBootApplication` annotation?

`@SpringBootApplication` is a convenience annotation that combines three annotations.[1]
- `@Configuration`: Marks the class as a source of bean definitions
- `@EnableAutoConfiguration`: Enables Spring Boot auto-configuration
- `@ComponentScan`: Enables component scanning in the current package and sub-packages

It is typically placed on the main application class and acts as the entry point, triggering component scanning, auto-configuration, and bean registration when the application starts.[1]

***

## 4. What is Spring Initializr and how is it used?

Spring Initializr (start.spring.io) is a web-based tool that generates Spring Boot project structures.[1]
It allows developers to:[1]
- Set project metadata (group, artifact, name)
- Choose build tool (Maven or Gradle) and Java version
- Select dependencies (Spring Web, JPA, Security, etc.)
- Choose packaging (JAR or WAR)

It generates a pre-configured project with directory structure, build files, and main application class so development can start immediately.[1]

***

## 5. Explain the concept of Spring Boot Starters.

Spring Boot Starters are pre-configured dependency descriptors that bundle commonly used libraries.[1]
Benefits:[1]
- Simplified dependency management (one starter pulls multiple libraries)
- Ensures compatible versions
- Reduces explicit configuration

Common starters include:[1]
- `spring-boot-starter-web` (Spring MVC, Tomcat, Jackson)
- `spring-boot-starter-data-jpa` (JPA, Hibernate)
- `spring-boot-starter-security` (Spring Security)
- `spring-boot-starter-test` (JUnit, Mockito, etc.)

***

## 6. How does auto-configuration work in Spring Boot?

Auto-configuration works by conditionally registering beans based on the classpath and environment.[1]
Key points:[1]
- Classpath scanning detects available libraries
- Conditional annotations like `@ConditionalOnClass`, `@ConditionalOnMissingBean`, `@ConditionalOnProperty` control configuration
- Auto-configuration classes are listed in `META-INF/spring.factories` inside starter JARs
- Provides sensible defaults that can be overridden by custom bean definitions

For example, if H2 is on the classpath, Spring Boot auto-configures an in-memory database.[1]

***

## 7. What is the purpose of embedded servers in Spring Boot?

Embedded servers (Tomcat, Jetty, Undertow) allow applications to run as standalone JARs.[1]
Purposes:[1]
- Standalone deployment without external application servers
- Simplified deployment (no WAR packaging)
- Consistent runtime environment across environments
- Ideal for microservices (each service has its own server)
- Faster development cycle with quick restarts

Tomcat is the default embedded server but can be replaced with Jetty or Undertow by changing dependencies.[1]

***

## 8. How can you change the default port of the embedded server?

You can change the default port (8080) in several ways.[1]

**`application.properties`**:
```properties
server.port=9090
```

**`application.yml`**:
```yaml
server:
  port: 9090
```

**Command line**:
```bash
java -jar application.jar --server.port=9090
```

**Environment variable**:
```bash
SERVER_PORT=9090
```

**Programmatically**:
```java
@Configuration
public class ServerConfig implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {

    @Override
    public void customize(ConfigurableWebServerFactory factory) {
        factory.setPort(9090);
    }
}
```

Setting `server.port=0` will assign a random available port, useful for tests and multiple instances.[1]

***

## 9. What is the difference between `@Controller` and `@RestController`?

- `@Controller`: Used for traditional MVC controllers returning view names (e.g. HTML pages). Methods that return data typically use `@ResponseBody`.[1]
- `@RestController`: Combines `@Controller` and `@ResponseBody`, and every method returns data (usually JSON) directly instead of a view.[1]

Example:
```java
// Traditional Controller
@Controller
public class WebController {

    @GetMapping("/page")
    public String getPage() {
        return "homepage"; // returns view name
    }

    @GetMapping("/data")
    @ResponseBody
    public User getData() {
        return new User(); // returns JSON
    }
}

// REST Controller
@RestController
public class ApiController {

    @GetMapping("/users")
    public List<User> getUsers() {
        return userList; // automatically returns JSON
    }
}
```


***

## 10. What are Spring Profiles and how are they used?

Spring Profiles allow environment-specific configurations and bean activation.[1]
Use cases:[1]
- Different configurations for dev, test, prod
- Activate beans only for specific profiles
- Use profile-specific property files like `application-dev.properties`

Example activation:
```properties
spring.profiles.active=dev,mysql
```

Example profile-specific beans:
```java
@Configuration
@Profile("dev")
public class DevConfig {
    @Bean
    public DataSource dataSource() {
        return new H2DataSource();
    }
}

@Configuration
@Profile("prod")
public class ProdConfig {
    @Bean
    public DataSource dataSource() {
        return new MySQLDataSource();
    }
}
```

Profile-specific properties can be placed in `application-dev.properties`, `application-prod.properties`, etc.[1]

***

## 11. What are the basic annotations used in Spring Boot?

Essential annotations include:[1]
- `@Component`: Generic Spring-managed component
- `@Service`: Service-layer component
- `@Repository`: Data access layer component, enables exception translation
- `@Controller`: MVC controller
- `@RestController`: Combines `@Controller` and `@ResponseBody`
- `@Autowired`: Dependency injection
- `@Configuration`: Configuration class with bean definitions
- `@Bean`: Declares a method that returns a Spring bean
- `@Value`: Injects property values
- `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`: HTTP method-specific request mappings

[1]

***

## 12. What is the difference between `@Component`, `@Service`, and `@Repository`?

All three are specializations of `@Component` but with different semantics.[1]
- `@Component`: Generic Spring-managed component when no other stereotype fits
- `@Service`: Indicates a class holds business logic, used at the service layer
- `@Repository`: Indicates a DAO; adds automatic translation of persistence exceptions into `DataAccessException`

Using specific stereotypes improves readability and allows Spring to apply specific behaviors.[1]

***

## 13. What is YAML configuration in Spring Boot and how is it different from properties files?

YAML is a human-readable data serialization format that Spring Boot supports as an alternative to `.properties`.[1]

**Properties example**:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/db
spring.datasource.username=root
spring.datasource.password=pass
server.port=8080
```

**YAML example**:
```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/db
    username: root
    password: pass
server:
  port: 8080
```

Differences:[1]
- YAML uses indentation-based hierarchy; properties use dot notation
- YAML is more readable for complex config and lists
- YAML supports lists natively
- YAML can contain multiple profiles separated by `---`

***

## 14. How do you exclude a specific auto-configuration class?

You can exclude auto-configuration using annotations or properties.[1]

**Using `@SpringBootApplication`**:
```java
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

**Using `@EnableAutoConfiguration`**:
```java
@Configuration
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class AppConfig {
}
```

**Using properties**:
```properties
spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
```

Multiple exclusions can be specified in the annotation array.[1]

***

## 15. Can you create a non-web Spring Boot application? How?

Yes, you can create console or batch applications by implementing `CommandLineRunner` or `ApplicationRunner`.[1]

```java
@SpringBootApplication
public class ConsoleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ConsoleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Console application started");
        // Business logic here
    }
}
```

Using `ApplicationRunner`:
```java
@Component
public class MyRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> nonOptionArgs = args.getNonOptionArgs();
        // Use parsed args
    }
}
```

You can also set `spring.main.web-application-type=none` or exclude web starter dependencies.[1]

***

## 16. What is dependency management in Spring Boot and how is it simplified?

Spring Boot simplifies dependency management via:[1]
- Parent POM `spring-boot-starter-parent`
- BOM (Bill of Materials) for managing compatible versions
- Starter dependencies to group related libraries
- No need to specify versions for managed dependencies

Example:
```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.2.0</version>
</parent>

<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>
```

This reduces version conflicts and ensures compatibility.[1]

***

## 17. What is the role of `@ComponentScan` in Spring Boot?

`@ComponentScan` tells Spring where to search for components, configurations, and services.[1]
Key points:[1]
- By default, it scans the package of the annotated class and its sub-packages
- You can specify base packages or base package classes
- It is included in `@SpringBootApplication` by default

Examples:
```java
// Default
@SpringBootApplication
public class Application {
}

// Custom packages
@Configuration
@ComponentScan(basePackages = {"com.example.service", "com.example.repository"})
public class AppConfig {
}

// Using marker classes
@ComponentScan(basePackageClasses = {ServiceMarker.class, RepoMarker.class})
public class AppConfig {
}

// Excluding certain components
@ComponentScan(
  basePackages = "com.example",
  excludeFilters = @Filter(type = FilterType.REGEX, pattern = "com.example.exclude.*")
)
public class AppConfig {
}
```


***

## 18. What is the flow of HTTP requests through a Spring Boot application?

Typical HTTP request flow:[1]
1. `DispatcherServlet` receives the HTTP request
2. HandlerMapping determines which controller method should handle it
3. Pre-handler interceptors (authentication, logging) run
4. Controller executes and calls service layer
5. Service executes business logic and calls repository layer
6. Repository performs data access
7. Controller returns data or view name
8. ViewResolver resolves view for MVC responses
9. Post-handler interceptors run
10. Response is serialized to JSON/XML or view is rendered
11. Client receives HTTP response

***

## 19. How do you enable debug logs in a Spring Boot application?

You can enable debug logging via properties, YAML, command line, or Logback.[1]

**`application.properties`**:
```properties
logging.level.root=DEBUG
logging.level.org.springframework.web=DEBUG
logging.level.com.example.myapp=DEBUG
```

**`application.yml`**:
```yaml
logging:
  level:
    root: DEBUG
    org.springframework.web: DEBUG
    com.example.myapp: DEBUG
```

**Command line**:
```bash
java -jar app.jar --debug
java -jar app.jar --logging.level.root=DEBUG
```

You can also set `debug=true` or configure `logback-spring.xml`. Spring Boot debug mode shows an auto-configuration report.[1]

***

## 20. How does Spring Boot handle externalized configurations?

Spring Boot supports multiple configuration sources with a precedence order.[1]
Higher priority overrides lower:[1]
1. Command line arguments
2. Java system properties
3. OS environment variables
4. Profile-specific properties (`application-{profile}.properties`)
5. Application properties (`application.properties`/`.yml`)
6. `@PropertySource`
7. Default properties

Examples:
```bash
export DATABASE_URL=jdbc:mysql://prod-db:3306/mydb

java -jar app.jar --server.port=9090 --spring.profiles.active=prod
```

`application.properties`:
```properties
server.port=8080
app.name=MyApp
```

Injecting values:
```java
@Value("${app.name}")
private String appName;

@ConfigurationProperties(prefix = "app")
public class AppProperties {
    private String name;
    // getters/setters
}
```


***

## 21. How do you integrate and configure a relational database like MySQL?

Integration steps:[1]

**Dependencies (`pom.xml`)**:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
</dependency>
```

**`application.properties`**:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=root
spring.datasource.password=password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

spring.datasource.hikari.maximum-pool-size=10
spring.datasource.hikari.minimum-idle=5
```

Spring Boot auto-configures `DataSource`, JPA, and transaction management based on these properties.[1]

***

## 22. What is Spring Data JPA and how does it relate to Hibernate?

Spring Data JPA is a module that simplifies data access by providing repository abstractions on top of JPA.[1]
Key features:[1]
- Eliminates boilerplate DAO code
- Uses JPA provider (Hibernate by default)
- Supports query derivation from method names and custom JPQL/native queries

Example:
```java
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String name;
}

// Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByEmail(String email);

    List<User> findByNameContaining(String name);

    @Query("SELECT u FROM User u WHERE u.age > :age")
    List<User> findUsersOlderThan(@Param("age") int age);
}

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
```
Hibernate handles ORM; Spring Data JPA provides the repository layer.[1]

***

## 23. How do you configure multiple data sources in Spring Boot?

Multiple data sources require explicit configuration.[1]

**`application.properties`**:
```properties
# Primary datasource
spring.datasource.primary.url=jdbc:mysql://localhost:3306/db1
spring.datasource.primary.username=user1
spring.datasource.primary.password=pass1

# Secondary datasource
spring.datasource.secondary.url=jdbc:postgresql://localhost:5432/db2
spring.datasource.secondary.username=user2
spring.datasource.secondary.password=pass2
```

**Configuration class**:
```java
@Configuration
public class DataSourceConfig {

    @Primary
    @Bean
    @ConfigurationProperties("spring.datasource.primary")
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.secondary")
    public DataSource secondaryDataSource() {
        return DataSourceBuilder.create().build();
    }
}
```

Each data source typically has its own `EntityManagerFactory` and `TransactionManager`.[1]

***

## 24. What is the difference between JDBC and JPA in Spring Boot?

**JDBC**:[1]
- Low-level database access using SQL
- Manual query writing and result mapping
- More control and better performance for simple queries
- Often used with `JdbcTemplate` in Spring

**JPA**:[1]
- High-level ORM abstraction
- Automatic SQL generation based on entity mappings
- Automatic object-relational mapping
- Database-independent using dialects
- Supports caching and lazy loading
- Implemented in Spring Boot typically with Hibernate

Use JDBC for simple or performance-critical operations; JPA for complex domain models and rapid development.[1]

***

## 25. How do you integrate a NoSQL database like MongoDB?

MongoDB integration:[1]

**Dependency**:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-mongodb</artifactId>
</dependency>
```

**`application.properties`**:
```properties
spring.data.mongodb.uri=mongodb://localhost:27017/mydb
spring.data.mongodb.database=mydb
```

**Document entity**:
```java
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String name;
    private String email;
}
```

**Repository**:
```java
public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByName(String name);
    List<User> findByEmailContaining(String email);
}
```

**Service**:
```java
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
```
Spring Data MongoDB provides a repository abstraction similar to Spring Data JPA.[1]

***

## 26. How do you build RESTful APIs using Spring Boot?

You build RESTful APIs by using `@RestController` and request mapping annotations.[1]

```java
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // GET all users
    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    // GET user by ID
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return userService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST create user
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody @Valid User user) {
        User created = userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    // PUT update user
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id,
                                           @RequestBody User user) {
        return userService.update(id, user)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE user
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
```


***

## 27. How is exception handling done in Spring Boot REST APIs?

Use `@ControllerAdvice` with `@ExceptionHandler` to create global exception handlers.[1]

```java
// Custom exception
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}

// Error response DTO (example)
public class ErrorResponse {
    private int status;
    private String message;
    private long timestamp;
    private Map<String, String> errors;
    // constructors, getters, setters
}

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFound(ResourceNotFoundException ex) {
        ErrorResponse error = new ErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                ex.getMessage(),
                System.currentTimeMillis()
        );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationException(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors()
                .forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));

        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                "Validation failed",
                System.currentTimeMillis()
        );
        errorResponse.setErrors(errors);
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGlobalException(Exception ex) {
        ErrorResponse error = new ErrorResponse(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Internal server error",
                System.currentTimeMillis()
        );
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
```


***

## 28. What is HATEOAS and how might you implement it?

HATEOAS (Hypermedia As The Engine Of Application State) enriches REST responses with navigational links.[1]

**Dependency**:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-hateoas</artifactId>
</dependency>
```

**Example**:
```java
@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/{id}")
    public EntityModel<User> getUserById(@PathVariable Long id) {
        User user = userService.findById(id);

        EntityModel<User> model = EntityModel.of(user);
        model.add(linkTo(methodOn(UserController.class).getUserById(id)).withSelfRel());
        model.add(linkTo(methodOn(UserController.class).getAllUsers()).withRel("all-users"));
        model.add(linkTo(methodOn(OrderController.class).getUserOrders(id)).withRel("orders"));

        return model;
    }
}
```

Sample response contains `_links` with `self`, `all-users`, and `orders` links, making the API more discoverable.[1]

***

## 29. How do you version REST APIs in Spring Boot?

Common API versioning strategies:[1]
- URI versioning
- Request parameter versioning
- Header versioning
- Content negotiation (Accept header)

Examples:
```java
// URI versioning
@RestController
@RequestMapping("/api/v1/users")
public class UserControllerV1 {
}

@RestController
@RequestMapping("/api/v2/users")
public class UserControllerV2 {
}

// Request parameter versioning
@GetMapping(value = "/users", params = "version=1")
public List<UserV1> getUsersV1() { }

@GetMapping(value = "/users", params = "version=2")
public List<UserV2> getUsersV2() { }

// Header versioning
@GetMapping(value = "/users", headers = "X-API-VERSION=1")
public List<UserV1> getUsersV1() { }

// Content negotiation versioning
@GetMapping(value = "/users", produces = "application/vnd.company.app-v1+json")
public List<UserV1> getUsersV1() { }

@GetMapping(value = "/users", produces = "application/vnd.company.app-v2+json")
public List<UserV2> getUsersV2() { }
```
URI versioning is explicit and widely used; content negotiation is more RESTful but more complex.[1]

***

## 30. What are some best practices for designing microservices with Spring Boot?

Important best practices:[1]
- Single responsibility per service
- Loose coupling and independent deployment
- API Gateway (e.g. Spring Cloud Gateway) for routing and cross-cutting concerns
- Service discovery (Eureka, Consul)
- Centralized configuration with Spring Cloud Config
- Circuit breakers (Resilience4j) for fault tolerance
- Distributed tracing (Sleuth, Zipkin)
- Database per service
- Asynchronous communication via message brokers
- Health checks via Actuator
- Containerization (Docker)
- Security with OAuth2/JWT
- Monitoring with Prometheus and Grafana

***

## 31. What is microservices architecture and how does Spring Boot support it?

Microservices architecture splits an application into small, independent services that communicate over the network.[1]
Spring Boot supports this via:[1]
- Standalone JARs with embedded servers
- Spring Cloud for distributed systems patterns (Config, Gateway, Eureka, etc.)
- RESTful APIs for service communication
- Actuator for health and metrics

Key microservice characteristics: independent deployment, scalability, technology diversity, fault isolation, and business capability orientation.[1]

***

## 32. How do you implement inter-service communication in microservices?

Inter-service communication can be synchronous or asynchronous.[1]

**Synchronous – RestTemplate**:
```java
@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    public User getUser(Long userId) {
        return restTemplate.getForObject(
                "http://user-service/api/users/" + userId,
                User.class
        );
    }
}
```

**Synchronous – WebClient (reactive)**:
```java
@Service
public class OrderService {

    @Autowired
    private WebClient.Builder webClientBuilder;

    public Mono<User> getUser(Long userId) {
        return webClientBuilder.build()
                .get()
                .uri("http://user-service/api/users/" + userId)
                .retrieve()
                .bodyToMono(User.class);
    }
}
```

**Synchronous – Feign Client**:
```java
@FeignClient(name = "user-service")
public interface UserClient {

    @GetMapping("/api/users/{id}")
    User getUserById(@PathVariable Long id);
}
```

**Asynchronous – Message Queue (RabbitMQ)**:
```java
@Service
public class OrderService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void createOrder(Order order) {
        rabbitTemplate.convertAndSend("order-exchange", "order.created", order);
    }
}
```
Use synchronous calls for immediate results; asynchronous messaging for decoupling and resilience.[1]

***

## 33. How do you integrate message brokers like Kafka and RabbitMQ?

### RabbitMQ

**Dependency**:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-amqp</artifactId>
</dependency>
```

**Configuration**:
```properties
spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672
spring.rabbitmq.username=guest
spring.rabbitmq.password=guest
```

**Producer**:
```java
@Service
public class MessageProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend("my-exchange", "routing-key", message);
    }
}
```

**Consumer**:
```java
@Component
public class MessageConsumer {

    @RabbitListener(queues = "my-queue")
    public void receiveMessage(String message) {
        System.out.println("Received: " + message);
    }
}
```


### Kafka

**Dependency**:
```xml
<dependency>
    <groupId>org.springframework.kafka</groupId>
    <artifactId>spring-kafka</artifactId>
</dependency>
```

**Configuration**:
```properties
spring.kafka.bootstrap-servers=localhost:9092
spring.kafka.consumer.group-id=my-group
```

**Producer**:
```java
@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        kafkaTemplate.send("my-topic", message);
    }
}
```

**Consumer**:
```java
@Component
public class KafkaConsumer {

    @KafkaListener(topics = "my-topic", groupId = "my-group")
    public void listen(String message) {
        System.out.println("Received: " + message);
    }
}
```


***

## 34. What is service discovery and how is it implemented with Spring Cloud?

Service discovery lets services find each other without hardcoded URLs.[1]
Spring Cloud typically uses Netflix Eureka.[1]

### Eureka Server

**Dependency**:
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>
```

**Application**:
```java
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
}
```

**Properties**:
```properties
server.port=8761
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
```

### Eureka Client

**Dependency**:
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
```

**Application**:
```java
@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceApplication {
}
```

**Properties**:
```properties
spring.application.name=user-service
eureka.client.service-url.defaultZone=http://localhost:8761/eureka
```

**Load-balanced RestTemplate**:
```java
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    public User getUser(Long id) {
        return restTemplate.getForObject(
                "http://user-service/api/users/" + id,
                User.class
        );
    }
}
```


***

## 35. What is the circuit breaker pattern and how is it used?

A circuit breaker prevents cascading failures by stopping calls to a failing service and providing fallbacks.[1]
Resilience4j is recommended for Spring Boot.[1]

**Dependency**:
```xml
<dependency>
    <groupId>io.github.resilience4j</groupId>
    <artifactId>resilience4j-spring-boot2</artifactId>
</dependency>
```

**Configuration (`application.yml`)**:
```yaml
resilience4j:
  circuitbreaker:
    instances:
      userService:
        slidingWindowSize: 10
        failureRateThreshold: 50
        waitDurationInOpenState: 10000
        permittedNumberOfCallsInHalfOpenState: 3
```

**Usage**:
```java
@Service
public class OrderService {

    @CircuitBreaker(name = "userService", fallbackMethod = "getUserFallback")
    public User getUser(Long id) {
        return restTemplate.getForObject(
                "http://user-service/api/users/" + id,
                User.class
        );
    }

    public User getUserFallback(Long id, Exception ex) {
        return new User(id, "Default User", "default@email.com");
    }
}
```

Circuit breaker states: Closed (normal), Open (short-circuit), Half-Open (trial). Resilience4j also supports Retry, RateLimiter, Bulkhead, and TimeLimiter.[1]

***

## 36. What is the purpose of Spring Boot Actuator and how do you enable it?

Actuator provides production-ready monitoring and management features.[1]

**Dependency**:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

**`application.properties`**:
```properties
# Expose all endpoints
management.endpoints.web.exposure.include=*

# Or expose specific ones
# management.endpoints.web.exposure.include=health,info,metrics

management.endpoints.web.base-path=/actuator
management.endpoint.health.show-details=always
```

Key features: health checks, metrics, environment info, thread/heap dumps, HTTP tracing.[1]

***

## 37. What are some key Actuator endpoints?

Important endpoints:[1]
- `/actuator/health` – overall health (UP, DOWN, etc.)
- `/actuator/info` – custom application info
- `/actuator/metrics` – JVM, HTTP, and custom metrics
- `/actuator/beans` – all beans in the context
- `/actuator/env` – environment and config properties
- `/actuator/mappings` – all request mappings
- `/actuator/loggers` – view/update logging levels at runtime
- `/actuator/threaddump` – thread dump
- `/actuator/heapdump` – heap dump
- `/actuator/httptrace` – recent HTTP calls
- `/actuator/prometheus` – Prometheus metrics format

Endpoints should be secured in production. Custom health indicators can be created via `HealthIndicator`.[1]

***

## 38. How can you optimize Spring Boot startup time?

Startup optimization strategies:[1]
- Enable lazy initialization: `spring.main.lazy-initialization=true`
- Exclude unused auto-configurations and starters
- Reduce component scan scope
- Use profiles to load only necessary beans
- Optimize dependencies, remove unused libraries
- Disable Actuator where not needed in dev
- JVM tuning (heap size, GC)
- Use Class Data Sharing (CDS) or AOT/native image (Spring Native)

Example properties:
```properties
spring.main.lazy-initialization=true
spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
```

JVM example:
```bash
java -XX:+UseSerialGC -Xss256k -Xms64m -Xmx512m -jar app.jar
```


***

## 39. How do you implement caching in Spring Boot?

Spring Boot provides a caching abstraction with multiple backends.[1]

**Dependency**:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-cache</artifactId>
</dependency>
```

**Enable caching**:
```java
@SpringBootApplication
@EnableCaching
public class Application {
}
```

**Service with caching**:
```java
@Service
public class UserService {

    @Cacheable(value = "users", key = "#id")
    public User getUserById(Long id) {
        return userRepository.findById(id); // expensive call
    }

    @CachePut(value = "users", key = "#user.id")
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @CacheEvict(value = "users", key = "#id")
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @CacheEvict(value = "users", allEntries = true)
    public void clearCache() {
        // clear all entries
    }
}
```

**Redis configuration**:
```properties
spring.cache.type=redis
spring.redis.host=localhost
spring.redis.port=6379
```

Other providers include Caffeine and Hazelcast. Annotations: `@Cacheable`, `@CachePut`, `@CacheEvict`, `@Caching`.[1]

***

## 40. How do you do distributed tracing or monitoring in Spring Boot microservices?

Distributed tracing tracks requests as they flow across services.[1]

### Spring Cloud Sleuth + Zipkin

**Dependencies**:
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-sleuth</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-sleuth-zipkin</artifactId>
</dependency>
```

**`application.properties`**:
```properties
spring.sleuth.sampler.probability=1.0
spring.zipkin.base-url=http://localhost:9411
```

Logs will include trace and span IDs like:  
`[service-name,trace-id,span-id,true]` for correlation.[1]

### OpenTelemetry

Alternative:
```xml
<dependency>
    <groupId>io.opentelemetry</groupId>
    <artifactId>opentelemetry-spring-boot-starter</artifactId>
</dependency>
```

Monitoring stack can include Prometheus (metrics), Grafana (visualization), Zipkin/Jaeger (tracing), and ELK (logging).[1]

***

If you want, the content can be split into multiple smaller `.md` files (e.g. basics, data-access, microservices) for easier revision.

[1](https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/82407707/6672f626-ae0d-40ca-85a1-fc4433ce9dd0/Springboot_interview_questions.pdf)