package com.niit.shoponweb.dao;

import com.niit.shoponweb.model.Category;
import com.niit.shoponweb.model.Product;
import com.niit.shoponweb.model.Supplier_Do;

//Product DAO interface
public interface ProductDao {
	// Save method declaration with Product DO parameters

	public boolean saveProduct(Product prod);
	public String  getCategoryList(Category cate);
	public String  getSupplierList(Supplier_Do sup);


}
