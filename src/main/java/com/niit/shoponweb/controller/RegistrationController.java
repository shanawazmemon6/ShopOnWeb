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
	public String registrationPost(@ModelAttribute("register") Register reg) {

		dao.saveRegister(reg);
		/*System.out.println(reg.getName_register());
		System.out.println(reg.getEmail_register());
		System.out.println(reg.getPassword_register());
		System.out.println(reg.getConfirmpass_register());
		System.out.println(reg.getDob_register());
		System.out.println(reg.getAddress_register());
		System.out.println(reg.getNumber_register());*/

		return "index";

	}
}
