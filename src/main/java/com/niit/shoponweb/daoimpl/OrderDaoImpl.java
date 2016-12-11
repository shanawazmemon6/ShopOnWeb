package com.niit.shoponweb.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoponweb.dao.OrderDao;
import com.niit.shoponweb.model.Orders;

@Repository("OrderDao")
public class OrderDaoImpl implements OrderDao{
	
	@Autowired 
	SessionFactory sessionFactory;
	
	public OrderDaoImpl(SessionFactory session) {
		this.sessionFactory=session;
	}

	@Transactional
	public boolean save_Order(Orders order) {
		sessionFactory.getCurrentSession().saveOrUpdate(order);
		return false;
	}

}
