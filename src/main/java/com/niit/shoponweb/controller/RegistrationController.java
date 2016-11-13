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
// mapping register.jsp
@RequestMapping("/registerrequest")
public class RegistrationController {
	// injects Register DAO
	@Autowired
	RegisterDao dao;

	// map the view to return String execute if method is get
	@RequestMapping(method = RequestMethod.GET)
	public String registrationView(ModelMap m) {
		// return the Register DO object

		m.addAttribute("register", new Register());
		// return value true,validated in view(index.jsp)
		m.addAttribute("RegisterRequest", true);

		ArrayList<String> gender = new ArrayList<String>();
		gender.add("Male");
		gender.add("Female");
		// return gender list to view
		m.addAttribute("gender", gender);
		return "index";

	}

	@Transactional
	// map the view to return String and execute only when method is post

	@RequestMapping(method = RequestMethod.POST)
	public String registrationPost(@ModelAttribute("register") Register reg, ModelMap m) {
		/*
		 * validating if save execute successful then returning message &
		 * true(validated in index.jsp)
		 */
		if (dao.saveRegister(reg)) {

			m.addAttribute("LoginRequest", true);
			m.addAttribute("login", new Login());
			m.addAttribute("message", "Registered successful");
			m.addAttribute("entry", true);

			return "index";

		} else {
			m.addAttribute("RegisterRequest", true);
			m.addAttribute("message", "Something went wrong");
			return "index";

		}

	}
}
