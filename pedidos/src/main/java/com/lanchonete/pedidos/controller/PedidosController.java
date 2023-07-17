package com.lanchonete.pedidos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lanchonete")
public class PedidosController {
  @RequestMapping("/pedidos")
  public String listarPedidos() {
    return "Lista de pedidos";
  }
}
