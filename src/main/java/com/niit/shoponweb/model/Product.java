package com.niit.shoponweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
@Component

// Product DO with setter & getter method
public class Product {

	@Id
	private String pro_id;
	@Column
	private String pro_name;
	@Column
	private int pro_price;
	@Column
	private String pro_cate_id;
	@Column
	private String pro_sup_id;
	@Column
	private String pro_desc;
	@Column
	private String pro_stock;
	@Transient
	private MultipartFile pro_image;

	public MultipartFile getPro_image() {
		return pro_image;
	}

	public void setPro_image(MultipartFile pro_image) {
		this.pro_image = pro_image;
	}

	// @ManyToOne
	// @JoinColumn(name="pro_cate_id",updatable=false,insertable=false,nullable=false)
	// private String category;
	//
	// @ManyToMany
	// @JoinColumn(name="pro_sup_id",updatable=false,insertable=false,nullable=false)
	// private String supplier;
	//
	public String getPro_id() {
		return pro_id;
	}

	public void setPro_id(String pro_id) {
		this.pro_id = pro_id;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public int getPro_price() {
		return pro_price;
	}

	public void setPro_price(int pro_price) {
		this.pro_price = pro_price;
	}

	public String getPro_cate_id() {
		return pro_cate_id;
	}

	public void setPro_cate_id(String pro_cate_id) {
		this.pro_cate_id = pro_cate_id;
	}

	public String getPro_sup_id() {
		return pro_sup_id;
	}

	public void setPro_sup_id(String pro_sup_id) {
		this.pro_sup_id = pro_sup_id;
	}

	public String getPro_desc() {
		return pro_desc;
	}

	public void setPro_desc(String pro_desc) {
		this.pro_desc = pro_desc;
	}

	public String getPro_stock() {
		return pro_stock;
	}

	public void setPro_stock(String pro_stock) {
		this.pro_stock = pro_stock;
	}

	// public String getCategory() {
	// return category;
	// }
	//
	// public void setCategory(String category) {
	// this.category = category;
	// }
	//
	// public String getSupplier() {
	// return supplier;
	// }
	//
	// public void setSupplier(String supplier) {
	// this.supplier = supplier;
	// }

}
