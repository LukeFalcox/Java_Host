package com.devfalco.integerbd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devfalco.integerbd.model.UserModel;
import com.devfalco.integerbd.repository.UserRepository;

@Service
public class UserService {
  private UserRepository userRepository;

  public UserService(UserRepository userRepository){
    this.userRepository = userRepository;
  }

  public List<UserModel> find(Integer id){
    if (id == null) {
      return userRepository.findAll();
    } else {
      return userRepository.findById(id).map(List::of).orElse(List.of());
    }
  }

  public boolean delete(Integer value){
    if (value == null) {
      return false;
    } else {
      return true;
    }
  }

  public UserModel create(UserModel userModel){
    return userRepository.save(userModel);
  }


}
