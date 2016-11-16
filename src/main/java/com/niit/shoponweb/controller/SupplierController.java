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
	// injects Supplier DAO

	@Autowired
	SupplierDao supdao;
	// map the view to return String

	@RequestMapping(value = "/supplierrequest", method = RequestMethod.GET)
	public String getSupplierViews(ModelMap m) {
		// return the Supplier DO object
		m.addAttribute("sup", new Supplier_Do());
		// return value true validated in view(admin.jsp)
		m.addAttribute("supplierrequest", true);
	String sup_list=supdao.getSuppilerList(new Supplier_Do());
	m.addAttribute("sup_list",sup_list);
		return "admin";

	}
	// map the view to return String and execute only when method is post

	@RequestMapping(value = "/supplierrequestpost", method = RequestMethod.POST)
	public String setCategoryData(@ModelAttribute("sup") Supplier_Do sup, ModelMap m) {

		/*
		 * validating if save execute successful then returning message &
		 * true(validated in admin.jsp)
		 */
		if (supdao.saveSupplier(sup)) {
			m.addAttribute("message", "Update Successfully");
			m.addAttribute("supplierrequest", true);
			return "admin";
		}

		else {
			m.addAttribute("supplierrequest", true);
			m.addAttribute("message", "Something Went Wrong");

			return "admin";

		}

	}

}
