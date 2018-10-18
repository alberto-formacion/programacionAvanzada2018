package com.sanluis.spring.springmvc.dao.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sanluis.spring.springmvc.dao.TodoDAO;
import com.sanluis.spring.springmvc.vo.Todo;

@Repository
public class TodoDAOImpl implements TodoDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	private Session currentSession(){
		return sessionFactory.getCurrentSession();
	}

	@Transactional(readOnly=true)
	public List<Todo> getTodos() {
		return currentSession().getEntityManagerFactory().createEntityManager().createNamedQuery("todo.getTodos", Todo.class).getResultList();
	}

}
