package com.coffeeshop.example.items;

public class CappuccinoRecipe extends EspressoRecipe {

	@Override
	public void mix() {
		this.customize();
		super.mix();
		String addedItem = "with a smaller amount of steamed (hot) milk";
		System.out.println(addedItem);
	}
	
	@Override
	public void customize() {
		System.out.println(Size.Medium);
		System.out.println(Flavour.Vanilla);
		System.out.println("Added Sugar");
	}

}
