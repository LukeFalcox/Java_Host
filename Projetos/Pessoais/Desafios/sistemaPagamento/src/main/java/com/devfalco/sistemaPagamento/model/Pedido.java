package com.devfalco.sistemaPagamento.model;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "pedido")
public class Pedido {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
UUID id;
String nomecliente;
String cpf;
String valorTotal; 
StatusPedido status; 
@OneToMany(cascade = CascadeType.ALL)
List<Produto> produtos;
}
