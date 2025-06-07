package com.devfalco.sistemaPagamento.pagamento;

import java.sql.Date;

import com.devfalco.sistemaPagamento.model.Pedido;
import com.devfalco.sistemaPagamento.model.PedidoDto;

public class PagamentoCartao implements IPagamento{

  @Override
  public Pagamento pagar(PedidoDto pedido) {
    Pagamento pagamento = new Pagamento();
    pagamento.setPedoUuid(pedido.);
    pagamento.setMetodo();
    pagamento.setData(new Date(System.currentTimeMillis()));
    pagamento.setValor(pedido.valorTotal());
    return ;
  }




 
  
}
