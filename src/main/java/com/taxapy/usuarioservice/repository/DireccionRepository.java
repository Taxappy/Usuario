package com.taxapy.usuarioservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.taxapy.usuarioservice.model.Direccion;

public interface DireccionRepository extends CrudRepository<Direccion, Integer> {
	Direccion findDireccionByDireccion(String direccion);
}
