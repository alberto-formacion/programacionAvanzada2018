package com.sanluis.spring.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanluis.spring.springmvc.dao.TodoDAO;
import com.sanluis.spring.springmvc.dao.UsuarioDAO;
import com.sanluis.spring.springmvc.service.TodoService;
import com.sanluis.spring.springmvc.service.UsuarioService;
import com.sanluis.spring.springmvc.vo.Todo;
import com.sanluis.spring.springmvc.vo.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired //inyectado, eso kiere decir que todoDao es un Bean -> en este caso, Repository
	private UsuarioDAO usuarioDAO;

	public List<Usuario> getUsuarios() {
		return usuarioDAO.getUsuarios();
	}

}
