package com.sanluis.hbn.escuela.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import com.sanluis.hbn.escuela.vo.AlumnoAsignatura;

public class AlumnoAsignaturaDAO {
	
	private static final AlumnoAsignaturaDAO INSTANCE = null;
	private HibernateSession hbnSesion = null;
	
	private AlumnoAsignaturaDAO() {
		hbnSesion = HibernateSession.getInstance();
	}
	
	public static AlumnoAsignaturaDAO getInstance(){
		if(INSTANCE==null){
			return new AlumnoAsignaturaDAO();
		}else{
			return INSTANCE;
		}
	}
	
	public List<AlumnoAsignatura> getAllWithNamedQuery() {
		Session s = hbnSesion.getHibernateSession();
		List<AlumnoAsignatura> result = new ArrayList<AlumnoAsignatura>();
		
        hbnSesion.beginTransaction(s);
        
        TypedQuery<AlumnoAsignatura> query = s.getEntityManagerFactory().createEntityManager().createNamedQuery("AlumnoAsignatura.findAll", AlumnoAsignatura.class);
        
        result = query.getResultList();
        
        hbnSesion.commitTransaction(s);
        
        return result;
	}
	
	public List<AlumnoAsignatura> getAllWithHQLQuery(){
		Session s = hbnSesion.getHibernateSession();
		List<AlumnoAsignatura> result = new ArrayList<AlumnoAsignatura>();
		
        hbnSesion.beginTransaction(s);
        
        result = hbnSesion.getHibernateSession().createQuery("from AlumnoAsignatura").list();
        
        return result;
	}
	
	public List<AlumnoAsignatura> getAllWithJPAQuery(){
		Session s = hbnSesion.getHibernateSession();
		List<AlumnoAsignatura> result = new ArrayList<AlumnoAsignatura>();
		
        hbnSesion.beginTransaction(s);
        
		EntityManager em = s.getEntityManagerFactory().createEntityManager();
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		
		CriteriaQuery<AlumnoAsignatura> criteria = builder.createQuery(AlumnoAsignatura.class);
		
		Root<AlumnoAsignatura> root = criteria.from(AlumnoAsignatura.class);
		
		criteria.select(root);
		
		result = em.createQuery(criteria).getResultList();
		
		return result;
	}

}
