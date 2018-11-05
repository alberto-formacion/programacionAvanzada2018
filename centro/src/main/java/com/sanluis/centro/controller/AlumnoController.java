package com.sanluis.centro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanluis.centro.service.AlumnoService;
import com.sanluis.centro.vo.Alumno;

@Controller
@RequestMapping("/alumnos")
public class AlumnoController {
	
	@Autowired
	AlumnoService alumnoService;

	@GetMapping
	public String getAll(ModelMap model){
		List<Alumno> alumnos = alumnoService.getAll();
		
		model.addAttribute("alumnos", alumnos);
		
		return "listaAlumnos";
	}
	
	@GetMapping("/nuevo")
	public String goToForm(ModelMap model){
		model.addAttribute("alumno", new Alumno());
		return "formAlumno";
	}
	
	@PostMapping
	public String insert(@ModelAttribute("alumno") Alumno alumno, BindingResult result, ModelMap model){
		alumnoService.insert(alumno);
		
		return "redirect:/alumnos";
	}
}
