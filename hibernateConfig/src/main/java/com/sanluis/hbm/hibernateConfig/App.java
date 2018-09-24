package com.sanluis.hbm.hibernateConfig;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sanluis.hbm.hibernateConfig.model.Cd;

public class App {
    public static void main( String[] args ){
    	Configuration cfg = new Configuration()
    			.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver")//Driver de conexion Sql
    			.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/cdcol")//url de la base de datos
    			.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")//Dialecto de SQL
    			.setProperty("hibernate.connection.username", "root")//Usuario de la bd
    			.setProperty("hibernate.connection.password", "")//Pass del usuario
    			.setProperty("hibernate.show_sql", "true")//Mostrar SQL
    			.setProperty("hibernate.current_session_context_class", "thread")//El contexto de la sesion se guarda en el hilo principal de ejecucion
    			.addAnnotatedClass(Cd.class);
    			//Todas menos show_sql son la conf. minima de hibernate
    		SessionFactory sf = cfg.buildSessionFactory();

    }
}
