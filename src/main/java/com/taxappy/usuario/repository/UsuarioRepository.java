package com.taxappy.usuario.repository;

import org.springframework.data.repository.CrudRepository;

import com.taxappy.usuario.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	Usuario findUsuarioByIdUsuario(int idUsuario);
}
