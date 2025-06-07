package com.devfalco.sistemaPagamento.model;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Table(name = "produto")
public class Produto {
  @GeneratedValue
  @Id
  UUID id;
  String nomeproduto;
  Integer quantidade;
  String valor;
  public Produto(String nomeproduto, Integer quantidade, String valor){
    this.nomeproduto = nomeproduto;
    this.quantidade = quantidade;
    this.valor = valor;
  }
}
