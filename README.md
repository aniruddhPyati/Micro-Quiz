# Micro Quiz API

## Overview

The **Micro Quiz API** is a microservices-based application developed with Spring Boot. It allows users to access and manage a collection of quizzes, each containing a set of questions. The system is designed to be scalable and efficient, utilizing modern Spring Boot features and microservices architecture.

## Features

- **Microservices Architecture**: The application is built using Spring Boot microservices, providing modularity and scalability.
- **Quiz Management**: Access quiz names and retrieve questions associated with each quiz.
- **API Gateway**: Centralized routing and load balancing through the API Gateway.
- **Service Discovery**: Utilizes a registry service for dynamic service discovery.
- **OpenFeign Integration**: Seamless inter-service communication using OpenFeign.

## Dependencies used

- **Spring Boot**: Core framework for building microservices.
- **Spring Data JPA**: For data persistence and database interaction.
- **OpenFeign**:  For simplified inter-service communication.
- **Eureka Discovery Client**: A REST based service for locating services for the purpose of load balancing and failover of middle-tier servers.
- **Spring Cloud Gateway**:  For API Gateway functionality and routing.
- **Eureka Server**:  For the registry service funcitonality, i.e. to register all microservices.



