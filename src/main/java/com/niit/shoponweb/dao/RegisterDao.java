package com.niit.shoponweb.dao;

import com.niit.shoponweb.model.Login;
import com.niit.shoponweb.model.Register;

//Register DAO interface

public interface RegisterDao {

	// Save method declaration with Register DO parameters
	public boolean saveRegister(Register reg);

	// Checks the user is valid or not
	public boolean isvalidUser(String email,String password);

	// returns the valid user role
	public String validrole();

	// returns the valid user name
	public String Username();
    
	public String Email();
}
