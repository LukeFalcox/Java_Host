package com.devfalco.integerbd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class ProductModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String price;

  public ProductModel(){
  }
  public ProductModel(Integer id,String name,String price){
    this.id = id ; 
    this.name  = name ; 
    this.price = price;
  }

  public void setId(Integer id){
    this.id = id ;
  }

  public void setName(String name){
  this.name = name ;
  }

  public void setPrice(String price){
  this.price = price ;
  }

  public Integer getId(){
    return this.id;
  }

  public String getName(){
  return this.name; 
  }

  public String getPrice(){
  return this.price; 
  }
  
  
}