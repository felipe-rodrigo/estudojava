package com.lanchonete.pedidos.service;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import com.lanchonete.pedidos.domain.Pedidos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lanchonete.pedidos.repository.PedidosRepository;

@Service
public class PedidosService {

  @Autowired
  PedidosRepository pedidosRepository;

  // Método para retornar a lista de pedidos (LISTA GERAL - TODOS)
  public List<Pedidos> getAllPedidos() {
    List<Pedidos> pedidosList = new ArrayList<>();
    pedidosRepository.findAll().forEach(pedidosList::add);
    return pedidosList;
  }

  // Método para retornar um pedido especifico pelo ID (REQUISIÇÃO ESPECIFICA - SOMENTE UM)
  public Optional<Pedidos> getPedido(Long[] id) {
    return pedidosRepository.findById(id);
  }

  // Método para adicionar um pedido
  public void aicionarPedido(Pedidos pedidoAdd) {
    pedidosRepository.save(pedidoAdd);
  }

  // Método para atualizar um pedido
  public void atualizarPedido(Pedidos pedidosUpdate, Long id) {
    Optional<Pedidos> optionalPedidos = getPedido(id);
    if (optionalPedidos.isPresent()) {
      pedidosUpdate.setId(id);
      pedidosRepository.save(pedidosUpdate);
    }
  }

  // Método para deletar um pedido
  public void deletarPedido(Long id) {
    pedidosRepository.deleteAllById(id);
  }
}
