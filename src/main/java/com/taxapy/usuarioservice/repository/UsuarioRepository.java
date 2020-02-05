package com.taxapy.usuarioservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.taxapy.usuarioservice.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	Usuario findUsuarioByIdUsuario(int idUsuario);
}
