package com.practica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practica.objetos.Profesor;

public interface ProfesoresDAO extends JpaRepository<Profesor, Long>{

}
