package com.niit.shoponweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "REGISTER")
@Component
public class RegisterationModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String user_id;
	@Column(name = "USER_NAME")
	private String name_register;
	@Column(name = "USER_EMAIL")
	private String email_register;
	private String password_register;
	@Column(name = "USER_PASSWORD")
	private String confirmpass_register;
	@Column(name = "USER_PHONE")
	private String number_register;
	@Column(name = "USER_DOB")
	private String dob_register;
	@Column(name = "USER_DOB")
	private String gender_register;
	@Column(name = "USER_ADDRESS")
	private String address_register;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getName_register() {
		return name_register;
	}

	public void setName_register(String name_register) {
		this.name_register = name_register;
	}

	public String getGender_register() {
		return gender_register;
	}

	public void setGender_register(String gender_register) {
		this.gender_register = gender_register;
	}

	public String getEmail_register() {
		return email_register;
	}

	public void setEmail_register(String email_register) {
		this.email_register = email_register;
	}

	public String getPassword_register() {
		return password_register;
	}

	public void setPassword_register(String password_register) {
		this.password_register = password_register;
	}

	public String getConfirmpass_register() {
		return confirmpass_register;
	}

	public void setConfirmpass_register(String confirmpass_register) {
		this.confirmpass_register = confirmpass_register;
	}

	public String getNumber_register() {
		return number_register;
	}

	public void setNumber_register(String number_register) {
		this.number_register = number_register;
	}

	public String getDob_register() {
		return dob_register;
	}

	public void setDob_register(String dob_register) {
		this.dob_register = dob_register;
	}

	public String getAddress_register() {
		return address_register;
	}

	public void setAddress_register(String address_register) {
		this.address_register = address_register;
	}

}
