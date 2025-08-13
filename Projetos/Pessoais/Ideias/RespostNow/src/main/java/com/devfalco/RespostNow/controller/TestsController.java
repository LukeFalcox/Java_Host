package com.devfalco.RespostNow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devfalco.RespostNow.dto.TestsDTO;
import com.devfalco.RespostNow.model.Tests;
import com.devfalco.RespostNow.service.TestService;

@RestController
@RequestMapping("/tests")
public class TestsController {

    @Autowired
    private TestService testService;
    public TestsController(TestService testService){
        this.testService = testService;
    }

    @PostMapping("/newTest")
    public ResponseEntity<Tests> createTest(@RequestBody TestsDTO dTestDto){
        Tests newTests = testService.createTest(dTestDto);
        return ResponseEntity.ok(newTests);
    }
    @PostMapping("/alterTest")
    public ResponseEntity<Tests> alterTest(@RequestBody TestsDTO dTestDto){
        Tests newTests = testService.alterTest(dTestDto);
        return ResponseEntity.ok(newTests);
    }
    @PostMapping("/deleteTest")
    public ResponseEntity<Tests> deleteTest(@RequestBody TestsDTO dTestDto){
        Tests newTests = testService.deleteTest(dTestDto);
        return ResponseEntity.ok(newTests);
    }
    @GetMapping("/findTest")
    public ResponseEntity<Tests> findTest(@RequestBody TestsDTO dTestDto){
        Tests newTests = testService.getTest(dTestDto);
        return ResponseEntity.ok(newTests);
    }
    
}
