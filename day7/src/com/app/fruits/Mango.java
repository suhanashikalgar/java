package com.app.fruits;

public class Mango extends Fruits {
	public Mango(String name, String color, double weight) {
		super(name, color, weight);
	
	}
	@Override
	public String taste() {
		return "sweet ";
	}
}
