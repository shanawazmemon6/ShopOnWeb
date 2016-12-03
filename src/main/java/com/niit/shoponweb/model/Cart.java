package com.niit.shoponweb.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Cart {
	
	@Id
	private String cart_id;
	@Column
	private String pro_id;
	@Column
	private int quantity;
	@Column
	private double price;
	@Column
	private Date  date_cart;
	
	

	public String getCart_id() {
		return cart_id;
	}
	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}
	
	public String getPro_id() {
		return pro_id;
	}
	public void setPro_id(String pro_id) {
		this.pro_id = pro_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDate_cart() {
		return date_cart;
	}
	public void setDate_cart(Date date_cart) {
		this.date_cart = date_cart;
	}
	

}
