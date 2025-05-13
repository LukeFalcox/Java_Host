package com.devfalco.sistemaPagamento.service;

import com.devfalco.sistemaPagamento.model.Pedido;
import com.devfalco.sistemaPagamento.pagamento.PagamentoFactory;

public class PedidoService {
  private PagamentoFactory pagamentoFactory;

  void setPagamento(PagamentoFactory pagamentoFactory) {
    this.pagamentoFactory = pagamentoFactory;
  }

  String executePagamento(Pedido pedido){
    return pagamentoFactory.pagar(pedido);
  }
}
