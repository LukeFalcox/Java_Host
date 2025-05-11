package com.devfalco.systemNotificacaoAssincrona.service;

import org.springframework.stereotype.Service;

import com.devfalco.systemNotificacaoAssincrona.model.pedido.Pedido;
import com.devfalco.systemNotificacaoAssincrona.model.pedido.PedidoDTO;
import com.devfalco.systemNotificacaoAssincrona.repository.PedidoRepository;

@Service
public class PedidoService  {
  PedidoRepository pedidoRepository;
  public Pedido addcarrinho(PedidoDTO dados){
        Pedido newPedido = new Pedido();

        newPedido.setClientEmail(null);
        newPedido.setData(null);
        newPedido.setStatus(null);
        newPedido.setValorTotal(null);

        pedidoRepository.save(newPedido);

        return newPedido;
  }
}
