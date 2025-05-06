package com.devfalco.systemNotificacaoAssincrona.model.notificao;

import java.sql.Date;
import java.util.UUID;

import com.devfalco.systemNotificacaoAssincrona.model.pedido.StatusPedido;


public class NotificacaoDTO {
  String assunto;
  String emailUser;
  UUID pedidoId;
  Date date;
  StatusPedido pedido;
}
