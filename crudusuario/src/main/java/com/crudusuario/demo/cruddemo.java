package com.crudusuario.demo;

import com.crudusuario.controller.ControllerAlumno;
import com.crudusuario.model.Alumno;

public class cruddemo {

	public static void main(String[] args) {

		Alumno alumno = new Alumno(1502466, "Pepe", "Rodríguez");			
		
		// controlador
		ControllerAlumno controller = new ControllerAlumno();
 
		// guarda un alumno a través del controlador
		controller.registrar(alumno);
 
		// ver alumnos
		controller.verAlumnos();
 
		// editar un alumno por medio del id
		alumno.setId(1);
		alumno.setNombre("Manolo");
		controller.actualizar(alumno);
 
		// eliminar un alumno por medio del id
		alumno.setId(1);
		controller.eliminar(alumno);

	}

}
