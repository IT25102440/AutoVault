# PROJECT_SNAPSHOT.md
> Auto-generated snapshot of the full AutoLane / Car Platform project.

---

## 1. Project File Structure

```
car-platform/
├── CONTEXT.md
├── HELP.md
├── README.md
├── mvnw
├── mvnw.cmd
├── pom.xml
├── uploads/
│   ├── 0f686d95-95dc-4dd6-be3f-5c55327224fc_2016-honda-civic-sdn-touring_100548738.jpg
│   ├── 1e3107a9-7fb6-45a6-84f0-2169fdf869f6_Screenshot_20260507104239.png
│   ├── 42614903-c37a-4302-89b2-9442057198fe_3ipucxsx5923fwu4jzpgo6pj3.jpg
│   ├── 85248824-9ca4-413f-b759-57d6880b6126_sddefault.jpg
│   └── e9d883b0-cd18-4622-b650-76d03564c433_cla_featured_1_2f664ab4e4.jpg
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/carplatform/car_platform/
    │   │       ├── CarPlatformApplication.java
    │   │       ├── config/
    │   │       │   ├── SecurityConfig.java
    │   │       │   └── WebConfig.java
    │   │       ├── controller/
    │   │       │   ├── AdminController.java
    │   │       │   ├── AuthController.java
    │   │       │   ├── HomeController.java
    │   │       │   ├── PageController.java
    │   │       │   └── SellerController.java
    │   │       ├── dto/
    │   │       │   ├── CarDTO.java
    │   │       │   └── UserDTO.java
    │   │       ├── model/
    │   │       │   ├── Admin.java
    │   │       │   ├── Car.java
    │   │       │   ├── Seller.java
    │   │       │   └── User.java
    │   │       ├── repository/
    │   │       │   ├── CarRepository.java
    │   │       │   └── UserRepository.java
    │   │       └── service/
    │   │           ├── CarService.java
    │   │           └── UserService.java
    │   └── resources/
    │       ├── application.properties
    │       ├── static/
    │       │   ├── icns/
    │       │   │   └── favicon.png
    │       │   ├── index.html
    │       │   ├── add-car/
    │       │   │   └── index.html
    │       │   ├── admin-dashboard/
    │       │   │   └── index.html
    │       │   ├── car-detail/
    │       │   │   └── index.html
    │       │   ├── edit-car/
    │       │   │   └── index.html
    │       │   ├── login/
    │       │   │   └── index.html
    │       │   ├── register/
    │       │   │   └── index.html
    │       │   └── seller-dashboard/
    │       │       └── index.html
    │       └── templates/   (empty)
    └── test/
        └── java/
            └── com/carplatform/car_platform/
                └── CarPlatformApplicationTests.java
```

---

## 2. pom.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.5.13</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.carplatform</groupId>
	<artifactId>car-platform</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name/>
	<description/>
	<url/>
	<licenses>
		<license/>
	</licenses>
	<developers>
		<developer/>
	</developers>
	<scm>
		<connection/>
		<developerConnection/>
		<tag/>
		<url/>
	</scm>
	<properties>
		<java.version>17</java.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-validation</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.security</groupId>
			<artifactId>spring-security-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<excludes>
						<exclude>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
						</exclude>
					</excludes>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<executions>
					<execution>
						<id>default-compile</id>
						<phase>compile</phase>
						<goals>
							<goal>compile</goal>
						</goals>
						<configuration>
							<annotationProcessorPaths>
								<path>
									<groupId>org.projectlombok</groupId>
									<artifactId>lombok</artifactId>
								</path>
							</annotationProcessorPaths>
						</configuration>
					</execution>
					<execution>
						<id>default-testCompile</id>
						<phase>test-compile</phase>
						<goals>
							<goal>testCompile</goal>
						</goals>
						<configuration>
							<annotationProcessorPaths>
								<path>
									<groupId>org.projectlombok</groupId>
									<artifactId>lombok</artifactId>
								</path>
							</annotationProcessorPaths>
						</configuration>
					</execution>
				</executions>
			</plugin>
		</plugins>
	</build>

</project>
```

---

## 3. application.properties

```properties
spring.application.name=car-platform

spring.datasource.url=jdbc:mysql://localhost:3306/carplatform
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.servlet.multipart.enabled=true
spring.servlet.multipart.max-file-size=10MB
spring.servlet.multipart.max-request-size=10MB

file.upload-dir=uploads

spring.web.resources.add-mappings=true
spring.mvc.pathmatch.use-suffix-pattern=false
```

---

## 4. Java Source Files

---

## File: src/main/java/com/carplatform/car_platform/CarPlatformApplication.java
```java
package com.carplatform.car_platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarPlatformApplication.class, args);
	}

}
```

---

## File: src/main/java/com/carplatform/car_platform/config/SecurityConfig.java
```java
package com.carplatform.car_platform.config;

import com.carplatform.car_platform.model.User;
import com.carplatform.car_platform.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.util.List;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private final UserRepository userRepository;

    //tell Spring Security how to load a user from the database during login
    @Bean
    public UserDetailsService userDetailsService() {
        return email -> {
            User user = userRepository.findByEmail(email)
                    .orElseThrow(() -> new UsernameNotFoundException("User not found: " + email));
            System.out.println("Loading user: " + user.getEmail() + " role: " + user.getDashboard());
            System.out.println("Password hash length: " + user.getPassword().length());

            return new org.springframework.security.core.userdetails.User(
                    user.getEmail(),
                    user.getPassword(),
                    List.of(new SimpleGrantedAuthority("ROLE_" + user.getDashboard()
                            .replace("-dashboard", "").toUpperCase()))
            );
        };
    }

    //password encoder bean
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(
            UserDetailsService userDetailsService,
            BCryptPasswordEncoder passwordEncoder) throws Exception {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(passwordEncoder);
        return new ProviderManager(provider);
    }

    //define access rules for all endpoints
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(HttpMethod.GET, "/api/cars/**").permitAll()
                        .requestMatchers("/api/auth/register", "/api/auth/login").permitAll()
                        .requestMatchers(
                                "/", "/index.html",
                                "/login", "/login/", "/login/**",
                                "/register", "/register/", "/register/**",
                                "/car-detail", "/car-detail/", "/car-detail/**",
                                "/seller-dashboard", "/seller-dashboard/", "/seller-dashboard/**",
                                "/add-car", "/add-car/", "/add-car/**",
                                "/edit-car", "/edit-car/", "/edit-car/**",
                                "/admin-dashboard", "/admin-dashboard/", "/admin-dashboard/**",
                                "/css/**", "/js/**", "/images/**"
                        ).permitAll()
                        .requestMatchers("/uploads/**").permitAll()
                        .requestMatchers("/api/seller/**").hasRole("SELLER")
                        .requestMatchers("/api/admin/**").hasRole("ADMIN")
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        .loginPage("/login")
                        .loginProcessingUrl("/api/auth/login")
                        .defaultSuccessUrl("/api/auth/me", false)
                        .permitAll()
                        .failureHandler((request, response, exception) -> {
                            response.setStatus(401);
                            response.getWriter().write("{\"message\":\"Invalid email or password\"}");
                        })
                )
                .logout(logout -> logout
                        .logoutUrl("/api/auth/logout")
                        .logoutSuccessHandler((request, response, authentication) -> {
                            response.setStatus(200);
                            response.getWriter().write("{\"message\":\"Logged out successfully\"}");
                        })
                        .permitAll()
                );

        return http.build();
    }
}
```

---

## File: src/main/java/com/carplatform/car_platform/config/WebConfig.java
```java
package com.carplatform.car_platform.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(
            org.springframework.web.servlet.config.annotation.PathMatchConfigurer configurer) {
        configurer.setUseTrailingSlashMatch(false);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/uploads/**")
                .addResourceLocations("file:uploads/");
    }
}
```

---

## File: src/main/java/com/carplatform/car_platform/controller/AdminController.java
```java
package com.carplatform.car_platform.controller;

import com.carplatform.car_platform.model.Car;
import com.carplatform.car_platform.model.User;
import com.carplatform.car_platform.service.CarService;
import com.carplatform.car_platform.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {

    private final CarService carService;
    private final UserService userService;

    //view all car listings
    @GetMapping("/cars")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    //delete any car listing
    @DeleteMapping("/cars/{id}")
    public ResponseEntity<?> deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
        return ResponseEntity.ok("Car deleted by admin");
    }

    //view all registered sellers
    @GetMapping("/sellers")
    public List<User> getAllSellers() {
        return userService.getAllSellers();
    }

    //delete a seller account
    @DeleteMapping("/sellers/{id}")
    public ResponseEntity<?> deleteSeller(@PathVariable Long id) {
        userService.deleteSeller(id);
        return ResponseEntity.ok("Seller deleted by admin");
    }
}
```

---

## File: src/main/java/com/carplatform/car_platform/controller/AuthController.java
```java
package com.carplatform.car_platform.controller;

import com.carplatform.car_platform.dto.UserDTO;
import com.carplatform.car_platform.model.User;
import com.carplatform.car_platform.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    // Register a new seller account
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserDTO dto) {
        User newUser = userService.registerSeller(dto);
        return ResponseEntity.ok(Map.of(
                "message", "Registration successful",
                "id", newUser.getId(),
                "name", newUser.getName()
        ));
    }

    // Get currently logged in user info
    @GetMapping("/me")
    public ResponseEntity<?> getCurrentUser(Principal principal) {
        if (principal == null) {
            return ResponseEntity.status(401).body(Map.of("message", "Not logged in"));
        }
        User user = userService.findByEmail(principal.getName());
        String role = user.getDashboard().replace("-dashboard", "").toUpperCase();
        return ResponseEntity.ok(Map.of(
                "id", user.getId(),
                "name", user.getName(),
                "email", user.getEmail(),
                "role", role,
                "dashboard", user.getDashboard()
        ));
    }
}
```

---

## File: src/main/java/com/carplatform/car_platform/controller/HomeController.java
```java
package com.carplatform.car_platform.controller;

import com.carplatform.car_platform.model.Car;
import com.carplatform.car_platform.repository.CarRepository;
import com.carplatform.car_platform.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class HomeController {

    private final CarService carService;
    private final CarRepository carRepository;

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id) {
        return carService.getCarById(id);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Car>> searchCars(
            @RequestParam(required = false) String brand,
            @RequestParam(required = false) String location) {

        if (brand != null && !brand.isEmpty() && location != null && !location.isEmpty()) {
            return ResponseEntity.ok(carRepository.findByBrandContainingIgnoreCaseAndLocationIgnoreCase(brand, location));
        } else if (brand != null && !brand.isEmpty()) {
            return ResponseEntity.ok(carRepository.findByBrandContainingIgnoreCase(brand));
        } else if (location != null && !location.isEmpty()) {
            return ResponseEntity.ok(carRepository.findByLocationIgnoreCase(location));
        } else {
            return ResponseEntity.ok(carRepository.findAll());
        }
    }
}
```

---

## File: src/main/java/com/carplatform/car_platform/controller/PageController.java
```java
package com.carplatform.car_platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/login")
    public String login() {
        return "forward:/login/index.html";
    }

    @GetMapping("/register")
    public String register() {
        return "forward:/register/index.html";
    }

    @GetMapping("/car-detail")
    public String carDetail() {
        return "forward:/car-detail/index.html";
    }

    @GetMapping("/seller-dashboard")
    public String sellerDashboard() {
        return "forward:/seller-dashboard/index.html";
    }

    @GetMapping("/add-car")
    public String addCar() {
        return "forward:/add-car/index.html";
    }

    @GetMapping("/edit-car")
    public String editCar() {
        return "forward:/edit-car/index.html";
    }

    @GetMapping("/admin-dashboard")
    public String adminDashboard() {
        return "forward:/admin-dashboard/index.html";
    }
}
```

---

## File: src/main/java/com/carplatform/car_platform/controller/SellerController.java
```java
package com.carplatform.car_platform.controller;

import com.carplatform.car_platform.dto.CarDTO;
import com.carplatform.car_platform.model.Car;
import com.carplatform.car_platform.model.User;
import com.carplatform.car_platform.service.CarService;
import com.carplatform.car_platform.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.Principal;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/seller")
@RequiredArgsConstructor
public class SellerController {

    private final CarService carService;
    private final UserService userService;

    //get all cars belonging to the logged in seller
    @GetMapping("/cars")
    public List<Car> getMyCars(Principal principal) {
        User seller = userService.findByEmail(principal.getName());
        return carService.getCarsBySeller(seller.getId());
    }

    //get a single car by ID, verifying it belongs to the logged-in seller
    @GetMapping("/cars/{id}")
    public ResponseEntity<?> getMyCarById(@PathVariable Long id, Principal principal) {
        User seller = userService.findByEmail(principal.getName());
        Car car = carService.getCarById(id);
        if (!car.getSeller().getId().equals(seller.getId())) {
            return ResponseEntity.status(403).body(Map.of("message", "You don't have permission to edit this car"));
        }
        return ResponseEntity.ok(car);
    }

    //add a new car listing
    @PostMapping("/cars")
    public ResponseEntity<?> addCar(
            @RequestPart("car") CarDTO dto,
            @RequestPart(value = "image", required = false) MultipartFile image,
            Principal principal) throws IOException {

        User seller = userService.findByEmail(principal.getName());
        Car newCar = carService.addCar(dto, image, seller.getId());
        return ResponseEntity.ok(newCar);
    }

    //edit an existing car listing
    @PutMapping("/cars/{id}")
    public ResponseEntity<?> updateCar(
            @PathVariable Long id,
            @RequestPart("car") CarDTO dto,
            @RequestPart(value = "image", required = false) MultipartFile image) throws IOException {

        Car updated = carService.updateCar(id, dto, image);
        return ResponseEntity.ok(updated);
    }

    //delete a car listing
    @DeleteMapping("/cars/{id}")
    public ResponseEntity<?> deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
        return ResponseEntity.ok("Car deleted successfully");
    }
}
```

---

## File: src/main/java/com/carplatform/car_platform/dto/CarDTO.java
```java
package com.carplatform.car_platform.dto;

import lombok.*;

@Getter @Setter @NoArgsConstructor
public class CarDTO {
    private String brand;
    private String model;
    private int year;
    private double price;
    private int mileage;
    private String location;
}
```

---

## File: src/main/java/com/carplatform/car_platform/dto/UserDTO.java
```java
package com.carplatform.car_platform.dto;

import lombok.*;

@Getter @Setter @NoArgsConstructor
public class UserDTO {
    private String name;
    private String email;
    private String password;
}
```

---

## File: src/main/java/com/carplatform/car_platform/model/User.java
```java
package com.carplatform.car_platform.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role", discriminatorType = DiscriminatorType.STRING)
@Getter @Setter @NoArgsConstructor
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    public void login() {
        System.out.println(name + " logged in.");
    }

    public void logout() {
        System.out.println(name + " logged out.");
    }

    public abstract String getDashboard();
}
```

---

## File: src/main/java/com/carplatform/car_platform/model/Seller.java
```java
package com.carplatform.car_platform.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@DiscriminatorValue("SELLER")
@Getter @Setter @NoArgsConstructor
public class Seller extends User {

    @JsonIgnore
    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Car> cars;

    @JsonProperty("carCount")
    public int getCarCount() {
        return cars != null ? cars.size() : 0;
    }

    @Override
    public String getDashboard() {
        return "seller-dashboard";
    }
}
```

---

## File: src/main/java/com/carplatform/car_platform/model/Admin.java
```java
package com.carplatform.car_platform.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@DiscriminatorValue("ADMIN")
@Getter @Setter @NoArgsConstructor
public class Admin extends User {

    @Override
    public String getDashboard() {
        return "admin-dashboard";
    }
}
```

---

## File: src/main/java/com/carplatform/car_platform/model/Car.java
```java
package com.carplatform.car_platform.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cars")
@Getter @Setter @NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private int year;
    private double price;
    private int mileage;
    private String location;
    private String imagePath;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User seller;

    public void updateDetails(String brand, String model, int year,
                              double price, int mileage, String location) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
        this.location = location;
    }
}
```

---

## File: src/main/java/com/carplatform/car_platform/repository/UserRepository.java
```java
package com.carplatform.car_platform.repository;

import com.carplatform.car_platform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
```

---

## File: src/main/java/com/carplatform/car_platform/repository/CarRepository.java
```java
package com.carplatform.car_platform.repository;

import com.carplatform.car_platform.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findBySellerId(Long sellerId);
    List<Car> findByBrandContainingIgnoreCase(String brand);
    List<Car> findByBrandContainingIgnoreCaseAndLocationIgnoreCase(String brand, String location);
    List<Car> findByLocationIgnoreCase(String location);
}
```

---

## File: src/main/java/com/carplatform/car_platform/service/UserService.java
```java
package com.carplatform.car_platform.service;

import com.carplatform.car_platform.dto.UserDTO;
import com.carplatform.car_platform.model.Seller;
import com.carplatform.car_platform.model.User;
import com.carplatform.car_platform.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    //register a new Seller account
    public User registerSeller(UserDTO dto) {
        Seller seller = new Seller();
        seller.setName(dto.getName());
        seller.setEmail(dto.getEmail());
        seller.setPassword(passwordEncoder.encode(dto.getPassword()));
        return userRepository.save(seller);
    }

    //find a user by their email address (used by Spring Security during login)
    public User findByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found: " + email));
    }

    //get all users who are Sellers (for admin dashboard)
    public List<User> getAllSellers() {
        return userRepository.findAll()
                .stream()
                .filter(u -> u instanceof Seller)
                .toList();
    }

    //delete a seller by ID (admin action)
    public void deleteSeller(Long id) {
        userRepository.deleteById(id);
    }
}
```

---

## File: src/main/java/com/carplatform/car_platform/service/CarService.java
```java
package com.carplatform.car_platform.service;

import com.carplatform.car_platform.dto.CarDTO;
import com.carplatform.car_platform.model.Car;
import com.carplatform.car_platform.model.User;
import com.carplatform.car_platform.repository.CarRepository;
import com.carplatform.car_platform.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    private final UserRepository userRepository;

    @Value("${file.upload-dir}")
    private String uploadDir;

    //get all car listings
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    //get one car by ID
    public Car getCarById(Long id) {
        return carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Car not found: " + id));
    }

    //get all cars belonging to a specific seller
    public List<Car> getCarsBySeller(Long sellerId) {
        return carRepository.findBySellerId(sellerId);
    }

    //search cars by brand name
    public List<Car> searchByBrand(String brand) {
        return carRepository.findByBrandContainingIgnoreCase(brand);
    }

    //add a new car listing with an image
    public Car addCar(CarDTO dto, MultipartFile image, Long sellerId) throws IOException {
        User seller = userRepository.findById(sellerId)
                .orElseThrow(() -> new RuntimeException("Seller not found"));

        Car car = new Car();
        car.setBrand(dto.getBrand());
        car.setModel(dto.getModel());
        car.setYear(dto.getYear());
        car.setPrice(dto.getPrice());
        car.setMileage(dto.getMileage());
        car.setLocation(dto.getLocation());
        car.setSeller(seller);

        //file handling — save image to disk
        if (image != null && !image.isEmpty()) {
            String filename = UUID.randomUUID() + "_" + image.getOriginalFilename();
            Path uploadPath = Paths.get(uploadDir);
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }
            Files.copy(image.getInputStream(), uploadPath.resolve(filename));
            car.setImagePath(filename);
        }

        return carRepository.save(car);
    }

    //update an existing car listing
    public Car updateCar(Long id, CarDTO dto, MultipartFile image) throws IOException {
        Car car = getCarById(id);
        car.updateDetails(dto.getBrand(), dto.getModel(), dto.getYear(),
                dto.getPrice(), dto.getMileage(), dto.getLocation());

        //replace image if a new one is uploaded
        if (image != null && !image.isEmpty()) {
            String filename = UUID.randomUUID() + "_" + image.getOriginalFilename();
            Path uploadPath = Paths.get(uploadDir);
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }
            Files.copy(image.getInputStream(), uploadPath.resolve(filename));
            car.setImagePath(filename);
        }

        return carRepository.save(car);
    }

    //delete a car listing
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
```

---

## File: src/test/java/com/carplatform/car_platform/CarPlatformApplicationTests.java
```java
package com.carplatform.car_platform;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarPlatformApplicationTests {

	@Test
	void contextLoads() {
	}

}
```

---

## 5. HTML Page Summaries

---

## Page: index.html (root — `/`)
- **Purpose:** Public home page. Displays all car listings in a card grid. Serves as the main browsing page for buyers.
- **Fields/Buttons:**
  - Text input `#searchBrand` — search by car brand name
  - `<select #searchLocation>` — filter by Sri Lankan district (25 options)
  - "Search" button — triggers search
  - Filter strip: `#fDistrict` (select), `#fPriceMin` / `#fPriceMax` (number inputs), `#fYearFrom` / `#fYearTo` (number inputs), "Clear" button
  - Each car card is clickable and navigates to `/car-detail?id={id}`
- **API calls:**
  - `GET /api/auth/me` — on load, to check if a user is logged in and update the navbar (shows user chip + logout if logged in, login/sign-up buttons if not)
  - `GET /api/cars` — on load, to fetch all listings
  - `GET /api/cars/search?brand=&location=` — when search is triggered
  - `POST /api/auth/logout` — when "Log Out" is clicked
- **Role behaviour:** No role required to view. Navbar dynamically shows either Login/Sign Up buttons (guest) or the logged-in user's name chip and a dashboard link (any authenticated role). The link in the chip points to `/{user.dashboard}`, so SELLER → `/seller-dashboard`, ADMIN → `/admin-dashboard`.

---

## Page: login/index.html (`/login`)
- **Purpose:** Login form for both SELLER and ADMIN accounts. On successful login, redirects the user to their role-specific dashboard.
- **Fields/Buttons:**
  - `#username` (email input) — maps to Spring Security's `username` field
  - `#password` (password input)
  - "Log In →" button (`#loginBtn`)
  - Link to `/register`
- **API calls:**
  - `GET /api/auth/me` — on page load, to redirect already-logged-in users away from the login page
  - `POST /api/auth/login` — with `application/x-www-form-urlencoded` body (`username` + `password`); handled by Spring Security form login
  - `GET /api/auth/me` — immediately after a successful login, to read the user's role and redirect
- **Role behaviour:** After login, `redirectByRole(role)` sends ADMIN to `/admin-dashboard` and SELLER to `/seller-dashboard`. The page itself is public.

---

## Page: register/index.html (`/register`)
- **Purpose:** Registration form for new SELLER accounts only. On success, redirects to `/login`.
- **Fields/Buttons:**
  - `#name` (text) — full name
  - `#email` (email)
  - `#password` (password) — minimum 6 characters
  - `#confirmPassword` (password) — live match validation feedback
  - "Create Account →" button (`#registerBtn`)
  - Link to `/login`
- **API calls:**
  - `POST /api/auth/register` — JSON body `{ name, email, password }`; maps to `AuthController.register()` → `UserService.registerSeller()`
- **Role behaviour:** Public page. No auth required. Always creates a SELLER account (admin accounts are seeded directly in the database).

---

## Page: car-detail/index.html (`/car-detail?id={id}`)
- **Purpose:** Displays full details of a single car listing. Reads the car ID from the URL query string.
- **Fields/Buttons:**
  - "Contact Seller →" button — currently a placeholder toast (feature not yet implemented)
  - "← Back to listings" link — returns to `/`
- **API calls:**
  - `GET /api/auth/me` — on load, to populate the navbar with the logged-in user's info
  - `GET /api/cars/{id}` — to fetch the car's data; uses the `id` query param from the URL
  - `POST /api/auth/logout` — when "Log Out" is clicked (if logged in)
- **Role behaviour:** Fully public — no login required to view any listing. The navbar adapts to show a user chip if logged in.

---

## Page: seller-dashboard/index.html (`/seller-dashboard`)
- **Purpose:** Private dashboard for logged-in SELLER accounts. Shows the seller's profile, stats (total listings, highest/lowest price), and a table of their own car listings with Edit and Delete actions.
- **Fields/Buttons:**
  - "Log Out" button in navbar
  - "+ Add New Car" button/link → navigates to `/add-car`
  - Per-car row: "Edit" link → `/edit-car?id={id}`, "Delete" button → opens confirm modal
  - Confirm modal: "Cancel" and "Delete" buttons
- **API calls:**
  - `GET /api/auth/me` — auth guard on load; redirects to `/login` if not authenticated, or to `/admin-dashboard` if role is ADMIN
  - `GET /api/seller/cars` — fetches only the listings belonging to the logged-in seller
  - `DELETE /api/seller/cars/{id}` — deletes a listing; row is removed from DOM on success
  - `POST /api/auth/logout` — logout
- **Role behaviour:** SELLER only. The page performs a frontend role check (`user.role !== 'SELLER'`) and redirects to `/admin-dashboard` if an admin somehow lands here.

---

## Page: add-car/index.html (`/add-car`)
- **Purpose:** Form for a logged-in SELLER to create a new car listing, including an optional photo upload with drag-and-drop support.
- **Fields/Buttons:**
  - `#brand` (text, required)
  - `#model` (text, required)
  - `#year` (number, 1990–2025, required)
  - `#mileage` (number, required)
  - `#price` (number, required)
  - `#location` (select — 25 Sri Lankan districts)
  - `#imageInput` (file — JPG/PNG/WEBP, drag-and-drop zone)
  - "✕ Remove" button — clears the selected image preview
  - "Publish Listing →" submit button (`#submitBtn`)
  - "Cancel" link → `/seller-dashboard`
- **API calls:**
  - `GET /api/auth/me` — auth guard; redirects to `/login` if not a SELLER
  - `POST /api/seller/cars` — multipart/form-data with two parts: `car` (JSON blob containing CarDTO fields) and `image` (optional file); maps to `SellerController.addCar()`
- **Role behaviour:** SELLER only. Redirects to `/login` if not authenticated or not a SELLER.

---

## Page: edit-car/index.html (`/edit-car?id={id}`)
- **Purpose:** Pre-filled edit form for a SELLER to update an existing car listing. Reads the car ID from the URL. Shows the current saved image and allows replacing it.
- **Fields/Buttons:**
  - Same fields as add-car: `#brand`, `#model`, `#year`, `#mileage`, `#price`, `#location` (all pre-filled with existing values)
  - Current photo preview (read-only display)
  - `#imageInput` (file) — optional replacement image with drag-and-drop
  - "✕ Remove" button — clears the new image selection
  - "Save Changes →" submit button (`#submitBtn`)
  - "Cancel" link → `/seller-dashboard`
- **API calls:**
  - `GET /api/auth/me` — auth guard; must be SELLER
  - `GET /api/seller/cars/{id}` — fetches existing car data to pre-fill the form; returns 403 if the car does not belong to this seller
  - `PUT /api/seller/cars/{id}` — multipart/form-data with `car` (JSON blob) and optional new `image`; maps to `SellerController.updateCar()` → `CarService.updateCar()` → `Car.updateDetails()`
- **Role behaviour:** SELLER only. The backend `GET /api/seller/cars/{id}` endpoint also enforces ownership — a seller cannot edit another seller's car.

---

## Page: admin-dashboard/index.html (`/admin-dashboard`)
- **Purpose:** Private dashboard for logged-in ADMIN accounts. Shows platform-wide stats and two tabbed views: all car listings and all registered sellers. Admins can delete any car or any seller.
- **Fields/Buttons:**
  - "Log Out" button in navbar
  - "All Cars" tab button and "All Sellers" tab button
  - Per-car row: "Delete" button → confirm modal
  - Per-seller row: "Remove" button → confirm modal
  - Confirm modal: "Cancel" and "Delete" buttons (shared for both types)
- **API calls:**
  - `GET /api/auth/me` — auth guard; must be ADMIN; redirects SELLER to `/seller-dashboard`
  - `GET /api/admin/cars` — fetches all car listings platform-wide
  - `GET /api/admin/sellers` — fetches all registered sellers
  - `DELETE /api/admin/cars/{id}` — admin deletes a car listing
  - `DELETE /api/admin/sellers/{id}` — admin removes a seller account
  - `POST /api/auth/logout` — logout
- **Role behaviour:** ADMIN only. Both car and seller data are loaded in parallel using `Promise.all()`. The seller list includes a `carCount` field (derived from `Seller.getCarCount()` in the backend) shown under each seller's name.

---

## 6. Separate JavaScript Files

There are **no separate `.js` files** in `src/main/resources/static/js/` or any other subdirectory. All JavaScript is written inline inside `<script>` tags within each HTML page.
