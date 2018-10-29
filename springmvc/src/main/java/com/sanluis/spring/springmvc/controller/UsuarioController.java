package com.sanluis.spring.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sanluis.spring.springmvc.service.UsuarioService;
import com.sanluis.spring.springmvc.vo.Usuario;

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

	@GetMapping(value="/{nombre}")
	public String usuarioById(Model model, @PathVariable("nombre") String nombre) {
		
		Usuario u = new Usuario();
		u.setNombre(nombre);
		model.addAttribute("usuario", u);
		return "usuario";
	}

	@PostMapping(value="/{nombre}")
	public String addUsuarioById(Model model, @PathVariable("nombre") String nombre) {
		
		//usuarioService.getUsuario(nombre);
		usuarioService.add(usuarioService.get(nombre));
		
		return "usuariosIndex";
	}
	
	@PostMapping(value = "/addUsuario")
	public String addUsuario(@ModelAttribute("usuario") @Validated Usuario usuario,
			BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "error";
        }
        /*model.addAttribute("name", employee.getName());
        model.addAttribute("contactNumber", employee.getContactNumber());
        model.addAttribute("id", employee.getId());*/
        
        return "redirect:/usuarios";//"usuario";
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


//https://www.baeldung.com/
