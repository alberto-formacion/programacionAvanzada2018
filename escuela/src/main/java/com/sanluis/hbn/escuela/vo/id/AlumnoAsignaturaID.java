package com.sanluis.hbn.escuela.vo.id;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.sanluis.hbn.escuela.vo.Alumno;
import com.sanluis.hbn.escuela.vo.Asignatura;

@Embeddable
public class AlumnoAsignaturaID implements Serializable{

	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="alumnos_id")
	private Alumno alumno;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="asignaturas_id")
	private Asignatura asignatura;
	
	@Column
	private int curso;

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	
}
