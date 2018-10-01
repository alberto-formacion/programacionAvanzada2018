package com.sanluis.hbm.hibernateMapping.vo.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "post")
public class Post {
 
    @Id
    @GeneratedValue
    private Long id;
 
    @Column
    private String titulo;
    
    @ManyToMany
    @JoinTable(
    		name="post_categoria",
    		joinColumns = {
    				@JoinColumn(name="post_id")
    		},
    		inverseJoinColumns = {
    				@JoinColumn(name="categoria_id")
    		}
    		
    )
    private List<Categoria> categorias;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
    

}
