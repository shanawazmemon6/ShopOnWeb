package com.niit.shoponweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shoponweb.model.LoginModel;


@Controller
//mapping login.jsp
		@RequestMapping(value="/loginrequest")
public class LoginController {
	
	@RequestMapping(method=RequestMethod.GET)
		 public String loginView(Model m){
			m.addAttribute("LoginRequest", true);
		return "index";
		 
		 }
	@RequestMapping(method=RequestMethod.POST)
      public String loginPost(@ModelAttribute("login")LoginModel login){
		
		System.out.println(login.getEmail_id());
		System.out.println(login.getPassword_login());

    	 return "index";
    	  
    	  
      }
	
}
