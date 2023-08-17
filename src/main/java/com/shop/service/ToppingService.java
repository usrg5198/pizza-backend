package com.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.pizza.ToppingRepository;

@Service
public class ToppingService {
	@Autowired
    private ToppingRepository toppingRepository;
}
