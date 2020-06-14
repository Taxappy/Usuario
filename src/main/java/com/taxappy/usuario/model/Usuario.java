package com.taxappy.usuario.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Usuario")
public class Usuario {
	@Id
	private int idUsuario;
	private String nombre;

}
