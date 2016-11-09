package com.niit.shoponweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shoponweb.dao.CategoryDao;
import com.niit.shoponweb.dao.SupplierDao;
import com.niit.shoponweb.model.Category;
import com.niit.shoponweb.model.Supplier_Do;

@Controller
@RequestMapping("/adminrequest")
public class AdminController {
	@Autowired
	CategoryDao dao;
	@Autowired
	SupplierDao sup_dao;
	@RequestMapping(method=RequestMethod.GET)
	public String getRequestGet(ModelMap mod){
		mod.addAttribute("cate",new Category());
//		mod.addAttribute("sup",new Supplier_Do());

		return "admin";
	}
//	@Transactional
//	@RequestMapping(method=RequestMethod.POST)
//	public String getRequestPost(@ModelAttribute("cate")Category cate){
//		dao.saveCategory(cate);
//		
//	return "admin";
//		
//	}
	
	@Transactional
	@RequestMapping(method=RequestMethod.POST)
	public String getRequestSupplier(@ModelAttribute("sup")Supplier_Do sup){
		
		sup_dao.saveSupplier(sup);
		
		return "admin";
		
		
	}
	

}
