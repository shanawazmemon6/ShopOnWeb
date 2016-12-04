package com.niit.shoponweb.dao;

import com.niit.shoponweb.model.Cart;


public interface CartDao {
	public boolean save_cart(Cart car);
	public  String getCartList();
	public String getCartWithUserId(String user_id);
	
}