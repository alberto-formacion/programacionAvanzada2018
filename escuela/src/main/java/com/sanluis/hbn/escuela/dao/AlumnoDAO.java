package com.sanluis.hbn.escuela.dao;

import java.util.List;

import com.sanluis.hbn.escuela.vo.Alumno;




public class AlumnoDAO implements CrudDAO<Alumno>{
	
	private static AlumnoDAO INSTANCE = null;
	private HibernateSession hbnSesion = null;
	
	private AlumnoDAO(){
		hbnSesion = HibernateSession.getInstance();
	}

	public static AlumnoDAO getInstance(){
		if(INSTANCE==null){
			INSTANCE = new AlumnoDAO();
		}
		return INSTANCE;
	}
	
	
	@Override
	public List<Alumno> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alumno getById(Alumno pojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Alumno pojo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Alumno pojo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insert(Alumno pojo) {
		// TODO Auto-generated method stub
		return false;
	}

}
