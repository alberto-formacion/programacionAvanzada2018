package com.sanluis.spring.springmvc.service;

import java.util.List;

import com.sanluis.spring.springmvc.vo.Todo;
import com.sanluis.spring.springmvc.vo.Usuario;

public interface UsuarioService {

	List<Usuario> getUsuarios();
	Usuario get(String nombre);
	void add(Usuario usuario);
	void update(Usuario usuario);
	void delete(Usuario usuario);

}
