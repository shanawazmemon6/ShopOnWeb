package com.niit.shoponweb.daoimpl;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoponweb.dao.SupplierDao;
import com.niit.shoponweb.model.Supplier_Do;

@Repository("SupplierDao")
public class SupplierDaoImpl implements SupplierDao {

	@Autowired
	SessionFactory sessionFactory;
	public SupplierDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public boolean saveSupplier(Supplier_Do sup) {
		
		try {
			sessionFactory.getCurrentSession().save(sup);
			
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
	}

}
