package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.pizza.OrderRepository;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

	   @Autowired
	    private OrderRepository orderRepository;
}
