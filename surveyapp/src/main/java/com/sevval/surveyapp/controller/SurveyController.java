package com.sevval.surveyapp.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurveyController {
    @GetMapping("/hello")
    public String hello(){
        return "Merhaba Dünya, Bu ilk Spring kodu";
    }
}
