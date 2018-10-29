package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	public static Connection conexionBD() {
		Connection con = null;
		
		String user = "root";
		String pass = "";
		String url = "jdbc:mysql://localhost:3306/escuela?user=" + user
				+ "&password=" + pass;
		
		try {
			con = DriverManager.getConnection(url);
			if (con != null) {
				System.out.println("Conectado");
			}
		} catch (SQLException e) {
			System.out.println("No se pudo conectar a la BD");
			e.printStackTrace();
		}
		
		return con;
		
	}
}
