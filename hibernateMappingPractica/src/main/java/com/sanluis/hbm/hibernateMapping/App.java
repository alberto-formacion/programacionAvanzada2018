package com.sanluis.hbm.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sanluis.hbm.hibernateMapping.vo.onetoone.Post;
import com.sanluis.hbm.hibernateMapping.vo.onetoone.PostDetalle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration()
    			.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver") //driver
    			.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/blog") //url .. la base de datos debe existir
    			.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect") //segun la base de datos se usa uno diferente, SQLServerDialect, OracleDialect..
    			.setProperty("hibernate.connection.username", "root") //usuario
    			.setProperty("hibernate.connection.password", "") //password
    			.setProperty("hibernate.show_sql", "true") //para indicar k nos muestre las consultas
    			.setProperty("hibernate.current_session_context_class", "thread") //indica el contexto de la sesion ke se ejecute en el hilo principal
    			.addAnnotatedClass(Post.class) //ponemos cada una de las clases que keremos mapear
    			.addAnnotatedClass(PostDetalle.class); //ponemos cada una de las clases que keremos mapear
    			
    		SessionFactory sf = cfg.buildSessionFactory();

    		Session s = sf.getCurrentSession();
    		
    		s.beginTransaction(); //SIEMPRE comenzamos con transacciones
    		
    		java.util.List<Post> cds = s.createQuery("from Post").list(); //Usamos el nombre de la entidad, hibernate realiza el mapping
    		
    		for(Post cd:cds) {
    			System.out.println(cd.getTitulo());
    		}
    		
    		s.getTransaction().commit(); //hay que finalizar la transaccion
    		
    }
}
