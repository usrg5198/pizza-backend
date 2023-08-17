package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.pizza.ToppingRepository;

@RestController
@RequestMapping("/api/toppings")
public class ToppingController {

    @Autowired
    private ToppingRepository toppingRepository;

}
