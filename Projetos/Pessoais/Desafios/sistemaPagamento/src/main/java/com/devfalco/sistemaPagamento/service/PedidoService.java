package com.devfalco.sistemaPagamento.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.devfalco.sistemaPagamento.model.Pedido;
import com.devfalco.sistemaPagamento.model.PedidoDto;
import com.devfalco.sistemaPagamento.model.Produto;
import com.devfalco.sistemaPagamento.model.StatusPedido;
import com.devfalco.sistemaPagamento.notificacao.INotificador;
import com.devfalco.sistemaPagamento.notificacao.Notificacao;
import com.devfalco.sistemaPagamento.pagamento.IPagamento;
import com.devfalco.sistemaPagamento.pagamento.Pagamento;
import com.devfalco.sistemaPagamento.pagamento.PagamentoDto;
import com.devfalco.sistemaPagamento.pagamento.PagamentoFactory;
import com.devfalco.sistemaPagamento.repository.PedidoRepository;

public class PedidoService {
  @Autowired
  private PagamentoFactory pagamentoFactory;
  @Autowired
  private INotificador notificador;
  @Autowired
  private PedidoRepository pedidoRepository;


  

  public Pagamento procesarPagamento(PagamentoDto pagamentoDto){
    Optional<PedidoDto> pedidoDtoOptional = pedidoRepository.findById(pagamentoDto.pedidoId());
    if (pedidoDtoOptional.isEmpty()) {
      throw new RuntimeException("Pedid0 Não encontrado");
    }
    PedidoDto pedido = pedidoDtoOptional.get();
    IPagamento estrategia = pagamentoFactory.getPagamento(pagamentoDto.metodoPagamento());
    return estrategia.pagar(pedido);
  }

  public Notificacao gerarPedido(PedidoDto pedidoDto){
    Pedido pedido = new Pedido();
    pedido.setCpf(pedidoDto.cpf());
    pedido.setNomecliente(pedidoDto.nomecliente());
    pedido.setStatus(StatusPedido.PENDENTE);
    pedido.setValorTotal(pedidoDto.valorTotal());
    List<Produto> produtos = pedidoDto.produtos().stream().map(produto -> new Produto(produto.nomeproduto(),produto.quantidade(),produto.valor())).toList();
    pedido.setProdutos(produtos);
    
    Notificacao newNotificacao = new Notificacao();

    newNotificacao.setMensagem("Pedido gerado");
    notificador.writeMethod(newNotificacao);
    return notificador.sendNotificação();
  }

  

}
