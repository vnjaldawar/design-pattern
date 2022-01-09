package com.coffeeshop.example.pattern;

import com.coffeeshop.example.items.BlackCoffee;
import com.coffeeshop.example.items.CappuccinoCoffee;
import com.coffeeshop.example.items.Coffee;

public class CoffeeFactory {
	
	public Coffee makeCoffee(String type) {
		switch (type) {
			case "Capacino" : return new CappuccinoCoffee();
			case "Black" : return new BlackCoffee();
			default: throw new IllegalArgumentException("wrong coffee type");
		}
	}

}
