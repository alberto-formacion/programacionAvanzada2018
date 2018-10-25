package com.sanluis.spring.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanluis.spring.springmvc.service.UsuarioService;

//@Controller funciona como bean
@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping
	public String index() {		
		return "usuariosIndex";
	}

	@GetMapping(value="/?nombre={nombre}")
	public String usuarioById(Model model, @PathVariable("nombre") String nombre) {
		
		model.addAttribute("nombre", nombre);
		
		return "usuario";
	}

	@PostMapping(value="/{nombre}")
	public String addUsuarioById(Model model, @PathVariable("nombre") String nombre) {
		
		//usuarioService.getUsuario(nombre);
		usuarioService.add(usuarioService.get(nombre));
		
		return "usuariosIndex";
	}
	@PutMapping(value="/{nombre}")
	public String updateUsuarioById(Model model, @PathVariable("nombre") String nombre) {
		
		//usuarioService.getUsuario(nombre);
		usuarioService.update(usuarioService.get(nombre));
		
		return "usuariosIndex";
	}
	@DeleteMapping(value="/{nombre}")
	public String deleteUsuarioById(Model model, @PathVariable("nombre") String nombre) {
		
		//usuarioService.getUsuario(nombre);
		usuarioService.delete(usuarioService.get(nombre));
		
		return "usuariosIndex";
	}

}
