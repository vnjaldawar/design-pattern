package com.coffeeshop.example.items;

/* https://www.fluentu.com/blog/english/how-to-order-coffee-in-english/ */
@FunctionalInterface
public interface Recipe {
	void mix();
	
	public enum Size {
		Small, Medium, Large;
	}
	
	public enum Flavour {
		Vanilla, Hazelnut, Caramel, Toffe;
	}
	
	public enum State {
		Hot, Cold;
	}
	
	default void customize() {
		System.out.println(Size.Medium);
		System.out.println("No Flavour");
		System.out.println("Added Sugar");
	}
}
