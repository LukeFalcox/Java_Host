package com.devfalco.sistemaPagamento.pagamento;


public class PagamentoFactory {
  public  IPagamento getPagamento(String metodo){
    return switch (metodo.toLowerCase()) {
      case "cartao" -> new PagamentoCartao();
      case "pix" -> new PagamentoPix();
      default -> throw new IllegalArgumentException("Método Invalido");
    };
  }
  
} 
