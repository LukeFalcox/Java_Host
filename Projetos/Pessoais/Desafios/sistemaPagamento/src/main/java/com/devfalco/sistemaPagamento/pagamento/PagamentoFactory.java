package com.devfalco.sistemaPagamento.pagamento;

import com.devfalco.sistemaPagamento.model.Pedido;

public interface PagamentoFactory {
  String pagar(Pedido pedido);
} 
