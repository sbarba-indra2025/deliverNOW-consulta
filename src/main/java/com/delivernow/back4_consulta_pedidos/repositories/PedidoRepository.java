package com.delivernow.back4_consulta_pedidos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivernow.back4_consulta_pedidos.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByUsuarioId(Long usuarioId);
}
