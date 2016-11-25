package com.niit.shoponweb.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shoponweb.dao.RegisterDao;
import com.niit.shoponweb.model.Login;
import com.niit.shoponweb.model.Sign_list;

@Controller
// mapping login.jsp
@RequestMapping(value = "/loginrequest")
public class LoginController {
	// injects Register DAO
	@Autowired
	RegisterDao regdao;

	// map the view to return String execute if method is get
	@RequestMapping(method = RequestMethod.GET)
	public String loginView(ModelMap m, HttpSession session) {
		// return the Login DO object
		m.addAttribute("login", new Login());
		// return value true,validated in view(index.jsp)

		m.addAttribute("LoginRequest", true);
		Sign_list list = new Sign_list();

		list.setLogin("Login");
		list.setSignin("SignIn");
		list.setSignup("SignUp");
		session.setAttribute("Login", list.getLogin());
		session.setAttribute("SignUp", list.getSignup());
		session.setAttribute("SignIn", list.getSignin());

		return "index";

	}

	// map the view to return String and execute only when method is post
	@RequestMapping(method = RequestMethod.POST)
	public String loginPost(@ModelAttribute("login") Login login, ModelMap m, HttpSession session) {
		// if user is valid it return true
		boolean valid = regdao.isvalidUser(login);
		/*
		 * if user is valid user and role=user then return to home page else if
		 * role=admin return to admin else return to login error message
		 */
		if (valid && regdao.validrole().equals("user")) {

			m.addAttribute("LaunchRequest", true);
			m.addAttribute("loggedin", true);
			m.addAttribute("role", regdao.Username());
			Sign_list list = new Sign_list();
			list.setLogin("Logout");
			list.setSignin(regdao.Username());
			list.setSignup("SignUp");
			session.setAttribute("Login", list.getLogin());
			session.setAttribute("SignUp", list.getSignup());
			session.setAttribute("SignIn", list.getSignin());
			return "index";
		} else if (valid && regdao.validrole().equals("admin")) {
			m.addAttribute("loggedin", true);

			m.addAttribute("role", regdao.Username());


			return "admin";
		} else {
			m.addAttribute("LoginRequest", true);
			m.addAttribute("entry", true);
			m.addAttribute("message", "password is incorrect or not a valid user");
			return "index";
		}
	}

}
