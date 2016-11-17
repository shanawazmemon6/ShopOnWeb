package com.niit.shoponweb.dao;

import com.niit.shoponweb.model.Category;
//Category DAO interface
public interface CategoryDao {
	// Save method declaration with Category DO parameters
	public boolean saveCategory(Category cate);
	public  boolean updateCategory(Category cate);
	public String getCategoryList(Category cate);
	public  Category getCategory(String cat_id);
	public boolean deleteCategory(String cat_id);


}
