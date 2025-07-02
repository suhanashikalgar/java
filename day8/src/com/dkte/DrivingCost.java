package com.dkte;
import java.util.Scanner;

public class DrivingCost {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Total miles driven per day: ");
    double totalMiles =sc.nextDouble();
    
    System.out.println("Enter Cost per gallon of gasoline: ");
    double cost = sc.nextDouble();
    
    System.out.println("Enter average miles per gallon: ");
    double miles=sc.nextDouble();
    
    System.out.println("Enter parking fees per day: ");
    double fees = sc.nextDouble();
    
    System.out.println("Enter Tolls per day: ");
		double tolls =sc.nextDouble();
		
        //fuel cost
		double fuelCost=(totalMiles/miles)*cost;
		//daily cost
		double totalCost =fuelCost+fees+tolls;
		
		System.out.println("your total driving cost per day is:"+totalCost);
	}

}
