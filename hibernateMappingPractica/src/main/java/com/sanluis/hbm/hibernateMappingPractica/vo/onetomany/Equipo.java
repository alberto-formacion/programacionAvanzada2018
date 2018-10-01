package com.sanluis.hbm.hibernateMappingPractica.vo.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "equipos")
public class Equipo {
 
    @Id
    @GeneratedValue
	@Column
    private Long id;

	@Column
    private String codEquipo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAula")
    private Aula aula;
    
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodEquipo() {
		return codEquipo;
	}

	public void setCodEquipo(String codEquipo) {
		this.codEquipo = codEquipo;
	}
	
	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}


}
