package com.devfalco.systemNotificacaoAssincrona.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devfalco.systemNotificacaoAssincrona.model.notificao.CanalNotificacao;
import com.devfalco.systemNotificacaoAssincrona.model.pedido.Pedido;
import com.devfalco.systemNotificacaoAssincrona.model.pedido.PedidoDTO;
import com.devfalco.systemNotificacaoAssincrona.service.NotificacaoService;
import com.devfalco.systemNotificacaoAssincrona.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController{


    @Autowired
    PedidoService pedidoService;

    @Autowired 
    NotificacaoService notificacaoService;

  @PostMapping
  public ResponseEntity<Pedido> carrinho(@RequestBody PedidoDTO dados){
    try {
      Pedido pedido = pedidoService.addcarrinho(dados);
      notificacaoService.notificar(pedido);

      return ResponseEntity.ok(pedido);
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }
}
