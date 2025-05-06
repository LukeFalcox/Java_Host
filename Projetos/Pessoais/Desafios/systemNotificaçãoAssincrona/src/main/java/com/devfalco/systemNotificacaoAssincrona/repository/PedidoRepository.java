package com.devfalco.systemNotificacaoAssincrona.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfalco.systemNotificacaoAssincrona.model.pedido.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido,UUID>{
  
}
