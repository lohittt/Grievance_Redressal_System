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
