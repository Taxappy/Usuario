package com.taxappy.usuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taxappy.usuario.model.Direccion;
import com.taxappy.usuario.model.Usuario;
import com.taxappy.usuario.repository.DireccionRepository;
import com.taxappy.usuario.repository.UsuarioRepository;



@RestController
@RequestMapping("/")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private DireccionRepository direccionRepository;

	@GetMapping("/{idUsuario}")
	public Usuario findByidUsuario(@PathVariable final int idUsuario) {
		return usuarioRepository.findUsuarioByIdUsuario(idUsuario);
	}

	@GetMapping("/")
	public Iterable<Usuario> AllUsuario() {
		return usuarioRepository.findAll();
	}

	@PostMapping("/")
	public Usuario saveUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);

	}

	@DeleteMapping("/{idUsuario}")
	public void deleteUsuario(@PathVariable final int idUsuario) {
		usuarioRepository.deleteById(idUsuario);
	}

	@PostMapping("/direccion")
	public Direccion saveDireccion(@RequestBody Direccion direccion) {
		return direccionRepository.save(direccion);

	}

	@PatchMapping("/direccion")
	public Direccion updateDireccion(@RequestBody Direccion direccion) {
		return direccionRepository.save(direccion);

	}

	@DeleteMapping("/direccion/{codigoDireccion}")
	public void deleteDireccion(@PathVariable final int codigoDireccion) {
		direccionRepository.deleteById(codigoDireccion);

	}

	@GetMapping("/direccion")
	public Iterable<Direccion> allDireccion() {
		return direccionRepository.findAll();
	}

}
