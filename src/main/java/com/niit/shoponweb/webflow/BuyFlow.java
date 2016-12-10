package com.niit.shoponweb.webflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.niit.shoponweb.model.Cart;
import com.niit.shoponweb.model.Login;
import com.niit.shoponweb.model.Orders;

@Component
public class BuyFlow {
	
	@Autowired
	Cart cart;
	
	
	public Cart startFlow(){
		
		return new Cart();
		
		
	}
	
	

}
