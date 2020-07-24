package com.orderitem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.orderitem.dao.OrderItemInterface;
import com.orderitem.entity.Orderitem;


@RestController
public class OrderItemController {

	@Autowired
	private OrderItemInterface orderiteminterface;
	
	@RequestMapping("items")
	@HystrixCommand(fallbackMethod="getfallback") 
	public String getAllItems(){
		return "in items";
		//return orderiteminterface.findAll();
	}
	
	public String getfallback(){
		return "Trigger this method when failed";
		
	}
	
	
	@GetMapping("/items/{productcode}")
	public List<Orderitem>getOrderbyname(@PathVariable String productcode){
		return orderiteminterface.findAllByproductcode(productcode);
	}
	
	
	
	
}
