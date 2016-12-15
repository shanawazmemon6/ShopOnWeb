package com.niit.shoponweb.webflow;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.webflow.execution.RequestContext;

import com.google.gson.Gson;
import com.niit.shoponweb.dao.CartDao;
import com.niit.shoponweb.dao.OrderDao;
import com.niit.shoponweb.dao.ProductDao;
import com.niit.shoponweb.model.Billing;
import com.niit.shoponweb.model.Cart;
import com.niit.shoponweb.model.Orders;
import com.niit.shoponweb.model.Product;
import com.niit.shoponweb.model.Shipping;

@Component
public class BuyFlow {
	
	@Autowired
	Orders order;
	
	@Autowired
	OrderDao orderdao;
	
	@Autowired 
	ProductDao prodao;
	
	@Autowired
	Product product;
	
	@Autowired
	Cart cart;
	
	@Autowired
	CartDao cartdao;
	
	
	
	
	public Orders startFlow(){
		
		

		return new Orders();
		
		
	}
	
	public String addShipping(Orders order,Shipping ship,RequestContext context){
		double total = 0;
		Gson gson=new Gson();
		String random_id = UUID.randomUUID().toString();
		String ship_json= gson.toJson(ship);
	    String id= ship.getProductid();
		product=prodao.getProduct(id);
		String	userid= SecurityContextHolder.getContext().getAuthentication().getName();
		
		List<Cart> carts=cartdao.getCartWithUserId(userid);
		 
		for(Cart cartvalue:carts){
			
			double price=cartvalue.getPrice();
			total=total+price;
			
		}
		order.setEmail_id(userid);
		 order.setShip_address(ship_json);
		 order.setOrder_id(random_id);
		 order.setPro_id(id);
		 order.setTotal(total);
		 HttpSession session = ((HttpServletRequest)context.getExternalContext().getNativeRequest()).getSession();
         session.setAttribute("carted_list",carts);
         session.setAttribute("total",total);

		return "success";
		
		
	}
	public String addBilling(Orders order,Billing bill){
		
		Gson gson=new Gson();
		String bill_json= gson.toJson(bill);
		 order.setBill_address(bill_json);
		 
		 
		return "success";
		
		
	}
	
	public String addOrder(Orders order){
		
		
		orderdao.save_Order(order);
       		
		return "success";
		
		
	}
	
	

}
