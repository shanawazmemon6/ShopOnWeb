package com.niit.shoponweb.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoponweb.dao.RegisterDao;
import com.niit.shoponweb.model.Register;


@Repository("RegisterDao")
public class RegistrationDaoImpl implements RegisterDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public RegistrationDaoImpl(SessionFactory session) {
		this.sessionFactory=session;
	}

	@Transactional
	public boolean saveRegister(Register reg) {
		
		
		try {
			sessionFactory.getCurrentSession().save(reg);
			
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return false;
		}
	}

}
