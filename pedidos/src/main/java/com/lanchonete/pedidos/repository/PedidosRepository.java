package com.lanchonete.pedidos.repository;

import com.lanchonete.pedidos.domain.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository extends JpaRepository<Pedidos, Long>{
  
}
