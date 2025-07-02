package com.dkte;

public class Human {

	private int age ,weight ,height;
	
	public Human() {
		
	}
   public Human(int age ,int weight,int height) {
	   this.age=age;
	   this.weight=weight;
	   this.height=height;
   }
   //getter setter
   public void display() {
	   System.out.printf("age: %d ,weight: %d , height: %d \n",age,weight,height);
   }
   
}
