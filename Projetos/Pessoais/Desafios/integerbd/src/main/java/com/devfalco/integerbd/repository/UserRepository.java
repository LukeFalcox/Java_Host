package com.devfalco.integerbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devfalco.integerbd.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Integer>{

  
}
