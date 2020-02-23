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

	@GetMapping("/usuario/{cedula}")
	public Usuario findByCedula(@PathVariable final int idUsuario) {
		return usuarioRepository.findUsuarioByIdUsuario(idUsuario);
	}

	@PostMapping("/usuario")
	public Usuario save(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);

	}

	@DeleteMapping("/usuario")
	public void delete(@RequestBody Usuario usuario) {
		usuarioRepository.delete(usuario);
	}

	@PostMapping("/usuario/direccion")
	public Direccion save(@RequestBody Direccion direccion) {
		return direccionRepository.save(direccion);

	}

	@PatchMapping("/usuario/direccion")
	public Direccion update(@RequestBody Direccion direccion) {
		return direccionRepository.save(direccion);

	}

	@DeleteMapping("/usuario/direccion")
	public void delete(@RequestBody Direccion direccion) {
		direccionRepository.delete(direccion);

	}

	@GetMapping("/usuario/direccion")
	public Iterable<Direccion> allDireccion() {
		return direccionRepository.findAll();
	}

	@GetMapping("/usuario/direccion/{direccion}")
	public Direccion findByDireccion(@PathVariable final String direccion) {
		return direccionRepository.findDireccionByDireccion(direccion);
	}
}
