# Grievance Redressal System - Backend

A robust RESTful API backend for a Grievance Redressal System, built using **Java 17** and **Spring Boot 3**. This system allows users to submit, track, and manage grievances, while administrators and specific departments can categorize, review, and comment on them to resolve issues efficiently.

## 🚀 Features

- **User Management**: Role-based access for complainants, staff, and administrators.
- **Grievance Tracking**: Submit grievances, assign priorities, and track status (e.g., OPEN, IN_PROGRESS, RESOLVED).
- **Categorization & Departments**: Group grievances by categories and route them to specific departments.
- **Commenting System**: Add internal or public comments to grievances for communication and progress updates.
- **Secure Configuration**: Follows Twelve-Factor App principles using environment variables (`.env`) for secure local development and deployment.
- **CORS Enabled**: Ready to be consumed by any frontend framework (React, Angular, Vue).

## 🛠️ Tech Stack

- **Framework**: Spring Boot 3.0.1
- **Language**: Java 17
- **Database**: MySQL 8+
- **ORM**: Spring Data JPA / Hibernate
- **Build Tool**: Maven

## 📦 Project Structure

The codebase is organized following standard MVC / layered architecture:

- `controller/`: REST API endpoints handling HTTP requests and responses.
- `service/`: Core business logic and transaction management.
- `repository/`: Spring Data JPA interfaces for database operations.
- `model/`: JPA Entities representing database tables.
## 📖 API Documentation (Swagger)

You can explore and test the API endpoints interactively using Swagger UI. Once the application is running, navigate to:

- **Swagger UI**: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) (or `http://localhost:8080/swagger-ui/index.html`)
- **OpenAPI JSON**: [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)

> **Note:** Ensure you have the `springdoc-openapi-starter-webmvc-ui` dependency in your `pom.xml` for Swagger to be available in Spring Boot 3.

## ⚙️ Local Development Setup

### Prerequisites
- JDK 17
- Maven
- MySQL Server installed and running

### 1. Database Setup
Create a new MySQL database named `appdb`:
```sql
CREATE DATABASE appdb;
```

### 2. Environment Variables
This project uses environment variables for secure configuration. 
1. Copy the sample environment file:
   ```bash
   cp .env.example .env
   ```
2. Open `.env` and fill in your local MySQL credentials:
   ```properties
   DB_URL=jdbc:mysql://localhost/appdb?createDatabaseIfNotExist=true
   DB_USERNAME=root
   DB_PASSWORD=your_password_here
   ```

### 3. Build and Run
Build the project using Maven:
```bash
./mvnw clean install
```

Run the application:
```bash
./mvnw spring-boot:run
```

The server will start on `http://localhost:8080`. The database tables will be automatically generated on the first run.

## 🧪 Testing

The API responses have been standardized for automated integration testing. To run the test suite:
```bash
./mvnw test
```

## 🔒 Security

All sensitive credentials (database passwords, API keys) are extracted to the `.env` file and ignored via `.gitignore` to prevent accidental leakage to version control. Please ensure you do not commit your `.env` file!

## 🤝 Contributing

1. Fork the project
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request
