package com.orderitem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderitem.entity.Orderitem;


public interface OrderItemInterface extends JpaRepository<Orderitem, Long> {

	List<Orderitem> findAllByproductcode(String productcode);
	
}
