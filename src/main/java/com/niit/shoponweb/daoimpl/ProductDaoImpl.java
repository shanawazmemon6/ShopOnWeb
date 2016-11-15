package com.niit.shoponweb.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.niit.shoponweb.dao.ProductDao;
import com.niit.shoponweb.model.Category;
import com.niit.shoponweb.model.Product;
import com.niit.shoponweb.model.Supplier_Do;

@Repository("ProductDao")

// ProductDaoImpl implements Category DAO interface
public class ProductDaoImpl implements ProductDao {

	// injects Session Factory
	@Autowired
	SessionFactory SessionFactory;

	// Constructor
	public ProductDaoImpl(SessionFactory sessionFactory) {
		this.SessionFactory = sessionFactory;
	}

	/*
	 * save method implemented from Product DAO interface. Insert the value into
	 * database
	 */
	@Transactional
	public boolean saveProduct(Product prod) {
		try {
			SessionFactory.getCurrentSession().save(prod);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}

	}
       @Transactional
	public String getCategoryList(Category cate) {
		@SuppressWarnings({ "unchecked" })
		List<Category> cate_list=(List<Category>) SessionFactory.getCurrentSession().createCriteria(Category.class).list();
			Gson  gson=new Gson();
			String cate_json=gson.toJson(cate_list);
		return cate_json;
	}

	@Transactional
	public String getSupplierList(Supplier_Do sup) {
	  @SuppressWarnings({ "unchecked" })
		List<Category> sup_list=(List<Category>) SessionFactory.getCurrentSession().createCriteria(Supplier_Do.class).list();
			Gson  gson=new Gson();
			String sup_json=gson.toJson(sup_list);
		return sup_json;
		
	}

	@Transactional
	public String getProductList(Product prod) {
		@SuppressWarnings({ "unchecked" })
		List<Category> prod_list=(List<Category>) SessionFactory.getCurrentSession().createCriteria(Product.class).list();
			Gson  gson=new Gson();
			String prod_json=gson.toJson(prod_list);
			System.out.println(prod_json);
		return prod_json;
	}


}
