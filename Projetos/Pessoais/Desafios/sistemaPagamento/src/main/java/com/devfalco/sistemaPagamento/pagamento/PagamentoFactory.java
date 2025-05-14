package com.devfalco.sistemaPagamento.pagamento;

import com.devfalco.sistemaPagamento.model.Pedido;
import com.devfalco.sistemaPagamento.model.PedidoDto;

public interface PagamentoFactory {
  String pagar(PedidoDto pedido);
} 
