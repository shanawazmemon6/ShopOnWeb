package com.niit.shoponweb.dao;

import java.util.List;

import com.niit.shoponweb.model.Cart;


public interface CartDao {
	public boolean save_cart(Cart car);
	public  String getCartList();
	public List<Cart> getCartWithUserId(String user_id);
	public  int cart_size();
		
	
	
}