package com.taxapy.usuarioservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Direccion")
public class Direccion {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codigoDireccion;

	private String idUsuario;

	private String direccion;

}
