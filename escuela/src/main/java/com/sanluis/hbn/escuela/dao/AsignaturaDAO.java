package com.sanluis.hbn.escuela.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import com.sanluis.hbn.escuela.vo.Asignatura;

public class AsignaturaDAO {

	private static AsignaturaDAO INSTANCE = null;
	private HibernateSession hbnSesion = null;
	
	private AsignaturaDAO() {
		hbnSesion = HibernateSession.getInstance();
	}
	
	public static AsignaturaDAO getInstance(){
		if(INSTANCE==null){
			INSTANCE = new AsignaturaDAO();
		}
		
		return INSTANCE;
	}
	
	public List<Asignatura> getAllWithNamedQuery() {
		Session s = hbnSesion.getHibernateSession();
		List<Asignatura> result = new ArrayList<Asignatura>();
		
        hbnSesion.beginTransaction(s);
        
        TypedQuery<Asignatura> query = s.getEntityManagerFactory().createEntityManager().createNamedQuery("Asignatura.findAll", Asignatura.class);
        
        result = query.getResultList();
        
        hbnSesion.commitTransaction(s);
        
        return result;
	}
	
	public List<Asignatura> getAllWithHQLQuery(){
		Session s = hbnSesion.getHibernateSession();
		List<Asignatura> result = new ArrayList<Asignatura>();
		
        hbnSesion.beginTransaction(s);
        
        result = hbnSesion.getHibernateSession().createQuery("from Asignatura").list();
        
        return result;
	}
	
	public List<Asignatura> getAllWithJPAQuery(){
		Session s = hbnSesion.getHibernateSession();
		List<Asignatura> result = new ArrayList<Asignatura>();
		
        hbnSesion.beginTransaction(s);
        
		EntityManager em = s.getEntityManagerFactory().createEntityManager();
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		
		CriteriaQuery<Asignatura> criteria = builder.createQuery(Asignatura.class);
		
		Root<Asignatura> root = criteria.from(Asignatura.class);
		
		criteria.select(root);
		
		result = em.createQuery(criteria).getResultList();
		
		return result;
	}
}
