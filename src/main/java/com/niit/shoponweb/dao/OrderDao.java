package com.niit.shoponweb.dao;

import java.util.List;

import com.niit.shoponweb.model.Orders;

public interface OrderDao {
	public boolean  save_Order(Orders order);
	public List<Orders> getOrderWithUserId(String user_id);
}
