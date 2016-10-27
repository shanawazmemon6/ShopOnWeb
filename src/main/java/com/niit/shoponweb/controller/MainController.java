package com.niit.shoponweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	
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
	//mapping about.jsp
	@RequestMapping("/about")
	public String aboutView(Model m){
		m.addAttribute("AboutRequest",true);
		
		return "index";
		
		
	}
	//mapping contact.jsp
		@RequestMapping("/contact")
		public String contactView(Model m){
			m.addAttribute("ContactRequest",true);
			
			return "index";
			
			
		}
}
