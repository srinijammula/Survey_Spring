# Survey_Spring Application

## Introduction
Survey_Spring is a Java-based Spring Boot application designed for creating and managing surveys. It utilizes Maven for dependency management, connects to an AWS RDS instance for data persistence, and employs CI/CD for streamlined development and deployment.

## Requirements
- Java 17
- Maven
- IntelliJ IDEA or similar IDE
- AWS Account for RDS setup
- Postman for API testing

## Setup Instructions
1. **Project Initialization**:
   - Go to [Spring Initializer](https://start.spring.io/)
   - Choose Maven, Java, and specify Spring Boot version 3.1.4
   - Set the project name to `Survey_Spring` and packaging to Jar
   - Click `Generate` to download the setup zip

2. **Local Environment Setup**:
   - Extract the downloaded zip and open the project in IntelliJ IDEA
   - Configure `application.properties` to connect to your AWS RDS database

3. **AWS RDS Configuration**:
   - Set up an AWS RDS instance
   - Ensure the security group allows traffic from your development environment

## Running the Application
- Build the project using IntelliJ and run the main class to start the Spring Boot server.

## Testing the APIs
- Use Postman to test the CRUD operations:
  - **Create Survey**
  - **Read Surveys**
  - **Update Survey**
  - **Delete Survey**

## CI/CD Integration
- We use GitHub Actions for CI/CD to automate testing and deployments.
- Changes pushed to the main branch automatically trigger build and test workflows.
- Successful builds are deployed to a Kubernetes cluster.

## Kubernetes Deployment
- The application is containerized using Docker.
- Kubernetes manages the deployment, scaling, and operation of the application containers.
- Automated rollouts and rollbacks are configured to maintain deployment stability.

## Contributing
- Contributions to the project are welcome. Please fork the repository, make your changes, and submit a pull request.
