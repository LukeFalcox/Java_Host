package com.devfalco.systemNotificacaoAssincrona.model.pedido;


import java.sql.Date;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
  @GeneratedValue
  @Id
  UUID id;
  String clientEmail;
  Float valorTotal;
  Date data;
  StatusPedido status;
  List<ItemPedido> itens;

}

