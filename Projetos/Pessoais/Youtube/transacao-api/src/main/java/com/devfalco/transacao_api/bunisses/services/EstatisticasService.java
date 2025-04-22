package com.devfalco.transacao_api.bunisses.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import com.devfalco.transacao_api.controller.dtos.EstatisticasResponseDTO;
import com.devfalco.transacao_api.controller.dtos.TransacaoRequestDTO;

import java.util.DoubleSummaryStatistics;

@Service 
@RequiredArgsConstructor
@Slf4j
public class EstatisticasService {
  public final TransacaoService transacaoService;

  public EstatisticasResponseDTO calcularEstaticasTransacoes(Integer intervaloBusca){

    log.info("Iniciando busca de estatisticas de transações pelo tempo perido de ");
    List<TransacaoRequestDTO> transacoes = transacaoService.buscarTransacoes(intervaloBusca);

    if(transacoes.isEmpty()){
      log.info("Nenhuma transação encontrada");
      return new EstatisticasResponseDTO(0L, 0.00, 0.00, 0.00, 0.00);
    }

    DoubleSummaryStatistics estatisticasTransacoes = transacoes.stream()
      .mapToDouble(TransacaoRequestDTO::valor).summaryStatistics();

      log.info("Estatisticas calculadas com sucesso");

      return new EstatisticasResponseDTO(estatisticasTransacoes.getCount(),
      estatisticasTransacoes.getSum(), estatisticasTransacoes.getAverage(),
      estatisticasTransacoes.getMin(), estatisticasTransacoes.getMax());

    
  }


}
