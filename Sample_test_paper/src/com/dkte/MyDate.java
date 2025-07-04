package com.dkte;

import java.util.Scanner;

public class MyDate {
    private int day;
    private int month;
    private int year;
    
    public MyDate() {
    	
    }
   public MyDate(int day,int month,int year) {
	   this.day=day;
	   this.month=month;
	   this.year=year;
	   
    	 }
   public int getDay() {
	return day;
   }
   public void setDay(int day) {
	this.day = day;
   }
   public int getMonth() {
	return month;
   }
   public void setMonth(int month) {
	this.month = month;
   }
   public int getYear() {
	return year;
   }
   public void setYear(int year) {
	this.year = year;
   }
   public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Day:");
		day=sc.nextInt();
		System.out.print("Month:");
		month=sc.nextInt();
		System.out.print("Year:");
		year=sc.nextInt();	 
		}
  
   @Override
   public String toString() {
	   return day+"-"+month+"-"+year+"\n";
   }
   
    
}