package com.sanluis.spring.MartaBlog.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sanluis.spring.MartaBlog.vo.Post;

@Repository
public class PostDAOImpl implements PostDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session currentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Transactional(readOnly=true)
	public List<Post> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Post").list();
	}

	@Transactional(readOnly=true)
	public List<Post> getAllByidAutor(Long id) {
		return sessionFactory.getCurrentSession().createQuery("from Post where idautor='" + id + "'").list();
	}
	public Post findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insert(Post post) {
		// TODO Auto-generated method stub
		
	}

	public void update(Post post) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	

	

}
