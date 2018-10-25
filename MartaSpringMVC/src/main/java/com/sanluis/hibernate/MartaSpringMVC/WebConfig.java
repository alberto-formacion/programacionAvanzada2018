package com.sanluis.hibernate.MartaSpringMVC;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

public class WebConfig implements WebMvcConfigurer{
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
    	//Con ste método evitamos que las peticiones cuyo destino sea el especificado vayan por el dispatcher servlet
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
	
	//con los bean se crean como instancias que pueden ser llamadas cuando queramos con el autowired
    @Bean
	public ViewResolver viewResolver(){
		//Spring llamará a este método cuando necesite saber como se van a a resolver las vistas
		//Esto se usa para abreviar la ruta de las vistas
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		viewResolver.setViewClass(JstlView.class); //Jstl nos sirve para poder eliminar los scriplets de los JSP
		viewResolver.setPrefix("/WEB-INF/views/"); //eso es lo que vamos a poner por delante de lnombre de las vistas
		viewResolver.setSuffix(".jsp"); //esto es lo que vamos a poner por detras del nombre de las vistas
		
		return viewResolver;
	}
	
    @Bean(name = "dataSource")
    public DataSource getDataSource() {
    	//creamos un bean donde devolveremos los datos para conectarse a la BBDD
    	//este bean lo usará Spring para conectarse a la BBDD. NO hay que llamarlo porque Spring lo llamará el solo
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/centro");
        dataSource.setUsername("root");
        dataSource.setPassword("");
     
        return dataSource;
    }
    
    @Autowired //anotacion para inyeccion de dependencias. Spring buscará beans de tipo dataSource
	@Bean(name = "sessionFactory")
	public SessionFactory sessionFactory(DataSource dataSource) {
    	//este metododo sirve para conseguir la factoria se sesiones de Spring
		LocalSessionFactoryBean sfb = new LocalSessionFactoryBean(); //esta clase nos proporciona Spring para configurar hibernate

		sfb.setDataSource(dataSource);
		sfb.setPackagesToScan("com.sanluis.spring.springmvc.vo"); //Especifica que busques en la carpeta especificada aquellas clases con la anotacion @entity

		Properties props = new Properties(); //Properties son como hashmap

		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");

		sfb.setHibernateProperties(props);
		
		try {
			sfb.afterPropertiesSet();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return sfb.getObject();
	}
    
    @Autowired
    @Bean(name = "transactionManager")
    public HibernateTransactionManager getTransactionManager(
            SessionFactory sessionFactory) {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager(
                sessionFactory);
     
        return transactionManager;
    }

}
