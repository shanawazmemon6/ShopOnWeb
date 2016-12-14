package com.niit.shoponweb.webflow;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.niit.shoponweb.dao.OrderDao;
import com.niit.shoponweb.model.Billing;
import com.niit.shoponweb.model.Orders;
import com.niit.shoponweb.model.Shipping;

@Component
public class BuyFlow {
	
	@Autowired
	Orders order;
	
	@Autowired
	OrderDao orderdao;
	String userid ;
	
	public Orders startFlow(){
		
		userid= SecurityContextHolder.getContext().getAuthentication().getName();
		

		return new Orders();
		
		
	}
	
	public String addShipping(Orders order,Shipping ship){
		Gson gson=new Gson();
		String ship_json= gson.toJson(ship);
		 order.setShip_address(ship_json);
		 String id= ship.getProductid();
		 
		return "success";
		
		
	}
	public String addBilling(Orders order,Billing bill){
		
		Gson gson=new Gson();
		String bill_json= gson.toJson(bill);
		 order.setBill_address(bill_json);
		 
		return "success";
		
		
	}
	
	public String addOrder(Orders order){
		order.setEmail_id(userid);
		
		orderdao.save_Order(order);
       		
		return "success";
		
		
	}
	
	

}
