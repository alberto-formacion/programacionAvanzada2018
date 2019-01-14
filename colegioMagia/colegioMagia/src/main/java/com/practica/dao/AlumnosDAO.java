package com.practica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practica.objetos.Alumno;

public interface AlumnosDAO extends JpaRepository<Alumno, Long>{

}
