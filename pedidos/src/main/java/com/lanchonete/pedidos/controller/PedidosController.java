package com.lanchonete.pedidos.controller;

import java.util.List;
import java.util.Optional;
import com.lanchonete.pedidos.domain.Pedidos;
import com.lanchonete.pedidos.service.PedidosService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PedidosController {
  
  PedidosService pedidosService;

  // Endpoint para retornar todos os pedidos
  @GetMapping("/pedidos")
  public List<Pedidos> getAllPedidos() {
    return pedidosService.getAllPedidos();
  }

  // Endpoint para retornar um pedido pelo ID
  @GetMapping("/pedidos/{id}")
  public Optional<Pedidos> getPedido(@PathVariable Long id) {
    return pedidosService.getPedido(id);
  }

  // Endpoint para adicionar um novo pedido
  @PostMapping("/pedidos")
  public void adicionarPedido(@RequestBody Pedidos pedido) {
    pedidosService.adicionarPedido(pedido);
  }

  // Endpoint para atualizar um pedido existente
  @PutMapping("/pedidos/{id}")
  public void atualizarPedido(@RequestBody Pedidos pedido, @PathVariable Long id) {
    pedidosService.atualizarPedido(pedido, id);
  }

  //Endpoint para deletar um pedido
  @DeleteMapping("/pedidos/{id}")
  public void deletarPedido(@PathVariable Long id) {
    pedidosService.deletarPedido(id);
  }
}
