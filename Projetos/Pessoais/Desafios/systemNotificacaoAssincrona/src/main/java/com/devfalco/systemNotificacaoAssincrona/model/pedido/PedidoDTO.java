package com.devfalco.systemNotificacaoAssincrona.model.pedido;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public record PedidoDTO(
  String clientEmail,
  Float valorTotal,
  Date data,
  StatusPedido status,
  List<ItemPedido> itens
) {
  
}
