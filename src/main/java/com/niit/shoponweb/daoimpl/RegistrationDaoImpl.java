package com.niit.shoponweb.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoponweb.dao.RegisterDao;
import com.niit.shoponweb.model.Login;
import com.niit.shoponweb.model.Register;


@Repository("RegisterDao")
public class RegistrationDaoImpl implements RegisterDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	String Role;
	String name;
	
	public RegistrationDaoImpl(SessionFactory session) {
		this.sessionFactory=session;
	}

	@Transactional
	public boolean saveRegister(Register reg) {
		
		
		try {
			sessionFactory.getCurrentSession().save(reg);
			
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean isvalidUser(Login log) {
		
		String email_id=log.getEmail_id();
		String password_form=log.getPassword_login();
	    Query query=sessionFactory.getCurrentSession().createQuery("from Register where  email =:email and password=:password");
	    query.setParameter("email", email_id);
	    query.setParameter("password", password_form);
	     List<Register> list=query.list();   
         int size=list.size();
        
	    if(size==1){
	    	 for (Register register : list) {
	        	    Role=register.getRole();
	        	    name=register.getName();
	        	    		
	        	}
	  return true ;
	}
	else{
		return false;
	}
		
	}

	public String validrole() {
		
		return Role;
	}

	@Override
	public String Username() {
		
		return name;
	}

}
