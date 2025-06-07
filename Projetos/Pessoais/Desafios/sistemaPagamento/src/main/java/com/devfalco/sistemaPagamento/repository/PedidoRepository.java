package com.devfalco.sistemaPagamento.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfalco.sistemaPagamento.model.Pedido;
import com.devfalco.sistemaPagamento.model.PedidoDto;

public interface PedidoRepository extends JpaRepository<PedidoDto, UUID >{

  
}
