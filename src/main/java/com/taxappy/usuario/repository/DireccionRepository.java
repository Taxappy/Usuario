package com.taxappy.usuario.repository;

import org.springframework.data.repository.CrudRepository;

import com.taxappy.usuario.model.Direccion;



public interface DireccionRepository extends CrudRepository<Direccion, Integer> {
	Direccion findDireccionByDireccion(String direccion);
}
