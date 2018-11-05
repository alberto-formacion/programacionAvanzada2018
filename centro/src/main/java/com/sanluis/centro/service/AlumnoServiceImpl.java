package com.sanluis.centro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanluis.centro.repository.AlumnoRepository;
import com.sanluis.centro.vo.Alumno;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	
	@Autowired
	AlumnoRepository alumnoRepository;

	public List<Alumno> getAll() {
		return alumnoRepository.getAll();
	}

	public void insert(Alumno alumno) {
		alumnoRepository.insert(alumno);
	}

}
