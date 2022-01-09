package com.coffeeshop.example.items;

public class CappuccinoCoffee extends Coffee {

	@Override
	public Recipe getRecipe() {
		return new CappuccinoRecipe();
	}

}
