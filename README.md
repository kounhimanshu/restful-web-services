# Secure and Scalable REST API for a Social Media Platform (Spring Boot)

## Overview

This project encompasses the development of a robust RESTful API for a social media platform using Spring Boot. It focuses on establishing secure access, integrating a MySQL database for scalability, Docker containerization for deployment.

## Building a Robust Foundation

- **Architected RESTful API**: Leveraged Spring Boot's framework for efficient development and deployment.
- **Database Integration**: Utilized MySQL for persistent storage of user data and posts, ensuring scalability and data integrity.
- **Dockerized Deployment**: Utilizes Docker containers for the MySQL database, simplifying deployment and enabling portability across environments.
- **Migration**: Demonstrated adaptability by migrating from H2 database to MySQL.
- **Security**: Implemented basic authentication with Spring Security for securing the entire API.

## Enhancing Functionality and User Experience

- **Internationalization (i18n) Support**: Enabled localized user experiences to cater to a global audience.
- **API Versioning**: Implemented versioning to manage changes and ensure compatibility with different client applications.
- **Filtering Capabilities**: Developed robust filtering functionalities for efficient data retrieval and personalized experiences.
- **API Documentation**: Integrated OpenAPI to generate comprehensive documentation, facilitating developer interactions.
- **Health Checks and Monitoring**: Utilized Spring Boot Actuator for proactive health checks and performance monitoring.
- **HAL Explorer**: Enabled HAL explorer for intuitive API resource exploration, enhancing developer understanding.

## URLs
**Port** : 
```plaintext 
http://localhost:8080
```
**HAL Explorer** : 
```plaintext 
http://localhost:8080/explorer/index.html#uri=/
```
**HAL Explorer** : 
```plaintext 
http://localhost:8080/swagger-ui/index.html#/
```
**OpenAPI Doc** : 
```plaintext 
http://localhost:8080/v3/api-docs
```
**Users** : 
```plaintext 
http://localhost:8080/jpa/users
```
```plaintext 
http://localhost:8080/jpa/users/1
```
**Posts** : 
```plaintext 
http://localhost:8080/jpa/users/1/posts
```
```plaintext 
http://localhost:8080/jpa/users/1/posts/1
```
