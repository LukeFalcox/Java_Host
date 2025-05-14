package com.devfalco.sistemaPagamento.notificacao;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Notificacao {
    String mensagem;
    Date emissao;
}
