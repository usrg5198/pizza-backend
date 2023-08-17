package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shop.pizza.pizzaRepository;

import com.shop.pizza.pizza;

@Service
public class pizzaService {

	@Autowired
    private  pizzaRepository pizzarepo;

    public <pizzarepo> List<pizza> getAllPizzas() {
        return pizzarepo.findAll();
    }

    public pizza getPizzaById(Long id) {
        return pizzarepo.findById(id).orElse(null);
    }

    public pizza createPizza(pizza pizza) {
        return pizzarepo.save(pizza);
    }

    public pizza updatePizza(Long id, pizza updatedPizza) {
        pizza existingPizza = pizzarepo.findById(id).orElse(null);
        if (existingPizza != null) {
            existingPizza.setName(updatedPizza.getName());;
            existingPizza.setPrice(updatedPizza.getPrice());     
        }
        return pizzarepo.save(existingPizza);
    }

    public void deletePizza(Long id) {
    	pizzarepo.deleteById(id);;
        }
    }
   
