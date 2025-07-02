package com.app.fruits;

public class Orange extends Fruits {
	public Orange( String name,String color, double weight) {
		super(name, color, weight);
	
	}
	@Override
	public String taste() {
		return "sour";
	}
}
