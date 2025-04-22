package com.devfalco.apirestfull.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devfalco.apirestfull.model.UserModel;

@Repository
public interface UserRepsoitory extends JpaRepository<UserModel, Integer>{
  
}
