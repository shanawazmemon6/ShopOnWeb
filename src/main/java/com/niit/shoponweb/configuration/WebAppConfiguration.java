package com.niit.shoponweb.configuration;

import java.util.Properties;
import java.util.function.Supplier;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.shoponweb.model.Category;
import com.niit.shoponweb.model.Product;
import com.niit.shoponweb.model.Register;
import com.niit.shoponweb.model.Supplier_Do;



@Configuration
@ComponentScan("com.niit.shoponweb")
@EnableTransactionManagement
public class WebAppConfiguration {
	
	
	@Bean(name="dataSource")
	public  DataSource getSource(){
		DriverManagerDataSource source=new DriverManagerDataSource();
		source.setUrl("jdbc:h2:tcp://localhost/~/test");
		source.setDriverClassName("org.h2.Driver");
		source.setPassword("");
		source.setUsername("sa");
		System.out.println("source");

		return source;
		
	}
	
	public Properties getHibernateProperties(){
		
		Properties p=new Properties();
		
		p.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		System.out.println("properites");

		return p;
	}
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSession(DataSource source){
		
		LocalSessionFactoryBuilder session=new LocalSessionFactoryBuilder(source);
		
		session.addProperties(getHibernateProperties());
	      session.addAnnotatedClass(Register.class);
	      session.addAnnotatedClass(Category.class);
	      session.addAnnotatedClass(Supplier_Do.class);
	      session.addAnnotatedClass(Product.class);
		System.out.println("session");
		return session.buildSessionFactory();
		
	}
	
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager getHibernateTransaction(SessionFactory s){
		HibernateTransactionManager hbm=new HibernateTransactionManager(s);
		

		 return hbm;
	}
	

}
