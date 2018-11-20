package com.sanluis.spring.MartaBlog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanluis.spring.MartaBlog.repository.UsuarioDAO;
import com.sanluis.spring.MartaBlog.vo.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	@Autowired
	private UsuarioDAO usuarioDAO;

	public List<Usuario> getAll() {
		return usuarioDAO.getAll();
	}
}
