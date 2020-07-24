package com.orderservice.entity;

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
@Table(name="Orders")
public class Orders {

	@Id
	private String customername;
	private String orderdate;
	private String shipaddress;
	private String items;
	private Long total;
	

	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	public String getShipaddress() {
		return shipaddress;
	}
	public void setShipaddress(String shipaddress) {
		this.shipaddress = shipaddress;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	
	public Orders(String customername,String orderdate, String shipaddress,String items, Long total) {
		
		super();
		this.customername = customername;
		this.orderdate=orderdate;
		this.shipaddress =shipaddress;
		this.items = items;
		this.total = total;
	
	}
	public Orders() {
		super();
	}
	
}
