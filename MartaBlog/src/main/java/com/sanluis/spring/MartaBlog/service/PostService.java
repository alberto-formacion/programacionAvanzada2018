package com.sanluis.spring.MartaBlog.service;

import java.util.List;

import com.sanluis.spring.MartaBlog.vo.Post;


public interface PostService {
	public List<Post> getAll();
	public List<Post> getAllByidAutor(int id);
	public Post findById(int id);
	public void insert(Post post);
	public void update(Post post);
	public void deleteById(int id);
}
