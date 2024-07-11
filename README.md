# Library Management System

## Description

A Spring Boot Application to manage books and authors in a library.This project includes RESTful endpoints to add, retrieve, update and delete books and authors.

## Requirements 

• Java 17
• Maven

## Setup
1. Clone the repository:
    ```sh
    git clone https://github.com/your-username/library.git
    cd library
    ```

2. Build the project:
    ```sh
    mvn clean install
    ```

3. Run the application:
    ```sh
    mvn spring-boot:run
    ```

4. Access the Swagger UI:
    ```
    http://localhost:8080/swagger-ui/
    ```

5. Access the H2 Console:
    ```
    http://localhost:8080/h2-console
    ```
    Use the following credentials:
    - **Username**: akarsh
    - **Password**: akarsh123

## Endpoints

- `POST /books` - Add a new book
- `POST /authors` - Add a new author
- `GET /books` - Retrieve a list of all books
- `GET /authors` - Retrieve a list of all authors
- `GET /authors/{authorId}/books` - Retrieve a list of all books by a specific author
- `PUT /books/{bookId}` - Update book details
- `DELETE /books/{bookId}` - Delete a book

## Testing

Run unit and integration tests:

```sh
mvn test
