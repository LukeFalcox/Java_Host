package com.devfalco.transacao_api.bunisses.services;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.devfalco.transacao_api.controller.dtos.TransacaoRequestDTO;
import com.devfalco.transacao_api.infrastructure.exceptions.UnprocessableEntity;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j 
public class TransacaoService {
  private final List<TransacaoRequestDTO> listaTransacoes = new ArrayList<>();


  public void adicionarTransacao(TransacaoRequestDTO dto){

    log.info("Iniciando o processamento de gravar transações" + dto);

    if(dto.dataHora().isAfter(OffsetDateTime.now())){
      log.error("Data e hora maiores que a data atual");
      throw new UnprocessableEntity("Data e hora maiores que a data atual");
    }
    if(dto.valor() < 0){
      log.error("Valor não pode ser menor que 0");
      throw new UnprocessableEntity("Valor não pode ser menor que 0");
    }

    listaTransacoes.add(dto);
    log.info("Transação gravada com sucesso");
  }

  public void limparTransacoes(){
    log.info("Limpando lista de transações");
    listaTransacoes.clear();
    log.info("Lista de transações limpa com sucesso");

  }

  public List<TransacaoRequestDTO> buscarTransacoes(Integer intervaloBusca){
    log.info("Buscando transações no intervalo de " + intervaloBusca + " segundos");
    OffsetDateTime dataHoraIntervalo = OffsetDateTime.now().minusSeconds(intervaloBusca);
  
    log.info("Retorno de transações encontradas");
    return listaTransacoes.stream().filter(transacao -> transacao.dataHora().isAfter(dataHoraIntervalo)).toList();
  }
}
