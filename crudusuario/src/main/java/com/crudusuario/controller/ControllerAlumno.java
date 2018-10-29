package com.crudusuario.controller;

import java.util.ArrayList;
import java.util.List;

import com.crudusuario.dao.AlumnoDaoImpl;
import com.crudusuario.idao.IAlumnoDao;
import com.crudusuario.model.Alumno;
import com.crudusuario.vista.ViewAlumno;

public class ControllerAlumno {

private ViewAlumno vista= new ViewAlumno();
	
	public ControllerAlumno() {
	}
	
	//llama al DAO para guardar un alumno
	public void registrar(Alumno alumno) {
		IAlumnoDao dao= new  AlumnoDaoImpl();
		dao.registrar(alumno);
	}
	
	//llama al DAO para actualizar un alumno
	public void actualizar(Alumno alumno) {
		IAlumnoDao dao= new  AlumnoDaoImpl();
		dao.actualizar(alumno);
	}
	
	//llama al DAO para eliminar un alumno
	public void eliminar(Alumno alumno) {
		IAlumnoDao dao= new  AlumnoDaoImpl();
		dao.eliminar(alumno);
	}
	
	//llama al DAO para obtener todos los alumnos y luego los muestra en la vista
	public void verAlumnos(){
		List<Alumno> alumnos = new ArrayList<Alumno>();
		IAlumnoDao dao= new  AlumnoDaoImpl();
		alumnos=dao.obtener();
		vista.verAlumnos(alumnos);
	}
}
