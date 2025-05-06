package com.devfalco.systemNotificacaoAssincrona.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.devfalco.systemNotificacaoAssincrona.model.notificao.CanalNotificacao;
import com.devfalco.systemNotificacaoAssincrona.model.notificao.Notificacao;
import com.devfalco.systemNotificacaoAssincrona.model.notificao.NotificacaoDTO;
import com.devfalco.systemNotificacaoAssincrona.model.notificao.NotificacaoFactory;
import com.devfalco.systemNotificacaoAssincrona.model.pedido.Pedido;




public class NotificacaoService extends Thread{
  private final List<CanalNotificacao> canais;

  @Autowired
  public NotificacaoService(List<CanalNotificacao> canais){
    this.canais = canais;
  }

  public void notificar(Pedido pedido) {
    Notificacao notificacao = new Notificacao();
    notificacao.emailUser = pedido.getClientEmail();
    notificacao.assunto = "Pedido criado com sucesso!";
    notificacao.pedidoId = pedido.getId();
    notificacao.date = pedido.getData();
    notificacao.pedido = pedido.getStatus();

    for (CanalNotificacao canal : canais) {
        new Thread(() -> canal.enviar(notificacao)).start(); // cada canal em sua thread
    }
}

  
}
