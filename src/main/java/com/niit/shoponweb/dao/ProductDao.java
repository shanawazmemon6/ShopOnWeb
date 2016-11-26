package com.niit.shoponweb.dao;

import java.util.List;

import com.niit.shoponweb.model.Category;
import com.niit.shoponweb.model.Product;
import com.niit.shoponweb.model.SubCategory;
import com.niit.shoponweb.model.Supplier_Do;

//Product DAO interface
public interface ProductDao {
	// Save method declaration with Product DO parameters

	public boolean saveProduct(Product prod);
	public boolean updateProduct(Product prod);
	public String  getCategoryList(Category cate);
	public String  getSupplierList(Supplier_Do sup);
	public String   getProductList(Product prod);
	public String    getSubCategoryList(SubCategory subcate);
	public Product  getProduct(String p_id);
	public boolean  deleteProduct(String d_p_id);
	public List<Product> userProductList(String pro_id);
	public List<Category>  getCategoryListArray(String cat_id);
	public List<SubCategory>  getSubCategoryListArray(String sub_id);
	public List<Product>   getProductwithSubCate(String sub_id);



}
