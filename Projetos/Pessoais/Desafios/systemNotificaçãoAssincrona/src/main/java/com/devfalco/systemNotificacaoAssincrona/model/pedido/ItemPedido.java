package com.devfalco.systemNotificacaoAssincrona.model.pedido;

import java.util.UUID;

import jakarta.persistence.Table;


@Table(name = "name")
public class ItemPedido {
  UUID id;
  String nomeProduto;
  Float quantidade;
  
}
