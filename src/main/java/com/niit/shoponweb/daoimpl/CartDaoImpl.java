package com.niit.shoponweb.daoimpl;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoponweb.dao.CartDao;
import com.niit.shoponweb.model.Cart;

@Repository("CartDao")
public class CartDaoImpl implements CartDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public CartDaoImpl(SessionFactory session) {
		this.sessionFactory=session;
	}

	@Transactional
	public boolean save_cart(Cart car) {
		
		
		sessionFactory.getCurrentSession().saveOrUpdate(car);
		return false;
	}

	@Override
	public String getCartList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCartWithUserId(String user_id) {
		
		return null;
	}

}
