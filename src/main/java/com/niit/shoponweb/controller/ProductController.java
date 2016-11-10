package com.niit.shoponweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shoponweb.dao.ProductDao;
import com.niit.shoponweb.model.Category;
import com.niit.shoponweb.model.Product;

@Controller
public class ProductController {
	
	@Autowired
	ProductDao prodao;
	
	@RequestMapping(value="/productrequest",method=RequestMethod.GET)
	public String getProductView(ModelMap m){
		
		m.addAttribute("prod",new Product());
		m.addAttribute("productrequest", true);
		
		return "admin";
		
	}
	@RequestMapping(value="/productrequestpost",method=RequestMethod.POST)
	public String setCategoryData(@ModelAttribute("prod")Product prod,ModelMap m){
		
		
		if(prodao.saveProduct(prod)){
	    m.addAttribute("message","Update Successfully");
	    m.addAttribute("productrequest",true);
	    return "admin";
		}
	
		else{
			m.addAttribute("productrequest",true);
		    m.addAttribute("message","Something Went Wrong");

			return "admin";

		}
		
	}

	
}
