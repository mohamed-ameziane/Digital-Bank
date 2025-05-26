# Digital Bank Spring Boot Application | Backend

## Project Description

This application simulates a digital banking system with full CRUD functionalities for managing customers and their accounts. Built using **Spring Boot**, it leverages RESTful APIs and connects to a **MySQL** database for data persistence. It provides a backend structure for managing core banking operations such as customer creation, account handling, and transaction processing (credit, debit, transfer).

## Technologies Used

- **Java** — Programming language
- **Spring Boot** — Backend framework
- **Spring Data JPA** — ORM for database access
- **MySQL** — Relational database
- **Maven** — Dependency and project management tool
- **Angular** — Frontend (see [Frontend GitHub Repo](https://github.com/mohamed-ameziane/Digital-Bank-Frontend))

---

## Architecture

This application follows a **monolithic** architecture.

### 1- Application Architecture

![Diagram of system architecture](images/Architecture.png)

### 2- Application Layers

- **Controller Layer** – Exposes REST endpoints
- **Service Layer** – Contains business logic
- **Repository Layer** – Manages data access
- **Model Layer** – Represents entity models

### 3- Database Schema

![Diagram of classes](images/Class.png)

---

## Features and Functionalities

### CRUD Operations

The application offers complete CRUD operations for managing customers and their bank accounts via REST APIs.

**Customer Operations:**

- **Create:** `POST /customers`
- **Read:**
  - All customers: `GET /customers`
  - By ID: `GET /customers/{id}`
  - Search: `GET /customers/search`
- **Update:** `PUT /customers/{customerId}`
- **Delete:** `DELETE /customers/{id}`

---

### Business Logic

The service layer ensures:

- **Data integrity** when modifying customers/accounts
- **Validation** of operations (credit, debit, transfer)
- **Consistency** in account balances and transaction history
- **Exception handling** for invalid operations

---

### API Endpoints

#### Customer REST Controller

| Method   | Endpoint                  | Description                     |
|----------|---------------------------|---------------------------------|
| `GET`    | `/customers`              | Retrieve all customers          |
| `GET`    | `/customers/{id}`         | Get customer by ID              |
| `POST`   | `/customers`              | Add new customer                |
| `PUT`    | `/customers/{customerId}` | Update customer details         |
| `DELETE` | `/customers/{id}`         | Delete customer                 |
| `GET`    | `/customers/search`       | Search customers by keyword     |

#### Bank Account REST Controller

| Method | Endpoint                               | Description                            |
|--------|----------------------------------------|----------------------------------------|
| `POST` | `/accounts/transfer`                   | Transfer funds between accounts        |
| `POST` | `/accounts/debit`                      | Debit money from an account            |
| `POST` | `/accounts/credit`                     | Credit money to an account             |
| `GET`  | `/accounts`                            | List all bank accounts                 |
| `GET`  | `/accounts/{accountId}`                | View account details by ID             |
| `GET`  | `/accounts/{accountId}/pageOperations` | View account transaction history (paginated) |

---

## Configuration

The application's configuration is defined in the `application.properties` file:

```properties
spring.application.name=Digital_Banking
server.port=8082

spring.datasource.url=jdbc:mysql://localhost:3306/E-BANK?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MariaDBDialect
```

- **Application Name:** `Digital_Banking`
- **Port:** `8082`
- **Database:** MySQL (`E-BANK`)
- **Auto Schema Update:** Enabled
- **Hibernate Dialect:** MariaDB

---

## How to Run?

### Prerequisites:
- Java 17+
- MySQL running on `localhost:3306`

### Steps:

1. **Clone the Repository**
   ```bash
   git clone https://github.com/mohamed-ameziane/Digital-Bank
   cd Digital-Bank
   ```

2. **Build the Project**
   ```bash
   mvn clean install
   ```

3. **Run the Application**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the Application**
   - Swagger UI: [http://localhost:8082/swagger-ui.html](http://localhost:8082/swagger-ui.html)
   - Use Postman or Swagger for testing endpoints

---

## 6- Simulation

Below are screenshots simulating the application in action:

#### 1. Customers
![Customers](images/Screenshot%202025-05-26%20222001.png)

#### 2. Customer By ID
![Customer By Id](images/Screenshot%202025-05-26%20221936.png)

#### 3. Search Customer By Keyword
![Search Customer By Keyword](images/Screenshot%202025-05-26%20223700.png)

---

## Conclusion

This Spring Boot digital banking application demonstrates the implementation of core banking features using RESTful APIs, layered architecture, and secure database integration. It highlights the power of modern backend development with Java and Spring Boot, offering a strong foundation for scaling into microservices or integrating a frontend like Angular for full-stack capabilities.
