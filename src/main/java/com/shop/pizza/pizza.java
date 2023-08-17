package com.shop.pizza;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class pizza {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private float price;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public pizza(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}
    
    
	public pizza() {
		
		
	}
    
    
    
    
	
	
   
    
    
//    public Object getName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public Object getPrice() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public void setName(Object name2) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void setPrice(Object price2) {
//		// TODO Auto-generated method stub
//		
//	}
	

}
