package com.sanluis.springboot.laliga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanluis.springboot.laliga.repository.EquipoRepository;
import com.sanluis.springboot.laliga.vo.Equipo;

@Service
public class EquipoService {

	@Autowired
	EquipoRepository equipoRepository;
	
	public List<Equipo> findAll(){
		return equipoRepository.findAll();
	}
}
