package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Order1;
import com.example.Service.OrderService;

@RestController
@RequestMapping("api/order")
public class OrderController {

	@Autowired
	private OrderService orderservice;
	
	@PostMapping
	public Order1 createorder(@RequestBody Order1 order) {
		order.setStatus("Pending");
		
		return orderservice.createorder(order);
	}
	
	@GetMapping("/all")
	public List<Order1> getallorders(){
		return orderservice.getallorders();
	}
}
