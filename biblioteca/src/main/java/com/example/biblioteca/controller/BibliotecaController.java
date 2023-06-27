package main.java.com.example.biblioteca.controller;

import java.sql.Date;

import org.springframework.boot.autoconfigure.domain.Entity;
import spring.persistence.GenerationType;
import jakarta.annotation.Generated;

@Entity
public class Usuario {

  @Id 
  @GeneratedValue(strategy=Generated.IDENTITY)
  @Column()
  private int id;
  private String nome;
  private String email;
  private String senha;
  private Date dataRegistro;



  public Usuario(int id, String nome, String email, String senha, Date dataRegistro) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.dataRegistro = dataRegistro;
  }

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }
  public Date getDataRegistro() {
    return dataRegistro;
  }
  public void setDataRegistro(Date dataRegistro) {
    this.dataRegistro = dataRegistro;
  }

  

}

