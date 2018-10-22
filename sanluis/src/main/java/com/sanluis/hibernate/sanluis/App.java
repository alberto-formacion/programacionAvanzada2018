package com.sanluis.hibernate.sanluis;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sanluis.hibernate.sanluis.vo.Aula;
import com.sanluis.hibernate.sanluis.vo.Equipo;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration()
				.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver")
				.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/sanluis")
				.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
				.setProperty("hibernate.connection.username", "root")
				.setProperty("hibernate.connection.password", "")
				.setProperty("hibernate.show_sql", "true")
				.setProperty("hibernate.current_session_context_class", "thread")
				.addAnnotatedClass(Aula.class)
				.addAnnotatedClass(Equipo.class);

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.getCurrentSession();
		
		s.beginTransaction();
		
		List<Aula> aulas = s.createQuery("from Aula").list();
		
		for(Aula a: aulas){
			System.out.println(a.getNombre());
			
			for(Equipo e: a.getEquipos()){
				System.out.println(e.getIp());
			}
		}
		
		s.getTransaction().commit();
	}
}
