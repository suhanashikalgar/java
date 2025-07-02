package com.dkte;

public class Chair {
  private int weight,height;
  private static int price=500;
  
  public Chair()
  {
	  //parameterless constructor
  }
  public Chair(int weight,int height)
  {
	  this.weight=weight;
	  this.height=height;
  }
  static {//static block
	  price=500;
	  System.out.println("Block -- 1");
  }
  static {//static block
	  price=1000;
	  System.out.println("Block --2");
  }
  //getter setter 
  
  public static int getPrice() {
	  return price;
  }
  
  public static void setPrice(int price) {
	  Chair.price =price;
  }
  public void display() {
	  System.out.printf("Weight : %d \n Height : %d \n Price : %d\n",this.weight,this.height,Chair.price);
  }
}
