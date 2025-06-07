package com.devfalco.sistemaPagamento.pagamento;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pagamento")
public class Pagamento {
  UUID id;
  UUID pedoUuid;
  Double valor;
  Date data;
  String metodo;
  StatusPagamento status;
}
