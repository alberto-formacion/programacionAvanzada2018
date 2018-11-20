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

	public List<Post> getAllByidAutor(int id) {
		return postDAO.getAllByidAutor(id);
	}

	public Post findById(int id) {
		return postDAO.findById(id);
	}

	public void insert(Post post) {
		postDAO.insert(post);
		
	}

	public void update(Post post) {
		postDAO.update(post);
		
	}

	public void deleteById(int id) {
		postDAO.deleteById(id);
		
	}

	
}
