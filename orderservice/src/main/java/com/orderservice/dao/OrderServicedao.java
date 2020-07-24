package com.orderservice.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.orderservice.entity.Orders;



public interface OrderServicedao extends JpaRepository<Orders, Long>{

	
	List<Orders> findAllBycustomername(String customername);
}
