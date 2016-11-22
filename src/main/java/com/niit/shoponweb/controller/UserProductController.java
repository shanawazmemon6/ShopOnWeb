package com.niit.shoponweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.shoponweb.dao.ProductDao;

@Controller
public class UserProductController {
	@Autowired
	ProductDao prodao;
	@RequestMapping(value="/userproduct",method=RequestMethod.GET)
	public String getUserProduct(@RequestParam("proid")String pro,ModelMap m){
   m.addAttribute("ProductUserRequest",true);
	String pro_userlist=prodao.userProductList(pro);
	m.addAttribute("prolist", pro_userlist);
		return "index";
}
}