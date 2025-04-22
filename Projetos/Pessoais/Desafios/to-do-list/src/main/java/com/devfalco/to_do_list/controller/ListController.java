package com.devfalco.to_do_list.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


import com.devfalco.to_do_list.model.ListModel;
import com.devfalco.to_do_list.view.ListService;


@RestController
@RequestMapping("/to-do-list")
public class ListController {
  private ListService listService;


  public ListController(ListService listService){
    this.listService = listService;
  }

  @PostMapping
  public ListModel adicionarTarefa(@RequestBody ListModel listModel){
    return listService.save(listModel);
    
  }

  @GetMapping
  // Deixa o parametro como não obrigatorio
public List<ListModel> acharTarefas(@RequestParam(required = false) Long id) {
    return listService.findAll(id);
}


}
