package com.coffeeshop.example.items;

public abstract class Coffee {
	
	/*
	 * Coffee HAS-A Recipe [Composition over Inheritance]
	 */
	private Recipe recipe;
	
	public abstract Recipe getRecipe();
	
	/**
	 * Prepare Coffee - 
	 *  has fixed set of steps to prepare
	 *  each recipe is different for each type of coffee
	 *  
	 * A common behavior / process is implemented
	 * uncommon behavior has abstract implementation
	 */
	public void prepareCoffee() {
		this.grindCoffee();
		recipe = getRecipe();//abstract definition -> concrete definition will be in child classes
		recipe.mix(); // program to interface
		this.pourCoffee();
	};
	
	public void grindCoffee() {
		System.out.println("Grind coffee beans");
	}
	
	public void pourCoffee() {
		System.out.println("Pour Coffee into Cup");
	}

}
