package com.dkte;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 30;
		
		if(a<b && c<b) {
			System.out.println("maximum no. is b="+b);
		}
			else if(b<a && c<a) {
				System.out.println("maximum no. is a="+a);
			}
			else
			{
				System.out.println("maximum no. is c="+c);
			}
		
		

	}

}
