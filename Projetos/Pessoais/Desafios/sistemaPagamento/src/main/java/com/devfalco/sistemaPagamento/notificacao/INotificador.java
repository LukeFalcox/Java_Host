package com.devfalco.sistemaPagamento.notificacao;

public interface INotificador {

  void writeMethod(Notificacao dNotificacao);

  Notificacao sendNotificação();
}
