package com.swe.Survey_Spring.controller;

/*
 * SurveyController.java:
 * This file contains the controller logic for handling HTTP requests related to survey data.
 * It defines endpoints and maps them to appropriate methods for processing incoming requests and returning responses.
 * Team Details: Srini Jammula, Tejeswar Sadanandan, Aditya Gottipati, Sruthi Sivasamy
 */

import com.swe.Survey_Spring.entity.Survey;
import com.swe.Survey_Spring.service.SurveyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin("*")
public class SurveyController {
    private final SurveyService surveyService;

    @PostMapping("/studentsurvey")
    public Survey postSurvey(@RequestBody Survey survey){
        return surveyService.postSurvey(survey);
    }

    @GetMapping("/studentsurveys")
    private List<Survey> getAllSurvey() {
        return surveyService.getAllSurvey();
    }

    @GetMapping("/studentsurvey/{id}")
    public ResponseEntity<Survey> getSurveyById(@PathVariable Long id) {
        Survey survey = surveyService.getSurveyById(id);
        if (survey == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(survey);
    }

    @PutMapping("/studentsurvey/{id}")
    public ResponseEntity<Survey> updateSurvey(@PathVariable Long id, @RequestBody Survey survey) {
        Survey existingSurvey = surveyService.getSurveyById(id);
        if (existingSurvey == null) {
            return ResponseEntity.notFound().build();
        }
        existingSurvey.setFirstname(survey.getFirstname());
        existingSurvey.setLastname(survey.getLastname());
        existingSurvey.setStreetAddress(survey.getStreetAddress());
        existingSurvey.setCity(survey.getCity());
        existingSurvey.setState(survey.getState());
        existingSurvey.setZip(survey.getZip());
        existingSurvey.setPhone(survey.getPhone());
        existingSurvey.setEmail(survey.getEmail());
        existingSurvey.setDos(survey.getDos());
        existingSurvey.setStudents(survey.getStudents());
        existingSurvey.setLocation(survey.getLocation());
        existingSurvey.setCampus(survey.getCampus());
        existingSurvey.setAtmosphere(survey.getAtmosphere());
        existingSurvey.setDormrooms(survey.getDormrooms());
        existingSurvey.setSports(survey.getSports());
        existingSurvey.setInterested(survey.getInterested());
        existingSurvey.setRecommend(survey.getRecommend());
        existingSurvey.setComments(survey.getComments());

        Survey updatedSurvey = surveyService.updateSurvey(existingSurvey);
        return ResponseEntity.ok(updatedSurvey);
    }

    @DeleteMapping("/studentsurvey/{id}")
    public ResponseEntity<?> deleteSurvey(@PathVariable Long id) {
        Survey existingSurvey = surveyService.getSurveyById(id);
        if (existingSurvey == null) {
            return ResponseEntity.notFound().build();
        }
        surveyService.deleteSurvey(id);
        return ResponseEntity.ok().build();
    }



}
