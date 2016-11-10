package com.niit.shoponweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shoponweb.dao.CategoryDao;
import com.niit.shoponweb.model.Category;

@Controller

public class CategoryController {
	@Autowired
	CategoryDao catdao;
	
	
	@RequestMapping("/categoryrequest")
	public String getCategoryView(ModelMap map){
		
		map.addAttribute("cate",new Category());
		map.addAttribute("categoryrequest",true);
		
		return "admin";
		
	}
	@RequestMapping(value="/categoryrequestpost",method=RequestMethod.POST)
	public String setCategoryData(@ModelAttribute("cate")Category cate,ModelMap m){
		
		
		if(catdao.saveCategory(cate)){
	    m.addAttribute("message","Update Successfully");
	    m.addAttribute("categoryrequest",true);
	    return "admin";
		}
	
		else{
			m.addAttribute("categoryrequest",true);
		    m.addAttribute("message","Something Went Wrong");

			return "admin";

		}
		
	}
	
	

}
