package com.devfalco.integerbd.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devfalco.integerbd.model.UserModel;
import com.devfalco.integerbd.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
  private final UserService userService;

  public UserController(UserService userService){
    this.userService = userService;
  }
  @PostMapping
  public UserModel createUser(@RequestBody UserModel userModel){
      return userService.create(userModel);
  }
  @GetMapping
  public List<UserModel> findUser(@RequestParam(required = false) Integer id){
      return userService.find(id);
  }
  @DeleteMapping
  public String deleteUser(@RequestParam(required = false) Integer id){
   boolean value = userService.delete(id);

   if (value) {
    return "Produto Deletado com Sucesso";
    } else {
      return "Produto não encontrado"; 
   }

  }
}
