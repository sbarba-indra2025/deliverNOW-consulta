package com.delivernow.back4_consulta_pedidos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivernow.back4_consulta_pedidos.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByProveedorId(Long proveedorId);
}
