package com.niit.shoponweb.dao;

import com.niit.shoponweb.model.Supplier_Do;

//Supplier DAO interface
public interface SupplierDao {

	// Save method declaration with Product DO parameters
	public boolean saveSupplier(Supplier_Do sup);
	public String  getSuppilerList(Supplier_Do sup);

}
