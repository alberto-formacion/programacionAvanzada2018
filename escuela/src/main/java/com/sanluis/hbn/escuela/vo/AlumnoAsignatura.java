package com.sanluis.hbn.escuela.vo;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.sanluis.hbn.escuela.vo.id.AlumnoAsignaturaID;

@Entity
@NamedQueries({
	@NamedQuery(name="AlumnoAsignatura.findAll", query="SELECT aa FROM AlumnoAsignatura aa")
}) 
@Table(name="alumnos_asignaturas")
public class AlumnoAsignatura {
	
	@EmbeddedId
	AlumnoAsignaturaID id;
	
	@Column
	private double nota;

	public AlumnoAsignaturaID getId() {
		return id;
	}

	public void setId(AlumnoAsignaturaID id) {
		this.id = id;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	

}
