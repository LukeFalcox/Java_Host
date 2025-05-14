package com.devfalco.sistemaPagamento.notificacao;

public class EmailNotificador extends NotificadorObserver{
  public EmailNotificador(INotificador dataNotificador) {
    super(dataNotificador);
  }

  @Override
  public Notificacao sendNotificação() {
    return super.sendNotificação();
  }

  @Override
  public void writeMethod(Notificacao dNotificacao) {
    super.writeMethod(dNotificacao);
  }
}
