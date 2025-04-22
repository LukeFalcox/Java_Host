package com.devfalco.firstspringapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Ela combina as anotações @Controller e @ResponseBody
@RequestMapping("/hello") // Define o caminho base para todos os endpoints desta controller
public class HelloWorldController {
  // GET -> /hello/get
  @GetMapping()
  public String helloWorld(){
    return "Hello World";
  }
}

// API STATELESS -> A cada nova requisição recebe todas as informações necessárias para realizar uma determinada ação
// API STATEFUL -> Mantém o estado de cada cliente no servidor