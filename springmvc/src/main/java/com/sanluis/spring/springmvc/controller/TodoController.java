package com.sanluis.spring.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanluis.spring.springmvc.service.TodoService;
import com.sanluis.spring.springmvc.vo.Todo;




//Para Spring esto será un Bean
@Controller
@RequestMapping("/todos")
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@GetMapping
	public String getTodos(Model model) {
		
		List<Todo> todos = todoService.getTodos();
		
		model.addAttribute("todos", todos);
		
		return "index";
	}
	
	@GetMapping("/{nombre}")
	public String getTodosConNombre(Model model, @PathVariable("nombre") String nombre) {
		List<Todo> todos = todoService.getTodos();
		
		model.addAttribute("todos", todos);
		model.addAttribute("nombre", nombre);
		
		return "index";
		
	}
	
	

}
