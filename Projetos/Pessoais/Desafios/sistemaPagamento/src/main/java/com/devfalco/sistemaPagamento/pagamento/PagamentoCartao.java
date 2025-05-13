package com.devfalco.sistemaPagamento.pagamento;

import com.devfalco.sistemaPagamento.model.Pedido;

public class PagamentoCartao implements PagamentoFactory{

  @Override
  public String pagar(Pedido pedido) {
    return "pagamento Realizado";
  }



 
  
}
