package com.devfalco.transacao_api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.Operation;
import com.devfalco.transacao_api.bunisses.services.EstatisticasService;
import com.devfalco.transacao_api.controller.dtos.EstatisticasResponseDTO;

@RequiredArgsConstructor
@RestController
@RequestMapping("/estatisticas")
public class EstatisticasController {
  private final EstatisticasService estatisticasService;

  @GetMapping
  @Operation(description = "Busca estatisticas das transações")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "Busca efetuada com sucesso"),
    @ApiResponse(responseCode = "400", description = "Erro na busca de estatisticas"),
    @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
  })
  public ResponseEntity<EstatisticasResponseDTO> buscarEstatisticas(@RequestParam(value = "intervaloBusca", required = false, defaultValue= "60") Integer intervaloBusca){
    return ResponseEntity.ok(estatisticasService.calcularEstaticasTransacoes(intervaloBusca));
  }
}
