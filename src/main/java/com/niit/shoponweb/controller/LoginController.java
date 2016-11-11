package com.niit.shoponweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shoponweb.dao.RegisterDao;
import com.niit.shoponweb.model.Login;
import com.niit.shoponweb.model.Register;



@Controller
//mapping login.jsp
@RequestMapping(value="/loginrequest")
public class LoginController {
	
	@Autowired
	RegisterDao regdao;
	

	
	@RequestMapping(method=RequestMethod.GET)
		 public String loginView(ModelMap m){
		   m.addAttribute("login",new Login());
			m.addAttribute("LoginRequest", true);
		return "index";
		 
		 }
	@RequestMapping(method=RequestMethod.POST)
      public String loginPost(@ModelAttribute("login")Login login,ModelMap m){
		
	  boolean valid =regdao.isvalidUser(login);
	  if(valid){
		  m.addAttribute("LaunchRequest", true);
		  return "index"; 
	  }
	  else{
		  
		  m.addAttribute("LoginRequest", true);

		  return "index";
	  }
         
		
    	 
    	  
    	  
      }
	
}
