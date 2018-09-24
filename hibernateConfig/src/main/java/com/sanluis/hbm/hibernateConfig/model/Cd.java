package com.sanluis.hbm.hibernateConfig.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cds") //Aqui referenciamos a la tabla que vamos a usar. Si es igual el nombre que el de la bd no es necesario.
public class Cd {

	@Id //indica que es un id
	@GeneratedValue //indica que es un valor auto generado
	@Column(name="id") //indica que hay una columna en la tabla que es id.
	private long id;
	
	@Column(name="titel")
	private String titulo;
	
	@Column(name="interpret")
	private String interprete;
	
	@Column(name="jahr")
	private int anyo;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getInterprete() {
		return interprete;
	}
	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
}
