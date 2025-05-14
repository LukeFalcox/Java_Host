package com.devfalco.sistemaPagamento.notificacao;

import java.sql.Date;

public record NotificacaoDto(String message, Date emissao) {
}