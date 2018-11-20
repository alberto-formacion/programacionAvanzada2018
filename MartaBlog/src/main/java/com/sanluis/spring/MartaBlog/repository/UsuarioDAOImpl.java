package com.sanluis.spring.MartaBlog.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sanluis.spring.MartaBlog.vo.Usuario;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO{

	@Autowired
	private SessionFactory sessionFactory;

	private Session currentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Transactional(readOnly=true)
	public List<Usuario> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Usuario").list();
	}

}
