package com.devfalco.RespostNow.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.devfalco.RespostNow.model.Tests;

public interface TestsRespository extends JpaRepository<Tests,Integer>{

}
