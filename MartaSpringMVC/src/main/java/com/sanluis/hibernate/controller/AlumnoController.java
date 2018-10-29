package com.sanluis.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sanluis.hibernate.service.TodoService;
import com.sanluis.hibernate.vo.Alumno;


@Controller
public class AlumnoController {

	@Autowired
	private TodoService todoService;
	
	@GetMapping
	public String getTodos(Model model) {
		
		List<Alumno> todos = todoService.getAlumnos();
		
		model.addAttribute("todos", todos);
		
		return "index";
	}
	
	@GetMapping("/{nombre}")
	public String getTodosConNombre(Model model, @PathVariable("nombre") String nombre) {
		List<Alumno> todos = todoService.getAlumnos();
		
		model.addAttribute("todos", todos);
		model.addAttribute("nombre", nombre);
		
		return "index";
		
	}
}
