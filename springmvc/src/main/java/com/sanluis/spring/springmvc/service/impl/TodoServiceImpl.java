package com.sanluis.spring.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanluis.spring.springmvc.dao.TodoDAO;
import com.sanluis.spring.springmvc.service.TodoService;
import com.sanluis.spring.springmvc.vo.Todo;

@Service
public class TodoServiceImpl implements TodoService{
	
	@Autowired
	private TodoDAO todoDAO;

	public List<Todo> getTodos() {
		return todoDAO.getTodos();
	}

}
