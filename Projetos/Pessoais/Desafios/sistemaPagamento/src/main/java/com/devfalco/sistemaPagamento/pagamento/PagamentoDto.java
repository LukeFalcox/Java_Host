package com.devfalco.sistemaPagamento.pagamento;

import java.util.UUID;

public record PagamentoDto(UUID pedidoId, String metodoPagamento) {
} 
