package com.devfalco.systemNotificacaoAssincrona.model.pedido;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "itens")
public class ItemPedido {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  UUID id;
  String nomeProduto;
  Float quantidade;
  
}
