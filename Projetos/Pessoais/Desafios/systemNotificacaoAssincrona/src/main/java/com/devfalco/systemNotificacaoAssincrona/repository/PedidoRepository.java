package com.devfalco.systemNotificacaoAssincrona.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devfalco.systemNotificacaoAssincrona.model.pedido.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,UUID>{
  
}
