package com.niit.shoponweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DispatcherServlet {

	
	//mapping index.jsp 
	@RequestMapping("/")
	public String indexView(){
		return "index";
		}
	
	//mapping launch.jsp
	@RequestMapping("/launchrequest")
 public String launchView(Model m){
		m.addAttribute("LaunchRequest",true);
	return "index";
	 
	 }
	//mapping login.jsp
	@RequestMapping("/loginrequest")
 public String loginView(Model m){
		m.addAttribute("LoginRequest", true);
	return "index";
	 
	 }
	//mapping register.jsp
	@RequestMapping("/registerrequest")
 public String registerView(Model m){
		m.addAttribute("RegisterRequest",true);
	return "index";
	 
	 }
}
