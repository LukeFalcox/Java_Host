package com.devfalco.transacao_api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.devfalco.transacao_api.controller.dtos.TransacaoRequestDTO;
import com.devfalco.transacao_api.bunisses.services.TransacaoService;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

  private final TransacaoService transacaoService;
  
  @PostMapping
  @Operation(description = "Adiciona uma nova transação")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "201", description = "Transação adicionada com sucesso"),
    @ApiResponse(responseCode = "422", description = "Campos não atendem os requisitos"),
    @ApiResponse(responseCode = "400", description = "Erro ao processar a requisição"),
    @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
  })
  public ResponseEntity<Void> adicionarTransacao(@RequestBody TransacaoRequestDTO dto){
    transacaoService.adicionarTransacao(dto);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

  @DeleteMapping
  @Operation(description = "Deleta uma transação")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "201", description = "Transação deletada com sucesso"),
    @ApiResponse(responseCode = "400", description = "Erro ao processar a requisição"),
    @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
  })
  public ResponseEntity<Void> deletarTransacao(){
    transacaoService.limparTransacoes();
    return ResponseEntity.ok().build();
  }


}
