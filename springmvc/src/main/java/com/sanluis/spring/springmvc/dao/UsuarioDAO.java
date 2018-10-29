package com.sanluis.spring.springmvc.dao;

import java.util.List;

import com.sanluis.spring.springmvc.vo.Todo;
import com.sanluis.spring.springmvc.vo.Usuario;

public interface UsuarioDAO {

	List<Usuario> getUsuarios();
	Usuario get(String nombre);
	void add(Usuario usuario);
	void update(Usuario usuario);
	void delete(Usuario usuario);

}