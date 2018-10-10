package com.sanluis.hbn.escuela.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sanluis.hbn.escuela.vo.Alumno;
import com.sanluis.hbn.escuela.vo.AlumnoAsignatura;
import com.sanluis.hbn.escuela.vo.Asignatura;

public class HibernateSession {
	
	private static final HibernateSession INSTANCE = null;
	private Configuration cfg;
	private SessionFactory sf;
	
	private HibernateSession(){
		cfg = new Configuration()
			.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver")
			.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/escuela")
			.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
			.setProperty("hibernate.connection.username", "root")
			.setProperty("hibernate.connection.password", "")
			.setProperty("hibernate.show_sql", "false")
			.setProperty("hibernate.format_sql", "false")
			.setProperty("hibernate.current_session_context_class", "thread")
			.addAnnotatedClass(Alumno.class)
			.addAnnotatedClass(Asignatura.class)
			.addAnnotatedClass(AlumnoAsignatura.class);
		
		sf = cfg.buildSessionFactory();
	}
	
	public static HibernateSession getInstance(){
		if(INSTANCE==null){
			return new HibernateSession();
		}else{
			return INSTANCE;
		}
	}
	
	public Session getHibernateSession(){
		return sf.getCurrentSession();
	}
	
	public void beginTransaction(Session sesion){
		sesion.beginTransaction();
	}
	
	public void commitTransaction(Session sesion){
		sesion.getTransaction().commit();
	}

}
