package com.niit.shoponweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shoponweb.dao.SupplierDao;
import com.niit.shoponweb.model.Category;
import com.niit.shoponweb.model.Supplier_Do;

@Controller
public class SupplierController {
	
	@Autowired 
	 SupplierDao supdao;
	
	@RequestMapping(value="/supplierrequest",method=RequestMethod.GET)
	public String getSupplierViews(ModelMap m){
		m.addAttribute("sup",new Supplier_Do() );
		m.addAttribute("supplierrequest",true);
		return "admin";
		
		
}
	
	@RequestMapping(value="/supplierrequestpost",method=RequestMethod.POST)
	public String setCategoryData(@ModelAttribute("sup")Supplier_Do sup,ModelMap m){
		
		
		if(supdao.saveSupplier(sup)){
	    m.addAttribute("message","Update Successfully");
	    m.addAttribute("supplierrequest",true);
	    return "admin";
		}
	
		else{
			m.addAttribute("supplierrequest",true);
		    m.addAttribute("message","Something Went Wrong");

			return "admin";

		}
		
	}

}
