package com.devfalco.sistemaPagamento.notificacao;

public class NotificadorObserver implements INotificador {
  protected INotificador wrapper;

  public NotificadorObserver(INotificador dataNotificador){
    this.wrapper = dataNotificador;
  }

  @Override
  public void writeMethod(Notificacao dNotificacao) {
    
  }

  @Override
  public Notificacao sendNotificação() {
    return wrapper.sendNotificação();
  }
  
}
