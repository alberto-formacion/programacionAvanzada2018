package com.sanluis.spring.springmvc.dao.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sanluis.spring.springmvc.dao.TodoDAO;
import com.sanluis.spring.springmvc.dao.UsuarioDAO;
import com.sanluis.spring.springmvc.vo.Todo;
import com.sanluis.spring.springmvc.vo.Usuario;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {
	
	@Autowired //llama al session factory del bean del config
	private SessionFactory sessionFactory;

	private Session currentSession(){
		return sessionFactory.getCurrentSession();
	}

	@Transactional(readOnly=true)
	public List<Usuario> getUsuarios() {
		return currentSession().getEntityManagerFactory().createEntityManager().createNamedQuery("usuario.getUsuarios", Usuario.class).getResultList();
	}

}
