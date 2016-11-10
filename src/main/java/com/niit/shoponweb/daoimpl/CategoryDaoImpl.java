package com.niit.shoponweb.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoponweb.dao.CategoryDao;
import com.niit.shoponweb.model.Category;

@Transactional
@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	
	@Autowired
	SessionFactory sessionFactory;
	
	 public CategoryDaoImpl(SessionFactory sessionFactory) {
		 this.sessionFactory=sessionFactory;
		
	}
	
	public boolean saveCategory(Category cate)  {
		
		
		try {
			sessionFactory.getCurrentSession().save(cate);
			return true;
			
		} 
		catch (Exception  e) {
		    e.printStackTrace();
			
			return false;
		}
	}

}
