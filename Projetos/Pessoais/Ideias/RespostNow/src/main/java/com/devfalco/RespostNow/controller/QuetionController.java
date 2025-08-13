package com.devfalco.RespostNow.controller;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devfalco.RespostNow.config.AuthResponse;

@RestController
@RequestMapping("/questions")
public class QuetionController {
   @Autowired
   private QuestionService questionService
   
   public QuestionController(QuestionService questionService){
    this.questionService = questionService;
   }


   PostMapping("/newQuestion")
   public ResponseEntity<AuthResponse> createQuestion(QuestionDto)

}
