package com.sanluis.springboot.laliga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanluis.springboot.laliga.vo.Equipo;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Integer>{

}
