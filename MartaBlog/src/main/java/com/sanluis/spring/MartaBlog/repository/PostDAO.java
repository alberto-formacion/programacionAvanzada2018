package com.sanluis.spring.MartaBlog.repository;

import java.util.List;

import com.sanluis.spring.MartaBlog.vo.Post;

public interface PostDAO {
	public List<Post> getAll();
	public List<Post> getAllByidAutor(Long id);
	public Post findById(Long id);
	public void insert(Post post);
	public void update(Post post);
	public void deleteById(Long id);
}
