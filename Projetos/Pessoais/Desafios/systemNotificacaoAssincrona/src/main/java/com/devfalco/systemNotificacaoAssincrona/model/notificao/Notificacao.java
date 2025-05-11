package com.devfalco.systemNotificacaoAssincrona.model.notificao;

import java.sql.Date;
import java.util.UUID;

import com.devfalco.systemNotificacaoAssincrona.model.pedido.StatusPedido;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Notificacao {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public UUID notUuid;
  public UUID pedidoId;
  public String assunto;
  public String emailUser;
  public Date date;
  public StatusPedido pedido;
  
} 
