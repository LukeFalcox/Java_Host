package com.devfalco.apirestfull.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.devfalco.apirestfull.model.UserModel;
import com.devfalco.apirestfull.repository.UserRepsoitory;

@Service
public class UserService {
  private UserRepsoitory userRepsoitory;

  public UserService(UserRepsoitory userRepsoitory){
    this.userRepsoitory = userRepsoitory;
  }

  public List<UserModel> finduser(Integer id){
    if (id != null) {
      // o List::of esta pegando o unico valor achado e transformando em uma lista de um unico Objeto, ja se ele não achar nenhum outro objeto ele retorna uma lista vazia.
     return userRepsoitory.findById(id).map(List::of).orElse(List.of());
    }
    else {
      return userRepsoitory.findAll();
    }
  }

  public void saveUser(UserModel userModel){
        userRepsoitory.save(userModel);
  }
}
