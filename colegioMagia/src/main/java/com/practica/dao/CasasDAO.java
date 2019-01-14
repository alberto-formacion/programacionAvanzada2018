package com.practica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practica.objetos.Casa;

public interface CasasDAO extends JpaRepository<Casa, Long>{

}
