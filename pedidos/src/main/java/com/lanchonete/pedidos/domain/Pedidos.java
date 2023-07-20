package com.lanchonete.pedidos.domain;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "pedidos")
public class Pedidos {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(length = 30, nullable = false, unique = true)
  private String descricao;
  @Column(length = 30, nullable = false, unique = true)
  private double valor;

  public Pedidos(Long id, String descricao, double valor) {
    this.id = id;
    this.descricao = descricao;
    this.valor = valor;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public Object getCamposQueSeraoAtualizados() {
    return null;
  }

  public void setCamposQueSeraoAtualizados(Object camposQueSeraoAtualizados) {
  }

}
