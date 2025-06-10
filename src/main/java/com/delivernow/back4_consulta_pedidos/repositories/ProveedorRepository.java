package com.delivernow.back4_consulta_pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivernow.back4_consulta_pedidos.entities.Proveedor;

import java.util.List;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
    List<Proveedor> findByNombre(String nombre);
    List<Proveedor> findByCategoria(String categoria);
}
