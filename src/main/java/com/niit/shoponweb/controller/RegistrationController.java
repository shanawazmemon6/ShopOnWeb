package com.niit.shoponweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shoponweb.model.LoginModel;
import com.niit.shoponweb.model.RegisterationModel;
@Controller
@RequestMapping("/registerrequest")
public class RegistrationController {
	
	
	@RequestMapping(method=RequestMethod.GET)
	 public String registrationView(ModelMap m){
	   m.addAttribute("register",new RegisterationModel());
		m.addAttribute("RegisterRequest",true);
		return "index";
	 
	 }
@RequestMapping(method=RequestMethod.POST)
 public String registrationPost(@ModelAttribute("register")RegisterationModel reg){
	
	System.out.println(reg.getEmail_register());
	System.out.println(reg.getPassword_register());
	System.out.println(reg.getConfirmpass_register());
	System.out.println(reg.getDob_register());
	System.out.println(reg.getAddress_register());
	System.out.println(reg.getNumber_register());

	 return "index";
	  
	  
 }
}
