package com.devfalco.systemNotificacaoAssincrona.model.notificao;


public class Push implements CanalNotificacao{

  @Override
  public Notificacao enviar(Notificacao notificacao) {
    Notificacao newNotificacao = new Notificacao();
    newNotificacao.setAssunto(notificacao.assunto);
    newNotificacao.setEmailUser(notificacao.emailUser);
    newNotificacao.setPedido(notificacao.pedido);
    newNotificacao.setDate(notificacao.date);
    newNotificacao.setPedidoId(newNotificacao.pedidoId);

    return newNotificacao;
  }

  
  
}
