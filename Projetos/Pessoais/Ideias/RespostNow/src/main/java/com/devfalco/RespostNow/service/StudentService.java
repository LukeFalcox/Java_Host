package com.devfalco.RespostNow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devfalco.RespostNow.dto.StudentDTO;
import com.devfalco.RespostNow.model.Student;
import com.devfalco.RespostNow.respository.StudentRepository;

@Service
public class StudentService {
  @Autowired
  StudentRepository studentRepository;
  public Student createStudent(StudentDTO data){
    Student newstudent = new Student();
    newstudent.setEmail(data.email());
    newstudent.setPassword(data.password());
    newstudent.setUsername(data.username());
    
    studentRepository.save(newstudent);
    return newstudent;
  }
}
