package com.niit.shoponweb.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shoponweb.dao.RegisterDao;
import com.niit.shoponweb.model.Login;
import com.niit.shoponweb.model.Register;



@Controller
@RequestMapping("/registerrequest")
public class RegistrationController {

	@Autowired
	RegisterDao dao;

	@RequestMapping(method = RequestMethod.GET)
	public String registrationView(ModelMap m) {
		m.addAttribute("register", new Register());
		m.addAttribute("RegisterRequest", true);
		ArrayList<String> gender = new ArrayList<String>();
		gender.add("Male");
		gender.add("Female");
		m.addAttribute("gender", gender);
		return "index";

	}

	@Transactional
	@RequestMapping(method = RequestMethod.POST)
	public String registrationPost(@ModelAttribute("register") Register reg,ModelMap m) {

		if(dao.saveRegister(reg)){
			
			m.addAttribute("LoginRequest", true);
			m.addAttribute("login", new Login());
			m.addAttribute("message","Registered successful");
			m.addAttribute("entry",true);

			return "index";

}
		else{
			m.addAttribute("RegisterRequest", true);
			m.addAttribute("message","Something went wrong");
			return "index";
			
		}
		

	}
}
