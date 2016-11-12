package com.niit.shoponweb.dao;

import com.niit.shoponweb.model.Login;
import com.niit.shoponweb.model.Register;


public interface RegisterDao {
	
	public  boolean saveRegister(Register reg);
	public boolean isvalidUser(Login log);
	public String validrole();
	public String Username();
		
	

}
