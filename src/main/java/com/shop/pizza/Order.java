package com.shop.pizza;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	

    
    private double totalPrice;
    
    
    
    
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Order(double totalPrice) {
		super();
		
		this.totalPrice = totalPrice;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    
    
    
    

}