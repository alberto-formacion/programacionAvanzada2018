package com.sanluis.centro.service;

import java.util.List;

import com.sanluis.centro.vo.Alumno;

public interface AlumnoService {
	
	public List<Alumno> getAll();
	public void insert(Alumno alumno);

}
