package com.shop.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.pizza.pizza;
import com.shop.pizza.pizzaRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200/" )
@RequestMapping("/")
public class pizzaController {

	@Autowired
    private pizzaRepository pizzaRepository;

    @GetMapping("/getAllPizzas")
    public List<pizza> getAllPizzas() {
        return pizzaRepository.findAll();
    }

    @GetMapping("/getpizza/{id}")
    public pizza getPizzaById(@PathVariable Long id) {
        return pizzaRepository.findById(id).orElse(null);
    }

    @PostMapping
    public pizza createPizza(@RequestBody pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    @PutMapping("/{id}")
    public pizza updatePizza(@PathVariable Long id, @RequestBody pizza updatedPizza) {
        pizza existingPizza = pizzaRepository.findById(id).orElse(null);
        if (existingPizza != null) {
            existingPizza.setName(updatedPizza.getName());
            existingPizza.setPrice(updatedPizza.getPrice());
            return pizzaRepository.save(existingPizza);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePizza(@PathVariable Long id) {
        pizzaRepository.deleteById(id);
    }
}
