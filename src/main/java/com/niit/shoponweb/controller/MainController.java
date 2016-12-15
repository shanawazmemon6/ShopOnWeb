package com.niit.shoponweb.controller;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.shoponweb.dao.CategoryDao;
import com.niit.shoponweb.dao.ProductDao;
import com.niit.shoponweb.model.Category;
import com.niit.shoponweb.model.Product;
import com.niit.shoponweb.model.Sign_list;

@Controller
public class MainController {
       
	@Autowired
	CategoryDao cate_dao;
	
	@Autowired
	ProductDao prodao;
	
	@Autowired
	Category cate;
	@Autowired
	Product prod;
	
	
	
	String cate_list;
	// mapping index.jsp
	@RequestMapping("/")
	public String indexView(ModelMap m,HttpSession session) {
		
		Sign_list list = new Sign_list();
		list.setLogin("Login");
		list.setSignin("SignIn");
		list.setSignup("SignUp");
		session.setAttribute("Login", list.getLogin());
		session.setAttribute("SignUp", list.getSignup());
		session.setAttribute("SignIn", list.getSignin());
		 cate_list=cate_dao.getCategoryList(cate);
		 String prod_list=prodao.getProductList(prod);
		 session.setAttribute("prod_list", prod_list);
		session.setAttribute("cate_list", cate_list);
		session.setAttribute("cart_value", null);
		session.setAttribute("cart_size", 0);
		
		
		
		
		
		return "index";
	}

	// mapping admin.jsp
	@RequestMapping("/adminrequest")
	public String adminView(ModelMap m) {
      m.addAttribute("adminhome",true);
		return "admin";
	}

	// mapping launch.jsp
	@RequestMapping("/launchrequest")
	public String launchView(Model m) {
		m.addAttribute("LaunchRequest", true);
		
		return "index";
	}

	// mapping about.jsp
	@RequestMapping("/about")
	public String aboutView(Model m) {
		m.addAttribute("AboutRequest", true);

		return "index";
	}

	// mapping contact.jsp
	@RequestMapping("/contact")
	public String contactView(Model m) {
		m.addAttribute("ContactRequest", true);

		return "index";

	}
	public void dynamicSession(HttpSession session){
		
		Sign_list list = new Sign_list();
		list.setLogin("Login");
		list.setSignin("SignIn");
		list.setSignup("SignUp");
		session.setAttribute("Login", list.getLogin());
		session.setAttribute("SignUp", list.getSignup());
		session.setAttribute("SignIn", list.getSignin());
		cate_list = cate_dao.getCategoryList(cate);
		String prod_list = prodao.getProductList(prod);
		session.setAttribute("prod_list", prod_list);
		session.setAttribute("cate_list", cate_list);
		session.setAttribute("cart_size", 0);
	}
}
