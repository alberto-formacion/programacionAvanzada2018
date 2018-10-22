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

//@Controller funciona como bean
@Controller
@RequestMapping("/todos")
public class TodoController {
	
	@Autowired
	private TodoService todoService;

	/*@GetMapping(value="{id}")
	public String getTodoById(@PathVariable int id) {
		return "index";
	}*/
	
	@GetMapping
	public String getTodos(Model model) {
		
		/*List<Todo> todos = todoService.getTodos();
		
		model.addAttribute("todos", todos);*/
		
		return "index";
	}

	@GetMapping(value="/otro/{id}")
	public String otro(Model model, @PathVariable int id) {
		
		model.addAttribute("id", id);
		
		return "otro";
	}

}
