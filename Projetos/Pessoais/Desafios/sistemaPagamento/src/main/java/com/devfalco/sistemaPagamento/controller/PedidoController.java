package com.devfalco.sistemaPagamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devfalco.sistemaPagamento.model.PedidoDto;
import com.devfalco.sistemaPagamento.notificacao.Notificacao;
import com.devfalco.sistemaPagamento.pagamento.Pagamento;
import com.devfalco.sistemaPagamento.pagamento.PagamentoDto;
import com.devfalco.sistemaPagamento.service.PedidoService;

@RestController
@RequestMapping("/sispag")
public class PedidoController {

  @Autowired
  PedidoService pedidoService;


  @PostMapping
  ResponseEntity<Notificacao> gerarPedido(@RequestBody PedidoDto dto){
   return ResponseEntity.ok(pedidoService.gerarPedido(dto));
  }

  ResponseEntity<Pagamento> pagar(@RequestBody PagamentoDto dto){
      Pagamento pagamento = pedidoService.procesarPagamento(dto);
      return ResponseEntity.ok(pagamento);
  }
}
