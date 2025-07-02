package com.dkte;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle c1 = new Circle(3.1); 
		
		//System.out.println("Area : "+c1.calcArea());
		//System.out.println("Peri : "+c1.calcPeri());
		
		//double rad = 5.1; 
		//c1.setRadius(radius);
		
		final Circle c2 = new Circle(4.0); //reference is final 
		
		System.out.println("Area : "+c2.calArea());
		System.out.println("Peri : "+c2.calPeri());
		c2.setRadius(6.1);
		
		//c2 = null; // we cannot modify reference is final 
		
		final int x = 10; // final local variable 
		
		//x = 20; // NOT OK ( final field once init cannot be modified)
	}

}
