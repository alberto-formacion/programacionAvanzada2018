package com.sanluis.hibernate.sanluis;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.sanluis.hibernate.sanluis.vo.Aula;
import com.sanluis.hibernate.sanluis.vo.Equipo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	Configuration cfg = new Configuration()
    			.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver") //driver de mysql
    			.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/cdcol") //direccion de la bbdd
    			.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
    			.setProperty("hibernate.connection.username", "root") //usuario de mysql
    			.setProperty("hibernate.connection.password", "") //contraseña de mysql
    			.setProperty("hibernate.show_sql", "true") //mostrar datos de las consultas
    			.setProperty("hibernate.current_session_context_class", "thread")
    			.addAnnotatedClass(Aula.class)
    			.addAnnotatedClass(Equipo.class);
    			
    		SessionFactory sf = cfg.buildSessionFactory();
    		Session s = sf.getCurrentSession();
    		s.beginTransaction();
    		
    		List<Aula> aulas = s.createQuery("from aula").list();
    		
    		for (Aula aula : aulas) {
				System.out.println(aula.getIdAula());
			}
    		s.getTransaction().commit();
    }
}
