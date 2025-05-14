package com.devfalco.sistemaPagamento.notificacao;

public class NotificadorBase implements INotificador{

  @Override
  public void writeMethod(Notificacao dNotificacao) {
    System.out.println("Registrando notificação");
  }

  @Override
  public Notificacao sendNotificação() {
    return new Notificacao();
  }
  
}
