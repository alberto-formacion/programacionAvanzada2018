package com.sanluis.hbm.hibernateMappingPractica.vo.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "aulas")
public class Aula {
 
    @Id
    @GeneratedValue
	@Column
    private Long id;

	@Column(name = "codAula")
    private String codAula;
 
    //@OneToMany(cascade = CascadeType.ALL) UNIDIRECCIONAL
    @OneToMany(mappedBy = "aula", fetch = FetchType.LAZY) //BIDIRECCIONAL
    private List<Equipo> equipos = new ArrayList<Equipo>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodAula() {
		return codAula;
	}

	public void setCodAula(String codAula) {
		this.codAula = codAula;
	}

	public List<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}
    
    

    
}
