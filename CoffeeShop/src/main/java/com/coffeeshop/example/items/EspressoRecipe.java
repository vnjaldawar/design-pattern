package com.coffeeshop.example.items;

public class EspressoRecipe implements Recipe {

	@Override
	public void mix() {
		String item = "a small shot of coffee";
		System.out.println(item);
	}

}
