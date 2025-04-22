package com.devfalco.apirestfull.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devfalco.apirestfull.model.UserModel;
import com.devfalco.apirestfull.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
  private final UserService userService; 

  public UserController(UserService userService){
    this.userService = userService;
  }

  @GetMapping
  public List<UserModel> getUsers(@RequestParam( required = false) Integer id){
      return userService.finduser(id);
  }

  @PostMapping
  public void registerUsuario(@RequestBody UserModel userModel){
      userService.saveUser(userModel);
  }
  
}
