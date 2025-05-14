package com.devfalco.sistemaPagamento.pagamento;

import com.devfalco.sistemaPagamento.model.Pedido;
import com.devfalco.sistemaPagamento.model.PedidoDto;

public class PagamentoPix implements PagamentoFactory {

  @Override
  public String pagar(PedidoDto pedido) {
    return "Ok";  
  }

  // acredito que deva retornar uma notificação



  
  
}
