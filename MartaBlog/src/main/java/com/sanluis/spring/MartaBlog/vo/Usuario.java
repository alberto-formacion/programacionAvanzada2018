package com.sanluis.spring.MartaBlog.vo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue
	@Column(name="idusuario")
	private int id;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@Column
	private String user;
	
	@Column
	private String pass;
	
	@ManyToOne
	@JoinColumn(name="idrol")
	private Rol rol;
	
	/*@OneToMany(mappedBy="autor", fetch = FetchType.LAZY)
	private List<Post> posts = new ArrayList<Post>();*/
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/*public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}*/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
}
