package com.devfalco.sistemaPagamento.pagamento;

import com.devfalco.sistemaPagamento.model.Pedido;
import com.devfalco.sistemaPagamento.model.PedidoDto;

public interface IPagamento {
    Pagamento pagar(PedidoDto pedidoDto);
    
} 
