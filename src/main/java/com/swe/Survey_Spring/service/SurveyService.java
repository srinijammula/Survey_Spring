package com.swe.Survey_Spring.service;

/*
 * SurveyService.java:
 * This file contains the service layer logic for processing survey data.
 * It encapsulates the business logic for handling survey operations such as validation, transformation, and interaction with the repository.
 * Team Details: Srini Jammula, Tejeswar Sadanandan, Aditya Gottipati, Sruthi Sivasamy
 */

import com.swe.Survey_Spring.entity.Survey;
import com.swe.Survey_Spring.repository.SurveyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SurveyService {

    private final SurveyRepository surveyRepository;

    public Survey postSurvey(Survey survey){
        return surveyRepository.save(survey);
    }

    public List<Survey> getAllSurvey() {
        return surveyRepository.findAll();
    }

    public Survey getSurveyById(Long id) {
        return surveyRepository.findById(id).orElse(null);
    }

    public Survey updateSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }

    public void deleteSurvey(Long id) {
        surveyRepository.deleteById(id);
    }

}
