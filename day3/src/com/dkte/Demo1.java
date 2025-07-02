package com.dkte;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Integer i = new Integer(a); 
		
		// type-conversion 
		double d = i.doubleValue(); 
		System.out.println("d:"+d); 
		
		float f = i.floatValue(); 
		System.out.println("f:"+f);
		
		byte b = i.byteValue(); 
		System.out.println("b:"+b);
		
		// Helper function 
		int max = Integer.max(50, 70); 
		System.out.println("Max : "+max);
	}

}
