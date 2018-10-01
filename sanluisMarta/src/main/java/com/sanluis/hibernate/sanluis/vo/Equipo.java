package com.sanluis.hibernate.sanluis.vo;

import javax.persistence.Column;
import javax.persistence.Id;

public class Equipo {

	@Id
	private Long idEquipo;
	
	

	@Column
	private String nombre;
	
	public Long getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(Long idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
