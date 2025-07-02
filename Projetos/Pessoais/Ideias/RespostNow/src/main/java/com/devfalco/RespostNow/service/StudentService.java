package com.devfalco.RespostNow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devfalco.RespostNow.dto.StudentDTO;
import com.devfalco.RespostNow.model.STATUS;
import com.devfalco.RespostNow.model.Student;
import com.devfalco.RespostNow.respository.StudentRepository;

@Service
public class StudentService {
  @Autowired
  StudentRepository studentRepository;

  public Student createStudent(StudentDTO data) {
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

  public Student login(StudentDTO data) {
    Student student = studentRepository.findByEmail(data.email());
    if (student == null) {
      throw new RuntimeException("Usuario Inexistente");
    }
    if (!student.getEmail().equals(data.email()) || !student.getPassword().equals(data.password())) {
      throw new RuntimeException("Email e Senha invalidas");
    }
    if (!student.getStatus().equals(STATUS.LOGADO)) {
      throw new RuntimeException("Usuario ja esta Logado");
    }
    
    student.setStatus(STATUS.LOGADO);
    studentRepository.save(student);
    return student;
  }

  public Student logout(StudentDTO data) {
    Student student = studentRepository.findByEmail(data.email());

    if (student == null) {
      throw new RuntimeException("Usuario Inexistente");
    }
    if (!student.getEmail().equals(data.email()) || !student.getPassword().equals(data.password())) {
      throw new RuntimeException("Email e Senha invalidas");
    }
    if (!student.getStatus().equals(STATUS.LOGADO)) {
      throw new RuntimeException("Usuario ja esta Logado");
    }

    student.setStatus(STATUS.LOGOUT);
    studentRepository.save(student);
    return student;
    
  }

  Student deleteUser(StudentDTO data) {
    Student student = studentRepository.findByEmail(data.email());

    studentRepository.delete(student);

    return student;

  }
}
