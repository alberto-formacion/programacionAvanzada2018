package com.sanluis.hbm.hibernateMapping.vo.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
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

@Entity
@Table(name = "post")
public class Post {
 
    @Id
    @GeneratedValue
    private Long id;
 
    @Column
    private String titulo;
 
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "relacionPostCategoria", 
    			joinColumns = {
    					@JoinColumn(name="idPost")
    			},
    			inverseJoinColumns = {
    					@JoinColumn(name="idCategoria")
    			})
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
