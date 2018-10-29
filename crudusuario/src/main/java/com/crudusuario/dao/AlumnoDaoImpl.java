package com.crudusuario.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.Conexion;
import com.crudusuario.idao.IAlumnoDao;
import com.crudusuario.model.Alumno;

public class AlumnoDaoImpl implements IAlumnoDao {

	public boolean registrar(Alumno alumno) {
		boolean registrar = false;
		
		Statement stm= null;
		Connection con=null;
		
		String sql="INSERT INTO alumnos values (NULL,'"+alumno.getNombre()+"','"+alumno.getApellido()+"')";
		
		try {			
			con=Conexion.conexionBD();
			stm= con.createStatement();
			stm.execute(sql);
			registrar=true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase AlumnoDaoImpl, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}
 
	public List<Alumno> obtener() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM ALUMNO ORDER BY ID";
		
		List<Alumno> listaAlumno= new ArrayList<Alumno>();
		
		try {			
			co= Conexion.conexionBD();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Alumno a=new Alumno();
				a.setId(rs.getInt(1));
				a.setNombre(rs.getString(2));
				a.setApellido(rs.getString(3));
				listaAlumno.add(a);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase AlumnoDaoImpl, método obtener");
			e.printStackTrace();
		}
		
		return listaAlumno;
	}
 
	public boolean actualizar(Alumno alumno) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				
		String sql="UPDATE ALUMNO SET nombres='"+alumno.getNombre()+"', apellidos='"+alumno.getApellido()+"'" +" WHERE ID="+alumno.getId();
		try {
			connect=Conexion.conexionBD();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase AlumnoDaoImpl, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
	}
 
	public boolean eliminar(Alumno alumno) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM ALUMNO WHERE ID="+alumno.getId();
		try {
			connect=Conexion.conexionBD();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase AlumnoDaoImpl, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}
}
