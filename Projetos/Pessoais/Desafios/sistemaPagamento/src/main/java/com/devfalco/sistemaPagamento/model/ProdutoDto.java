package com.devfalco.sistemaPagamento.model;

import java.util.UUID;

public record ProdutoDto(
  UUID id,
String nomeproduto,
Integer quantidade,
String valor
) {
  
}
