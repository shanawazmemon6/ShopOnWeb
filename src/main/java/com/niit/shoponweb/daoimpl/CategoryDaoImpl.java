package com.niit.shoponweb.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.niit.shoponweb.dao.CategoryDao;
import com.niit.shoponweb.model.Category;

@Transactional
@Repository("categoryDao")
// categoryDaoImpl implements Category DAO interface
public class CategoryDaoImpl implements CategoryDao {
	// injects Session Factory
	@Autowired
	SessionFactory sessionFactory;

	// Constructor
	public CategoryDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;

	}

	/*
	 * save method implemented from Category DAO Interface. Insert the value
	 * into database
	 */
	public boolean saveCategory(Category cate) {

		try {
			sessionFactory.getCurrentSession().save(cate);
			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	@Transactional
	public String getCategoryList(Category cate) {
		@SuppressWarnings("unchecked")
		List<Category> cat_list=sessionFactory.getCurrentSession().createCriteria(Category.class).list();
		Gson gson=new Gson();
		String cate_json=gson.toJson(cat_list);
		
		
		return cate_json;
	}

}
