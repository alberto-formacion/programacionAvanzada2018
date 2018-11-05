package com.sanluis.centro.repository;

import java.util.List;

import com.sanluis.centro.vo.Alumno;

public interface AlumnoRepository {
	
	public List<Alumno> getAll();
	public void insert(Alumno alumno);

}
