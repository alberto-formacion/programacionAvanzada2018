package com.crudusuario.vista;

import java.util.List;

import com.crudusuario.model.Alumno;

public class ViewAlumno {

	public void verAlumno(Alumno alumno) {
		System.out.println("Datos del alumno: "+alumno);
	}
	
	public void verAlumnos(List<Alumno> alumnos) {
		for (Alumno alumno : alumnos) {
			System.out.println("Datos del alumno: "+alumno);
		}		
	}
}
