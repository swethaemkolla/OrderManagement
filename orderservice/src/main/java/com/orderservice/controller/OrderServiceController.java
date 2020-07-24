package com.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.orderservice.dao.OrderServicedao;
import com.orderservice.entity.Orders;

@RestController
public class OrderServiceController {

	@Autowired
 private OrderServicedao orderservicedao;
 
	@RequestMapping("orders")
	@HystrixCommand(fallbackMethod="getfallback") 
	public String getAllOrders(){
		return "in orders";
		//return orderservicedao.findAll();
	}
	
	public String getfallback(){
		return "Trigger this method when failed";
		
	}
	
	
	@GetMapping("/orders/{customername}")
	public List<Orders>getOrderbyname(@PathVariable String customername){
		return orderservicedao.findAllBycustomername(customername);
	}
	
}

