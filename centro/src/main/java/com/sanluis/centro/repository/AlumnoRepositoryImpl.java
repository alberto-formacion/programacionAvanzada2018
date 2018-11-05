package com.sanluis.centro.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sanluis.centro.vo.Alumno;

@Repository
public class AlumnoRepositoryImpl implements AlumnoRepository {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional(readOnly=true)
	public List<Alumno> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Alumno").getResultList();
	}

	@Transactional(readOnly=false)
	public void insert(Alumno alumno) {
		sessionFactory.getCurrentSession().saveOrUpdate(alumno);
	}

}
