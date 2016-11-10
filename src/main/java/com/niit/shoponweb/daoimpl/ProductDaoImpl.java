package com.niit.shoponweb.daoimpl;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoponweb.dao.ProductDao;
import com.niit.shoponweb.model.Product;

@Repository("ProductDao")
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	SessionFactory SessionFactory;
	
	public ProductDaoImpl(SessionFactory sessionFactory) {
		this.SessionFactory=sessionFactory;
	}

	@Transactional
	public boolean saveProduct(Product prod) {
		try {
			SessionFactory.getCurrentSession().save(prod);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
		
		
	}
	

}
