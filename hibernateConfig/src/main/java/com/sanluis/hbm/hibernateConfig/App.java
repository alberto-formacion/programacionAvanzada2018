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
    			.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
    			.setProperty("hibernate.connection.username", "root")
    			.setProperty("hibernate.connection.password", "")
    			.setProperty("hibernate.show_sql", "true")
    			.setProperty("hibernate.current_session_context_class", "thread")
    			.addAnnotatedClass(Cd.class);
    			
    		SessionFactory sf = cfg.buildSessionFactory();
    		
    		Session s = sf.getCurrentSession();
    		
    		s.beginTransaction();
    		
    		List<Cd> cds = s.createQuery("from Cd").list();
    		
    		for(Cd cd: cds){
    			System.out.println(cd.getTitulo());
    		}
    		
    		s.getTransaction().commit();

    }
}
