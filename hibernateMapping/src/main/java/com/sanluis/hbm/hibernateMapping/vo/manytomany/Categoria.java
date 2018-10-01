package com.sanluis.hbm.hibernateMapping.vo.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria {
	
	@Id
	@GeneratedValue
	@Column
	private int id;
	
	@Column
	private String nombre;
	
	@ManyToMany(mappedBy="categorias")
	private List<Post> posts;

}
