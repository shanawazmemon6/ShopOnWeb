package com.niit.shoponweb.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Table
@Entity
@Component
public class Orders implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String order_id;
	private String email_id;
	
	private String ship_address;
	
	private String bill_address;
	
	public String getBill_address() {
		return bill_address;
	}
	public void setBill_address(String bill_address) {
		this.bill_address = bill_address;
	}
	public String getShip_address() {
		return ship_address;
	}
	public void setShip_address(String ship_address) {
		this.ship_address = ship_address;
	}
	private  long total;
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	
	
	
	
	

}
