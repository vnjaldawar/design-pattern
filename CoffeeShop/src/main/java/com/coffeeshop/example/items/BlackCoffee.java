package com.coffeeshop.example.items;

public class BlackCoffee extends Coffee {

	@Override
	public Recipe getRecipe() {
		return new BlackRecipe();
	}

}
