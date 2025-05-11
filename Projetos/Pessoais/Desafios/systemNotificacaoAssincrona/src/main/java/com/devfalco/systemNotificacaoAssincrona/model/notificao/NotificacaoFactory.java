package com.devfalco.systemNotificacaoAssincrona.model.notificao;

public class NotificacaoFactory {
  public static CanalNotificacao criarNotificacao(String tipo){
    return  switch (tipo.toLowerCase()) {
      case "email" -> new Email();
      case "sms" -> new SMS();
      case "push" -> new Push();
      default -> throw new IllegalArgumentException("Tipo de notificacao invalido"+tipo);

    };
  }
}
