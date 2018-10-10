package com.sanluis.hbn.escuela;

import java.util.List;

import com.sanluis.hbn.escuela.dao.AlumnoAsignaturaDAO;
import com.sanluis.hbn.escuela.vo.AlumnoAsignatura;

public class App{
    public static void main( String[] args ){
        AlumnoAsignaturaDAO alumnoAsignaturaDAO = AlumnoAsignaturaDAO.getInstance();
        
        
        List<AlumnoAsignatura> alumnoAsignaturas = alumnoAsignaturaDAO.getAllWithNamedQuery();

        
        for(AlumnoAsignatura aa : alumnoAsignaturas){
        	StringBuilder sb = new StringBuilder();
        	
        	sb.append(aa.getId().getAlumno().getNombre())
        		.append(" - ")
        		.append(aa.getId().getAsignatura().getNombre())
        		.append(":")
        		.append(aa.getNota());
        	
        	System.out.println(sb.toString());
        }
             
    }
}
