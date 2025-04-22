package com.devfalco.to_do_list.view;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.devfalco.to_do_list.model.ListModel;
import com.devfalco.to_do_list.repository.ListRepository;

@Service
public class ListService {

  private ListRepository listRepository;

  public ListService(ListRepository listRepository){
    this.listRepository = listRepository;
  }


  
  public ListModel save(ListModel listModel){
     ListModel listacriada = listRepository.save(listModel);
      return listacriada;
  } 

  public List<ListModel> findAll(Long id){
    if (id == null) {
      return listRepository.findAll();
    } else {
      Optional<ListModel> optional = listRepository.findById(id);
      return optional.map(Collections::singletonList).orElse(Collections.emptyList());
  }
  }
  
}
