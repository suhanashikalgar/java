package com.dkte;

import java.util.Scanner;

public class TeachingStaff extends Staff{
private int noOfHours;
private double chargesPerHour;


public TeachingStaff() {
	
}

public TeachingStaff(int noOfHours, double chargesPerHour) {
	
	this.noOfHours = noOfHours;
	this.chargesPerHour = chargesPerHour;
}

public int getNoOfHours() {
	return noOfHours;
}

public void setNoOfHours(int noOfHours) {
	this.noOfHours = noOfHours;
}

public double getChargesPerHour() {
	return chargesPerHour;
}

public void setChargesPerHour(double chargesPerHour) {
	this.chargesPerHour = chargesPerHour;
}

public void accept( ) {
	super.accept();
	Scanner sc = new Scanner(System.in); 
	System.out.print("No. Of Hours: ");
	noOfHours = sc.nextInt(); 
	System.out.println("Charges Per hour:");
	 chargesPerHour=sc.nextDouble();

}
public void display() {
	System.out.println("No. Of Hours : "+noOfHours+"Charges Per hour:  "+chargesPerHour);
}

@Override
public String toString() {
	
	return super.toString()+"\nNo. Of Hours : "+noOfHours+"\nCharges Per hour:  "+chargesPerHour;
}


}
