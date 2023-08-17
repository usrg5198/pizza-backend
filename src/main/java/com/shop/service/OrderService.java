package com.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.pizza.OrderRepository;
@Service
public class OrderService {
	@Autowired
    private OrderRepository orderRepository;
}
