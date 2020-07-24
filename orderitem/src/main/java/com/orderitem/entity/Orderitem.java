package com.orderitem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="OrderItems")
public class Orderitem {

	@Id
	private String productcode;
	private String productname;
	private String quantity;
	
	public String getProductcode() {
		return productcode;
	}
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
public Orderitem(String productcode,String productname, String quantity) {
		
		super();
		this.productcode = productcode;
		this.productname=productname;
		this.quantity =quantity;
		
	}
	public Orderitem() {
		super();
	}
}
