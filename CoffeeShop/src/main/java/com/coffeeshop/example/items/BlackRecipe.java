package com.coffeeshop.example.items;

public class BlackRecipe implements Recipe {

	@Override
	public void mix() {
		this.customize();
		System.out.println("Boil Coffee, Add Coffee Powder, Add Sugar");
	}

}
