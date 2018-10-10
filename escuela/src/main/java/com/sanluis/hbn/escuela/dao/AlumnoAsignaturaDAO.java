package com.sanluis.hbn.escuela.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import com.sanluis.hbn.escuela.vo.AlumnoAsignatura;

public class AlumnoAsignaturaDAO {
	
	private static  AlumnoAsignaturaDAO INSTANCE = null;
	private HibernateSession hbnSesion = null;
	
	private AlumnoAsignaturaDAO() {
		hbnSesion = HibernateSession.getInstance();
		
	}
	
	public static AlumnoAsignaturaDAO getInstance(){
		if(INSTANCE==null){
			INSTANCE = new AlumnoAsignaturaDAO();
		}
		return INSTANCE;
	}
	
	public List<AlumnoAsignatura> getAllWithTypedQuery() {
		Session s = hbnSesion.getHibernateSession();
		
        hbnSesion.beginTransaction(s);
        
        TypedQuery<AlumnoAsignatura> query = s.getEntityManagerFactory().createEntityManager().createNamedQuery("AlumnoAsignatura.findAll", AlumnoAsignatura.class);
        
        return query.getResultList();
	}
	
	public List<AlumnoAsignatura> getAllWithHQLQuery(){ 
		Session s = hbnSesion.getHibernateSession();
		
        hbnSesion.beginTransaction(s);
        
        return hbnSesion.getHibernateSession().createQuery("from AlumnoAsignatura").list();
	}
	
	public List<AlumnoAsignatura> getAllWithJPAQuery(){
		Session s = hbnSesion.getHibernateSession();
		
        hbnSesion.beginTransaction(s);
        
		EntityManager em = s.getEntityManagerFactory().createEntityManager();
		
		//Constructor de la consulta
		CriteriaBuilder builder = em.getCriteriaBuilder();
		
		CriteriaQuery<AlumnoAsignatura> criteria = builder.createQuery(AlumnoAsignatura.class);
		
		Root<AlumnoAsignatura> root = criteria.from(AlumnoAsignatura.class);
		
		criteria.select(root);
		
		return em.createQuery(criteria).getResultList();

		
	}

}
