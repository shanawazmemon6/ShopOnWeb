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
	// injects category DAO
	@Autowired
	CategoryDao catdao;
	

	// map the view to return String
	@RequestMapping("/categoryrequest")
	public String getCategoryView(ModelMap map) {
		// return the category DO object
		map.addAttribute("cate", new Category());
		// return value true validated in view(admin.jsp)
		map.addAttribute("categoryrequest", true);

		return "admin";

	}

	// map the view to return String and execute only when method is post
	@RequestMapping(value = "/categoryrequestpost", method = RequestMethod.POST)

	public String setCategoryData(@ModelAttribute("cate") Category cate, ModelMap m) {
		// validating if save execute successful then returning message &
		// true(validated in admin.jsp)
		if (catdao.saveCategory(cate)) {
			m.addAttribute("message", "Update Successfully");
			m.addAttribute("categoryrequest", true);
			return "admin";
		}

		else {
			m.addAttribute("categoryrequest", true);
			m.addAttribute("message", "Something Went Wrong");

			return "admin";

		}

	}

}
