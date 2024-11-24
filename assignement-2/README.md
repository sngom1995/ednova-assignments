# Spring Boot and MongoDB Health Check API

This project demonstrates how to set up a Spring Boot application integrated with MongoDB, including creating a health check API endpoint. Below are the detailed steps to set up and test the application.

---

## 1. Set Up the Spring Boot Project

1. Visit [Spring Initializr](https://start.spring.io/).
2. Configure the project:
    - **Project**: Maven or Gradle (choose as per preference)
    - **Language**: Java
    - **Spring Boot Version**: Latest stable version
    - **Dependencies**:
        - Spring Data MongoDB
        - Spring Web
        - lombok
        - docker
3. Download the generated project and import it into your IDE (e.g., IntelliJ IDEA, Eclipse).

---

## 2. Configure MongoDB

### Set Up MongoDB with Docker Compose

1. Create a `docker-compose.yml` file in the project root:
   ```yaml
    services:
    mongodb:
    image: 'mongo:latest'
    environment:
    - 'MONGO_INITDB_DATABASE=assignement2-db'
      - 'MONGO_INITDB_ROOT_PASSWORD=root'
      - 'MONGO_INITDB_ROOT_USERNAME=root'
      ports:
      - '27017'



### Endpoint test

1. http://localhost:8080/health

 ```json
    {
        "message": "OK"
    }
