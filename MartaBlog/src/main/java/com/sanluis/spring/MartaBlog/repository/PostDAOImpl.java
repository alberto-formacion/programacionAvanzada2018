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
	public List<Post> getAllByidAutor(int id) {
		return sessionFactory.getCurrentSession().createQuery("from Post where idautor='" + id + "'").list();
	}
	public Post findById(int id) {	
		//Post p = (Post) sessionFactory.getCurrentSession().get(Post.class, id);
		Post p = (Post) sessionFactory.getCurrentSession().get(Post.class, id);
		return p;
	}

	public void insert(Post post) {
		sessionFactory.getCurrentSession().persist(post);
		
	}

	public void update(Post post) {
		sessionFactory.getCurrentSession().update(post);
		
	}

	public void deleteById(int id) {
		Post p = (Post) sessionFactory.getCurrentSession().load(Post.class, id);
		if(null != p){
			sessionFactory.getCurrentSession().delete(p);
		}
		
	}

	

	

}
