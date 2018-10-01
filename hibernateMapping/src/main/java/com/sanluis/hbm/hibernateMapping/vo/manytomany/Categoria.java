package com.sanluis.hbm.hibernateMapping.vo.manytomany;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import antlr.collections.List;

@Entity
@Table(name = "categorias")
public class Categoria {
 
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String descripcion;
    
    @ManyToMany(mappedBy = "categorias", fetch = FetchType.LAZY)
    private java.util.List<Post> posts;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public java.util.List<Post> getPosts() {
		return posts;
	}

	public void setPosts(java.util.List<Post> posts) {
		this.posts = posts;
	}

    
}
