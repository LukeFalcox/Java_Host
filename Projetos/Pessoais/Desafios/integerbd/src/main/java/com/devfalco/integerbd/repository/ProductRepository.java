package com.devfalco.integerbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devfalco.integerbd.model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel,Integer>{

  
}
