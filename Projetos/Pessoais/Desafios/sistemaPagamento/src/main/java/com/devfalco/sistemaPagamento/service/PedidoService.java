package com.devfalco.sistemaPagamento.service;

import java.sql.Date;

import com.devfalco.sistemaPagamento.model.PedidoDto;
import com.devfalco.sistemaPagamento.notificacao.EmailNotificador;
import com.devfalco.sistemaPagamento.notificacao.INotificador;
import com.devfalco.sistemaPagamento.notificacao.Notificacao;
import com.devfalco.sistemaPagamento.notificacao.NotificacaoDto;
import com.devfalco.sistemaPagamento.notificacao.NotificadorBase;
import com.devfalco.sistemaPagamento.notificacao.SMSNotificador;
import com.devfalco.sistemaPagamento.notificacao.WhatsNotificador;
import com.devfalco.sistemaPagamento.pagamento.PagamentoFactory;

public class PedidoService {
  private PagamentoFactory pagamentoFactory;
  private INotificador notificador;


  PedidoService(){
     this.notificador = new SMSNotificador(
                            new EmailNotificador(
                              new WhatsNotificador(
                                new NotificadorBase())));
  }

  void setPagamento(PagamentoFactory pagamentoFactory) {
    this.pagamentoFactory = pagamentoFactory;
  }

  String executePagamento(PedidoDto pedido){
    return pagamentoFactory.pagar(pedido);
  }

  Notificacao gerarPedido(PedidoDto pedidoDto){
    Notificacao notificacao = new Notificacao();
    notificacao.setEmissao(new Date(System.currentTimeMillis()));
    notificacao.setMensagem("Pedido gerado");
    notificador.writeMethod(notificacao);
    return notificador.sendNotificação();
  }

}
