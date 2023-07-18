package com.lanchonete.pedidos.controller;

import java.util.List;
import com.lanchonete.pedidos.domain.Pedidos;
import com.lanchonete.pedidos.service.PedidosService;
import org.springframework.web.bind.annotation.GetMapping;

public class PedidosController {
  
  PedidosService pedidosService;

  // Endpoint para retornar todos os alunos
  @GetMapping("/pedidos")
  public List<Pedidos> getAllPedidos() {
    return pedidosService.getAllPedidos();
  }


  public Optional<> 
}
