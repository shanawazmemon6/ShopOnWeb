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
		
		String cart_id=car.getCart_id();
		String pro_id=car.getPro_id();
		double cart_price=car.getPrice();

String insert_query="insert into cart(cart_id,pro_id,price)select('"+cart_id+"','"+pro_id+"',"+cart_price+")";
	
System.out.println(insert_query);

sessionFactory.getCurrentSession().createQuery(insert_query);
		
		
		return false;
	}

}
