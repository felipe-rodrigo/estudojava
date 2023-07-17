package com.lanchonete.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lanchonete.pedidos.domain.Pedidos;

public interface PedidosRepository extends JpaRepository<Pedidos, int[]>{
  
}
