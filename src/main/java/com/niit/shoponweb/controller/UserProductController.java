package com.niit.shoponweb.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.shoponweb.dao.CartDao;
import com.niit.shoponweb.dao.ProductDao;
import com.niit.shoponweb.fileupload.TextDocument;
import com.niit.shoponweb.model.Cart;
import com.niit.shoponweb.model.Category;
import com.niit.shoponweb.model.Login;
import com.niit.shoponweb.model.Product;
import com.niit.shoponweb.model.Sign_list;
import com.niit.shoponweb.model.SubCategory;

@Controller
public class UserProductController {
	@Autowired
	ProductDao prodao;
	
	@Autowired
	Product prod;
	
	@Autowired
	Cart cart;
	@Autowired
	CartDao cartdao;
	
	@Autowired
	Sign_list list;
	
	
	
	String insteproid;
	
	@RequestMapping(value="/userproduct",method=RequestMethod.GET)
	public String getUserProduct(@RequestParam("proid")String pro,ModelMap m){
		this.insteproid=pro;
   m.addAttribute("ProductUserRequest",true);
	List<Product> pro_userlist=prodao.userProductList(pro);
	List<Category> pro_cate=prodao.getCategoryListArray(pro);
	List<SubCategory> pro_sub_cate=prodao.getSubCategoryListArray(pro);
	
    m.addAttribute("catelist",pro_cate);
	m.addAttribute("prolist", pro_userlist);
	m.addAttribute("subcatelist",pro_sub_cate);
		return "index";
}
	
	@RequestMapping(value="/product_filter",method=RequestMethod.GET)
	
	public String getUserProductfilter(@RequestParam("sub_id")String sub_id,@RequestParam("proid")String pro,ModelMap m){
		
		 m.addAttribute("ProductUserRequest",true);
		 
		List<Product> prod_with_sub=prodao.getProductwithSubCate(sub_id);
		List<SubCategory> pro_sub_cate=prodao.getSubCategoryListArray(pro);
		List<Category> pro_cate=prodao.getCategoryListArray(pro);
        List<SubCategory> clickedsubcat=prodao.getSubCategoryClickArray(sub_id);
        m.addAttribute("clickedsubcat",clickedsubcat);
      
	    m.addAttribute("catelist",pro_cate);
		m.addAttribute("subcatelist",pro_sub_cate);
		m.addAttribute("prolist", prod_with_sub);

		
		return "index";
		
		
	}
	@RequestMapping(value="/product_display",method=RequestMethod.GET)
	public String getParticularProductDisplay(@RequestParam("product_id")String proid,ModelMap m){
		
	     m.addAttribute("ProductRequestDisplay",true);
	     BufferedReader br=TextDocument.ReadText(proid+".txt");
	     if(br!=null){
	     StringBuilder builder = new StringBuilder();
	     String line;
	     try {
				while ((line=br.readLine())!=null){
					
				builder.append(line+"\n");
				 
				}
				m.addAttribute("line",builder);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     }
	     else{
				m.addAttribute("line","Specification will be added soon..");

	     }
           List<Product> pro_part_list=prodao.getParticularProduct(proid);
           
          m.addAttribute("pro_part_list",pro_part_list);
	    
         Product prod= prodao.getProduct(proid); 
		return "index";
	}
	
	@RequestMapping(value="/cart",method=RequestMethod.GET)
	public String addToCart(@RequestParam("pro_id")String proid,ModelMap m,HttpSession session){
		if(!session.getAttribute("SignIn").equals("SignIn")){
	 prod= prodao.getProduct(proid);
	 String random_id=UUID.randomUUID().toString();
	 m.addAttribute("ProductUserRequest",true);

     Date date=new  Date();
     
     SimpleDateFormat date_format=new  SimpleDateFormat("yyyy/MM/dd");
    String date_car= date_format.format(date);
    
    m.addAttribute("ProductUserRequest",true);

	List<Product> pro_userlist=prodao.userProductList(insteproid);
   	List<Category> pro_cate=prodao.getCategoryListArray(insteproid);
   	List<SubCategory> pro_sub_cate=prodao.getSubCategoryListArray(insteproid);
   	
       m.addAttribute("catelist",pro_cate);
   	m.addAttribute("prolist", pro_userlist);
   	m.addAttribute("subcatelist",pro_sub_cate);
String user=(String) session.getAttribute("SignIn");
String email=(String) session.getAttribute("email");
	 if(prod!=null){
	 cart.setCart_id(random_id);
	 cart.setPro_id(prod.getPro_id());
	 cart.setPrice(prod.getPro_price());
	 cart.setDate_cart(date_car);
	 cart.setEmai_id(email);
	 cartdao.save_cart(cart);
    List<Cart> cart=cartdao.getCartWithUserId(email);
    int cart_size=cartdao.cart_size();
     session.setAttribute("cart_value",cart);	
     session.setAttribute("cart_size",cart_size);	 

	 }
	  
	return "index";
	}
		
		else{
 m.addAttribute("LoginRequest",true);
	m.addAttribute("login", new Login());
	m.addAttribute("entry", true);
	m.addAttribute("message", "Must Login");

			return "index";

		}
	}
	
	@RequestMapping("/cartdisplay")
	public String cart_display(ModelMap m,HttpSession session){
		
		String email=(String) session.getAttribute("email");
        List<Cart> cart_list=cartdao.getCartWithUserId(email);
        
		m.addAttribute("cart_list", cart_list);
		m.addAttribute("cartdisplay",true);

		
		
		
		return "index";
		
		
	}
	
	
}
