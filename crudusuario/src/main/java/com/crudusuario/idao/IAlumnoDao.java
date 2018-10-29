package com.crudusuario.idao;

import java.util.List;

import com.crudusuario.model.Alumno;

public interface IAlumnoDao {

	public boolean registrar(Alumno alumno);
	public List<Alumno> obtener();
	public boolean actualizar(Alumno alumno);
	public boolean eliminar(Alumno alumno);
}
