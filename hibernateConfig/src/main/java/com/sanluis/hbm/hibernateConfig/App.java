package com.sanluis.hbm.hibernateConfig;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sanluis.hbm.hibernateConfig.model.Cd;

public class App {
    public static void main( String[] args ){
    	Configuration cfg = new Configuration()
    			.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver")
    			.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/cdcol")
    			.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")//dialecto mysql
    			.setProperty("hibernate.connection.username", "root")//Usuario bd
    			.setProperty("hibernate.connection.password", "")//Password bd
    			.setProperty("hibernate.show_sql", "true")//Opcional!!
    			.setProperty("hibernate.current_session_context_class", "thread")//el contexto de la sesion esta en el hilo principal de ejecucion.
    			.addAnnotatedClass(Cd.class); //Indicamos las clases.
    			
    		SessionFactory sf = cfg.buildSessionFactory();

    		Session s = sf.getCurrentSession();
    		
    		s.beginTransaction();
    		List<Cd> cds = s.createQuery("from Cd").list();
    		
    		/*Creamos una consulta para devolver todo lo que hay en la tabla Cd.
    		
    		
    		*/
    		for (Cd cd: cds) {
    			System.out.println(cd.getTitulo());
    			
				
			}
    		
    		s.getTransaction().commit();
    }
}
