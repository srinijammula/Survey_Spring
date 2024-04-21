package com.swe.Survey_Spring.repository;

/*
 * repository.java:
 * This file defines the repository interface for interacting with the database to perform CRUD operations on survey data.
 * It typically includes methods for saving, retrieving, updating, and deleting survey records.
 * Team Details: Srini Jammula, Tejeswar Sadanandan, Aditya Gottipati, Sruthi Sivasamy
 */

import com.swe.Survey_Spring.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository extends JpaRepository<Survey,Long> {
}
