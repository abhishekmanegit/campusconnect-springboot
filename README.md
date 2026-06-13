# CampusConnect Spring Boot

CampusConnect is a backend REST API project built using Spring Boot for managing students and campus events.
The project follows a clean layered architecture and demonstrates CRUD operations, exception handling, DTO usage, and database integration with PostgreSQL.

---

## 🚀 Features

* Student Management APIs
* Event Management APIs
* CRUD Operations
* RESTful API Design
* Global Exception Handling
* DTO Implementation
* PostgreSQL Database Integration
* Layered Spring Boot Architecture

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Maven
* REST APIs

---

## 📂 Project Structure

```bash
src/
 ├── controller
 ├── service
 ├── repository
 ├── model
 ├── dto
 ├── exception
 └── resources
```

---

## ⚙️ Setup & Installation

### 1. Clone the Repository

```bash
git clone https://github.com/abhishekmanegit/campusconnect-springboot.git
```

### 2. Navigate to the Project

```bash
cd campusconnect-springboot
```

### 3. Configure PostgreSQL

Update the `application.properties` file:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 4. Run the Application

```bash
./mvnw spring-boot:run
```

---

## 📌 API Endpoints

### Student APIs

| Method | Endpoint         | Description       |
| ------ | ---------------- | ----------------- |
| GET    | `/students`      | Get all students  |
| GET    | `/students/{id}` | Get student by ID |
| POST   | `/students`      | Create student    |
| PUT    | `/students/{id}` | Update student    |
| DELETE | `/students/{id}` | Delete student    |

---

### Event APIs

| Method | Endpoint       | Description     |
| ------ | -------------- | --------------- |
| GET    | `/events`      | Get all events  |
| GET    | `/events/{id}` | Get event by ID |
| POST   | `/events`      | Create event    |
| PUT    | `/events/{id}` | Update event    |
| DELETE | `/events/{id}` | Delete event    |

---

## 📖 What I Learned

* Building REST APIs using Spring Boot
* Using Spring Data JPA for database operations
* PostgreSQL integration
* DTO pattern implementation
* Exception handling in Spring Boot
* Layered backend architecture

---

## 🔮 Future Improvements

* JWT Authentication
* Role-Based Authorization
* API Validation
* Frontend Integration

---

## 👨‍💻 Author

Abhishek Mane

GitHub: https://github.com/abhishekmanegit
