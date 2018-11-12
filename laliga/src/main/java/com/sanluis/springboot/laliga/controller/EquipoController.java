package com.sanluis.springboot.laliga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanluis.springboot.laliga.service.EquipoService;
import com.sanluis.springboot.laliga.vo.Equipo;

@RestController
@RequestMapping("/equipos")
public class EquipoController {
	
	@Autowired
	EquipoService equipoService;
	
	@GetMapping
	public List<Equipo> findAll(){
		return equipoService.findAll();
	}

}
