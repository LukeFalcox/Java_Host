package com.devfalco.apirestfull.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Nomeia a classe como uma entidade
@Entity
public class UserModel {
  //nomeia a variavel "id" como um ID que se gera de forma automatica
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String username;
  private String password;

  public UserModel() {
  }
  

  // Criação de um construtor
  public UserModel(Integer id, String username, String password){
      this.id =  id;
      this.username = username ; 
      this.password = password ;
  }


  // funções de getters e setters para pegar o valores atribuidos ou atribui-los

  public Integer getId(){
    return this.id;
  }
  public String  getUsername(){
    return this.username;
  }
  public String  getPassword(){
    return this.password;
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
  
}
