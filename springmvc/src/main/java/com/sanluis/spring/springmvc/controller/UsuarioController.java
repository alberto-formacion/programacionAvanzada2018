package com.sanluis.spring.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	/*@GetMapping(value="/{id}")
	public String usuarioById(Model model, @PathVariable int id) {
		
		model.addAttribute("id", id);
		
		return "usuario";
	}*/

}
