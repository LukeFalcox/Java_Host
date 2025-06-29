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
    if (data.confirmPassword() == data.password()) {
      newstudent.setPassword(data.password());
    } else {
      return null;
    }
    newstudent.setUsername(data.username());
    studentRepository.save(newstudent);
    return newstudent;
  }

  public Student login(StudentDTO data){
    Student student = studentRepository.findByEmail(data.email());
   boolean verification = verification(student,data);
   if(verification == true){
    return student;
   } else {
    return null;
   }
  }

  boolean verification(Student student,  StudentDTO data){
    if(student.getEmail() == data.email() && student.getPassword() == data.password()){
        return true;
    }
    return false;
  }
}
