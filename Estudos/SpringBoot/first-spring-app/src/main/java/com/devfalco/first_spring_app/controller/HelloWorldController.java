package com.devfalco.first_spring_app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devfalco.first_spring_app.domain.User;
import com.devfalco.first_spring_app.service.HelloWorldService;

@RestController /* 
Esta denotando que a classe é uma @Controller e uma @ResponseBody, pois nao é necessaria retorna uma resposta ele pode carregar algo
Aqui sera construida uma API 

STATELLES -> a cada nova requisicao eu recebo todas as informacao que eu preciso para fazer aquela funcionalidade que o cliente esta pedindo
STATEFUll -> o estado de cada cliente é mantido no servidro um bom exemplo é permitir deixar o usuario sempre Logado
*/ 
@RequestMapping("/hello-world") /* Vai repsonder/escutar todas as requisições que for do end-point repensentado dentro do ()*/
public class HelloWorldController {

  @Autowired
  private HelloWorldService helloWorldService;



  @GetMapping /*
  Ira ativar quando for um Get e com o endpoint /hello-world,
  pode se colocar algo dentro do get um () como no RequestMapping para representar mais alguma coisa que será /hello-world/get
  */ 
  public String helloWorld(){
    return helloWorldService.helloWorld("devFalco");
  }

  @PostMapping("")
  public String helloWorldPost(@RequestBody User body){
    return "Hello World Post" + body.getName();
  }
}
