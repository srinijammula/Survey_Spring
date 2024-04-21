package com.swe.Survey_Spring.entity;

/*
 * Entity.java:
 * This file defines the entity class representing survey data.
 * It typically contains attributes corresponding to the survey form fields and methods for accessing and manipulating this data.
 * Team Details: Srini Jammula, Tejeswar Sadanandan, Aditya Gottipati, Sruthi Sivasamy
 */

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="survey")
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;
    private Date dos;
    private Boolean students;
    private Boolean location;
    private Boolean campus;
    private Boolean atmosphere;
    private Boolean dormrooms;
    private Boolean sports;
    private String interested;
    private String recommend;
    private String comments;
}
