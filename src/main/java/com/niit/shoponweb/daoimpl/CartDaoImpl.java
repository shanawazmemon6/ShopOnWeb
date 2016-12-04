package com.niit.shoponweb.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.niit.shoponweb.dao.CartDao;
import com.niit.shoponweb.model.Cart;

@Repository("CartDao")
public class CartDaoImpl implements CartDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	int cart_size;
	
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

	@Transactional
	public List<Cart> getCartWithUserId(String user_id) {
		String hql="from Cart where emai_id ='"+user_id+"'";
		
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		
		   @SuppressWarnings("unchecked")
		List<Cart> cart_list=query.list();
		   cart_size=cart_list.size();
		    
		
		return cart_list;
		
	}

	@Override
	public int cart_size() {
		return cart_size;
	}

}
