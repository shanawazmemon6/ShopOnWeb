package com.niit.shoponweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.Gson;
import com.niit.shoponweb.dao.ProductDao;
import com.niit.shoponweb.model.Category;
import com.niit.shoponweb.model.Product;
import com.niit.shoponweb.model.SubCategory;
import com.niit.shoponweb.model.Supplier_Do;

@Controller
public class UserProductController {
	@Autowired
	ProductDao prodao;
	
	@RequestMapping(value="/userproduct",method=RequestMethod.GET)
	public String getUserProduct(@RequestParam("proid")String pro,ModelMap m){
   m.addAttribute("ProductUserRequest",true);
	List<Product> pro_userlist=prodao.userProductList(pro);
	List<Category> pro_cate=prodao.getCategoryListArray(pro);
	List<SubCategory> pro_sub_cate=prodao.getSubCategoryListArray(pro);
	
    m.addAttribute("catelist",pro_cate);
	m.addAttribute("prolist", pro_userlist);
	m.addAttribute("subcatelist",pro_sub_cate);
		return "index";
}
	
	@RequestMapping(value="/product_filter",method=RequestMethod.GET)
	
	public String getUserProductfilter(@RequestParam("sub_id")String sub_id,@RequestParam("proid")String pro,ModelMap m){
		
		 m.addAttribute("ProductUserRequest",true);
		 
		List<Product> prod_with_sub=prodao.getProductwithSubCate(sub_id);
		List<SubCategory> pro_sub_cate=prodao.getSubCategoryListArray(pro);
		List<Category> pro_cate=prodao.getCategoryListArray(pro);
        List<SubCategory> clickedsubcat=prodao.getSubCategoryClickArray(sub_id);
        m.addAttribute("clickedsubcat",clickedsubcat);
      
	    m.addAttribute("catelist",pro_cate);
		m.addAttribute("subcatelist",pro_sub_cate);
		m.addAttribute("prolist", prod_with_sub);

		
		return "index";
		
		
	}
	
	
	
}
