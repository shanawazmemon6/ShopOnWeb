package com.niit.shoponweb.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.shoponweb.dao.CategoryDao;
import com.niit.shoponweb.model.Category;
import com.niit.shoponweb.model.Sign_list;

@Controller
public class MainController {
       
	@Autowired
	CategoryDao cate_dao;
	
	@Autowired
	Category cate;
	
	String cate_list;
	// mapping index.jsp
	@RequestMapping("/")
	public String indexView(Model m,HttpSession session) {
		Sign_list list = new Sign_list();
		list.setLogin("Login");
		list.setSignin("SignIn");
		list.setSignup("SignUp");
		session.setAttribute("Login", list.getLogin());
		session.setAttribute("SignUp", list.getSignup());
		session.setAttribute("SignIn", list.getSignin());
		 cate_list=cate_dao.getCategoryList(cate);
		session.setAttribute("cate_list", cate_list);
		m.addAttribute("prolist","fuck");
		
		
		return "index";
	}

	// mapping admin.jsp
	@RequestMapping("/adminrequest")
	public String adminView(ModelMap m) {

		return "admin";
	}

	// mapping launch.jsp
	@RequestMapping("/launchrequest")
	public String launchView(Model m) {
		m.addAttribute("LaunchRequest", true);
		Sign_list list = new Sign_list();
		
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
}
