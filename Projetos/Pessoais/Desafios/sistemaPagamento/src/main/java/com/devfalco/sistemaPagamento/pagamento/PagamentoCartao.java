package com.devfalco.sistemaPagamento.pagamento;

import com.devfalco.sistemaPagamento.model.Pedido;
import com.devfalco.sistemaPagamento.model.PedidoDto;

public class PagamentoCartao implements PagamentoFactory{

  @Override
  public String pagar(PedidoDto pedido) {
    return "ok";  
  }




 
  
}
