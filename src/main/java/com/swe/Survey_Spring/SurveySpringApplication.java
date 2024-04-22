package com.swe.Survey_Spring;

/*
 * SurveySpringApplication.java:
 * This file contains the main entry point for the Spring Boot application.
 * It bootstraps the application, initializes necessary components, and starts the embedded web server to handle incoming HTTP requests and responses.
 * Team Details: Srini Jammula, Tejeswar Sadanandan, Aditya Gottipati, Sruthi Sivasamy
 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SurveySpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurveySpringApplication.class, args);
	}

}
