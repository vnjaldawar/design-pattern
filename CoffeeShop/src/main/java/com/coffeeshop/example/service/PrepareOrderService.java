package com.coffeeshop.example.service;

import com.coffeeshop.example.items.Coffee;
import com.coffeeshop.example.pattern.CoffeeFactory;

public class PrepareOrderService {
	
	public String prepareOrder(String order) {
		CoffeeFactory factory = new CoffeeFactory();
		Coffee coffee = factory.makeCoffee(order);
		coffee.prepareCoffee();
		return coffee.toString();
	}

}
