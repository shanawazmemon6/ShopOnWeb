package com.niit.shoponweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DispatcherServlet {

	
	//index.jsp mapping
	@RequestMapping("/")
	public String indexView(){
		return "index";
		
		
	}
}
