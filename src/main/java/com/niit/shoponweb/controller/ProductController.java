package com.niit.shoponweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.shoponweb.dao.ProductDao;
import com.niit.shoponweb.model.Category;
import com.niit.shoponweb.model.Product;
import com.niit.shoponweb.model.Supplier_Do;

@Controller
public class ProductController {
	// injects Product DAO
	@Autowired
	ProductDao prodao;

	// map the view to return String execute if method is get
	@RequestMapping(value = "/productrequest", method = RequestMethod.GET)
	public String getProductView(ModelMap m) {
		// return the Login Product object

		m.addAttribute("prod", new Product());
		// return value true,validated in view(admin.jsp)
		m.addAttribute("productrequest", true);
		m.addAttribute("edit", true);
		String cate_list = prodao.getCategoryList(new Category());
		String sup_list = prodao.getSupplierList(new Supplier_Do());
		String prod_list = prodao.getProductList(new Product());
		m.addAttribute("cate_list", cate_list);
		m.addAttribute("sup_list", sup_list);
		m.addAttribute("prod_list", prod_list);

		return "admin";

	}

	// map the view to return String and execute only when method is post
	@RequestMapping(value = "/productrequestpost", method = RequestMethod.POST)
	public String setProductData(@ModelAttribute("prod") Product prod, ModelMap m) {
		// validating if save execute successful then returning message &
		// true(validated in admin.jsp)
		if (prodao.saveProduct(prod)) {
			m.addAttribute("message", "Update Successfully");
			m.addAttribute("productrequest", true);
			m.addAttribute("edit", true);
			String cate_list = prodao.getCategoryList(new Category());
			String sup_list = prodao.getSupplierList(new Supplier_Do());
			String prod_list = prodao.getProductList(new Product());
			m.addAttribute("cate_list", cate_list);
			m.addAttribute("sup_list", sup_list);
			m.addAttribute("prod_list", prod_list);

			return "admin";
		}

		else {
			m.addAttribute("productrequest", true);
			m.addAttribute("edit", true);
			m.addAttribute("message", "Something Went Wrong");

			return "admin";

		}

	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteRequest(@RequestParam("pid") String pid, Model m) {

		if (prodao.deleteProduct(pid)) {

			m.addAttribute("prod", new Product());
			m.addAttribute("edit", true);
			m.addAttribute("productrequest", true);
			String cate_list = prodao.getCategoryList(new Category());
			String sup_list = prodao.getSupplierList(new Supplier_Do());
			String prod_list = prodao.getProductList(new Product());
			m.addAttribute("cate_list", cate_list);
			m.addAttribute("sup_list", sup_list);
			m.addAttribute("prod_list", prod_list);
			return "admin";

		} else {
			m.addAttribute("prod", new Product());
			m.addAttribute("edit", true);
			m.addAttribute("productrequest", true);
			String cate_list = prodao.getCategoryList(new Category());
			String sup_list = prodao.getSupplierList(new Supplier_Do());
			String prod_list = prodao.getProductList(new Product());
			m.addAttribute("cate_list", cate_list);
			m.addAttribute("sup_list", sup_list);
			m.addAttribute("prod_list", prod_list);
			return "admin";
		}

	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateRequest(@RequestParam("pid") String pid, Model m) {

		Product pro = prodao.getProduct(pid);
		m.addAttribute("prod", pro);
		m.addAttribute("udate", true);
		m.addAttribute("productrequest", true);
		String cate_list = prodao.getCategoryList(new Category());
		String sup_list = prodao.getSupplierList(new Supplier_Do());
		String prod_list = prodao.getProductList(new Product());
		m.addAttribute("cate_list", cate_list);
		m.addAttribute("sup_list", sup_list);
		m.addAttribute("prod_list", prod_list);
		return "admin";

	}

	@RequestMapping(value = "/updaterequestpost", method = RequestMethod.POST)
	public String udateProductData(@ModelAttribute("prod") Product prod, ModelMap m) {

		if (prodao.updateProduct(prod)) {
			m.addAttribute("message", "Update Successfully");
			m.addAttribute("productrequest", true);
			m.addAttribute("edit", true);
			String cate_list = prodao.getCategoryList(new Category());
			String sup_list = prodao.getSupplierList(new Supplier_Do());
			String prod_list = prodao.getProductList(new Product());
			m.addAttribute("cate_list", cate_list);
			m.addAttribute("sup_list", sup_list);
			m.addAttribute("prod_list", prod_list);

			return "admin";
		}

		else {
			m.addAttribute("productrequest", true);
			m.addAttribute("edit", true);
			m.addAttribute("message", "Something Went Wrong");

			return "admin";

		}

	}
}
