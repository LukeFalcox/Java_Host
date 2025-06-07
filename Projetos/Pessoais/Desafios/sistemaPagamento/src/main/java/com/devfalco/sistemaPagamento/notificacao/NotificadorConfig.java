package com.devfalco.sistemaPagamento.notificacao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificadorConfig {
  
  @Bean
  public INotificador notificador(){
    return new SMSNotificador(new EmailNotificador(new WhatsNotificador(new NotificadorBase())));
  }
}
