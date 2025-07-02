package com.dkte;

public class Conversion {
 //widening
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
      byte b = 10;
      short s = b;
      //short s = (short)b; 
      System.out.println("b:"+b );
      System.out.println("s:"+s);
	}*/
	
	/*public static void main(String[] args) {
		int i = 9;
		float j = i;
		System.out.println("i :"+i);
		System.out.println("j :"+j);
	}*/
	
	//narrowing
	
	/*public static void main(String[] args) {
		double a  = 65.45;
		int b = (int) a;
		System.out.println("a :"+a);
		System.out.println("b :"+b);
	}*/
	
	public static void main(String[] args) {
		int a  = 65;
		char  b = (char) a;
		System.out.println("a :"+a);
		System.out.println("b :"+b);
	}

}
