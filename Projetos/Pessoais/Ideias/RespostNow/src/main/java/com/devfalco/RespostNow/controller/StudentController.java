package com.devfalco.RespostNow.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devfalco.RespostNow.dto.StudentDTO;
import com.devfalco.RespostNow.model.Student;
import com.devfalco.RespostNow.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
  @Autowired
  private StudentService studentService;
    public StudentController(StudentService studentService) {
    this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Student> createUser(@RequestBody StudentDTO dStudentDTO){
        Student student = studentService.createStudent(dStudentDTO);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
        
    }
  
}
