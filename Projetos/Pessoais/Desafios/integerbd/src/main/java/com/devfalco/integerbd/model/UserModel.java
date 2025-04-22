package com.devfalco.integerbd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UserModel{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id; 
  private String username;
  private String password;

  public UserModel(){
    
  }
  public UserModel(Integer id,String username,String password){
    this.id = id ;
    this.username = username ;
    this.password = password ;
  }


  public void setId(Integer id){
      this.id = id;
  }   
  public void setUsername(String username){
    this.username = username;
  }
  public void setPassword(String password){
    this.password = password;
  }
  public Integer getId(){
    return this.id;
  }   
  public String getUsername(){
    return this.username; 
  }
  public String getPassword(){
    return this.password;
  }
}