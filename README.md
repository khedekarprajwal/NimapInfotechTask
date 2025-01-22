#Features
1.Category Management
Create, Read, Update, and Delete categories.
Pagination support when fetching categories.

2.Product Management

Create, Read, Update, and Delete products.
Pagination support when fetching products.
Fetch product details along with their respective category information.

3.Database Configuration

Uses MySQL as the relational database.
Configured with JPA and Hibernate for database operations.

4.Annotation-based Configuration
Avoids XML configurations; fully annotation-based.

5.One-to-Many Relationship

A category can have multiple products (one-to-many).


##Tech Stack

Backend Framework: Spring Boot

Database: MySQL

ORM: Hibernate with JPA

Build Tool: Maven

Language: Java 17

##Endpoints:
1.Category Endpoints
Method      Endpoint                         Description
GET         /api/categories?page={number}    Get all categories (paginated).
POST        /api/categories                  Create a new category.
GET         /api/products/{id}               Get product by ID.
PUT         /api/categories/{id}             Update category by ID.
DELETE      /api/categories/{id}             Delete category by ID.

2.Product Endpoints

Method      Endpoint                        Description
GET       /api/products?page={number}      Get all products (paginated).
POST      /api/products                    Create a new product.
GET       /api/products/{id}               Get product by ID.
PUT       /api/products/{id}               Update product by ID.
DELETE    /api/products/{id}               Delete product by ID.


##Getting Started:  
Prerequisites
1.Java 17 installed.

2.Maven installed.

3.MySQL database running.

##Steps to Run the Application
1.Clone the repository:
git clone <repository-url>
cd <project-directory>

2.Configure the database:
* open src/main/resources/application.properties.
* Update the following properties:
i.spring.datasource.url=jdbc:mysql://localhost:3306/<database-name>
ii.spring.datasource.username=<your-username>
iii.spring.datasource.password=<your-password>


3.Build and run the application:
mvn clean install
mvn spring-boot:run

4.Access the API:
Base URL: http://localhost:8080/api/

Database Schema:

Category Table:
Column Name    Data Type     Description
id            BIGINT (PK)   Auto-incremented ID.
name          varchar      Name of the Category.

Product Table:
Column Name     Data Type       Description
id             BIGINT (PK)      Auto-incremented ID.
name           VARCHAR(255)      Name of the product.
price          DOUBLE            Price of the product.
category_id    BIGINT (FK)       Linked category ID.


##Project Structure:
src/
├── main/
│   ├── java/com/springboot/Restapi/
│   │   ├── controller/       # REST API controllers
│   │   ├── entity/           # JPA entities (Category, Product)
│   │   ├── repository/       # Repository interfaces for database operations
│   │   ├── service/          # Service layer containing business logic
│   ├── resources/
│       ├── application.properties  # Application configuration
│       ├── data.sql                # Optional: Initial seed data

Pagination:

##To enable server-side pagination, use the page query parameter in the GET endpoints for categories or products.
Example:
GET http://localhost:8080/api/categories?page=1
GET http://localhost:8080/api/products?page=2

##Additional Notes:
1.Ensure the MySQL database is running and the credentials are correct in the application.properties.
2.Server-side pagination is implemented using Spring Data JPA's PageRequest.

##Future Enhancements:
1.Add authentication and authorization using Spring Security.
2.Implement caching for frequently accessed endpoints.
3.Add support for sorting and filtering in product and category endpoints.







  

















