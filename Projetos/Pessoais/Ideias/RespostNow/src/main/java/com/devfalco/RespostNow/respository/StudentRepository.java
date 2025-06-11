package com.devfalco.RespostNow.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfalco.RespostNow.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

  
}