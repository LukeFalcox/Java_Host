package com.devfalco.systemNotificacaoAssincrona.model.notificao;

import java.sql.Date;
import java.util.UUID;

import com.devfalco.systemNotificacaoAssincrona.model.pedido.StatusPedido;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Notificacao {
  public UUID pedidoId;
  public String assunto;
  public String emailUser;
  public Date date;
  public StatusPedido pedido;
  
} 
