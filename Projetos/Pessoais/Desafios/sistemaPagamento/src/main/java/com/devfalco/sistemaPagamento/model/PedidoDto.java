package com.devfalco.sistemaPagamento.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

public record PedidoDto(String nomecliente,String cpf,Double valorTotal,  List<ProdutoDto> produtos) {
  
}
