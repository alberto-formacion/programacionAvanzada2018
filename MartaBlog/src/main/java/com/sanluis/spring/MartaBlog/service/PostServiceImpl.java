package com.sanluis.spring.MartaBlog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanluis.spring.MartaBlog.repository.PostDAO;
import com.sanluis.spring.MartaBlog.vo.Post;

@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	private PostDAO postDAO;
	
	public List<Post> getAll() {
		return postDAO.getAll();
	}

	public List<Post> getAllByidAutor(Long id) {
		return postDAO.getAllByidAutor(id);
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
