package com.dkte;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Integer b = new Integer(a); // Boxing 
		
		//Converting wrapper to primitive -> unboxing 
		int c = b.intValue(); // Unboxing 
		
		System.out.println("c:"+c);

	}

}
