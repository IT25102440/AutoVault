# SE1020 — Car Platform Project Context

## What This Is
A university OOP project for module SE1020. A web-based Second-Hand Car Sales & Purchase Platform.
Deadline: May 22, 2025.

## Stack
- Backend: Java 17 + Spring Boot 3.x, REST API (@RestController, returns JSON only)
- Database: MySQL 8.x, database name: `carplatform`
- ORM: Spring Data JPA + Hibernate
- Security: Spring Security (session-based), roles: SELLER and ADMIN
- Frontend: Plain HTML + Bootstrap 5 + Vanilla JS with fetch() — NO Thymeleaf, NO React, NO Vue
- File Handling: Car image uploads saved to /uploads folder on disk using MultipartFile
- Build: Maven | Utilities: Lombok

## Package Structure (strict — do not deviate)
com.carplatform.model       → User.java, Seller.java, Admin.java, Car.java
com.carplatform.repository  → UserRepository.java, CarRepository.java
com.carplatform.service     → UserService.java, CarService.java
com.carplatform.controller  → HomeController.java, AuthController.java, SellerController.java, AdminController.java
com.carplatform.config      → SecurityConfig.java
com.carplatform.dto         → UserDTO.java, CarDTO.java
src/main/resources/static/  → all HTML pages
uploads/                    → car images stored here (outside resources)

## OOP Structure (must be preserved)
- User.java: abstract class, @Entity, SINGLE_TABLE inheritance, has abstract method getDashboard()
- Seller.java: extends User, @DiscriminatorValue("SELLER"), has @OneToMany List<Car>
- Admin.java: extends User, @DiscriminatorValue("ADMIN")
- Car.java: @Entity, has @ManyToOne User seller, has updateDetails() method
- Polymorphism: getDashboard() overridden in Seller ("seller-dashboard") and Admin ("admin-dashboard")

## API Endpoints
Public:        GET /api/cars, GET /api/cars/{id}, GET /api/cars/search?brand=
Auth:          POST /api/auth/register, POST /api/auth/login, POST /api/auth/logout, GET /api/auth/me
Seller (auth): GET/POST /api/seller/cars, PUT/DELETE /api/seller/cars/{id}
Admin (auth):  GET/DELETE /api/admin/cars/{id}, GET/DELETE /api/admin/sellers/{id}

## Security Rules
- /api/cars/** → public
- /api/seller/** → SELLER role required
- /api/admin/** → ADMIN role required
- Passwords stored as BCrypt hash, never returned in responses

## Teaching Mode
I am a student learning OOP through this project. When helping me:
- Before writing code: briefly explain what we are building, where it fits in the architecture, and why
- After writing code: explain what it does in plain English, what problem it solves, and which OOP concept it demonstrates
- Keep explanations concise and practical — no long lectures
- Always follow the exact package structure and OOP hierarchy above