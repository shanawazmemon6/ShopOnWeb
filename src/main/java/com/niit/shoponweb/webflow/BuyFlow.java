package com.niit.shoponweb.webflow;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
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
	HttpSession  session;
	
	public Orders startFlow(){
		
		

		return new Orders();
		
		
	}
	
	public String addShipping(Orders order,Shipping ship,RequestContext context){
		 
 
		
		Gson gson=new Gson();
		String ship_json= gson.toJson(ship);
		order.setShip_address(ship_json);
		   session = ((HttpServletRequest)context.getExternalContext().getNativeRequest()).getSession();
		   session.setAttribute("ship",ship);
		 return "success";
		
	}
		
	public String addBilling(Orders order,Billing bill,RequestContext context){
		
		Gson gson=new Gson();
		String bill_json= gson.toJson(bill);
		 order.setBill_address(bill_json);
		 double total = 0;
			String random_id = UUID.randomUUID().toString();
		    String id= bill.getProductid();
			product=prodao.getProduct(id);
			
			String	userid= SecurityContextHolder.getContext().getAuthentication().getName();
			StringBuilder pro=new StringBuilder(); 
			if(id.equals("null")){
			List<Cart> carts=cartdao.getCartWithUserId(userid);
			 for(Cart cartvalue:carts){
				
				double price=cartvalue.getPrice();
				total=total+price;
				String pr=cartvalue.getPro_id();
				pro.append(pr).append(",");
				
			}
			 
			 order.setPro_id(pro.toString());
			 order.setEmail_id(userid);
			 order.setOrder_id(random_id);

			 order.setTotal(total);

				
		     session = ((HttpServletRequest)context.getExternalContext().getNativeRequest()).getSession();
	         session.setAttribute("carted_list",carts);
	         session.setAttribute("user", userid);
	         session.setAttribute("total",total);
	         session.setAttribute("bill",bill);

	        
	         return "multi";
			}
			else{
	             total=product.getPro_price();
	             Date date = new Date();
				 order.setTotal(total);
				 order.setEmail_id(userid);
				 order.setOrder_id(random_id);
				 order.setPro_id(id);
	 			SimpleDateFormat date_format = new SimpleDateFormat("yyyy/MM/dd");
	 			String date_car = date_format.format(date);
				 HttpSession  session = ((HttpServletRequest)context.getExternalContext().getNativeRequest()).getSession();
	        
	             session.setAttribute("onepro",product);
	             session.setAttribute("user", userid);
	             session.setAttribute("total",total);
		         session.setAttribute("bill",bill);
		         session.setAttribute("date", date_car);
		         
		 		return "one";

			}
			
        
		
		
	}
	
	public String addOrder(Orders order){
		
		
		orderdao.save_Order(order);
			

       		
		return "success";
		
		
	}
	
	

}
