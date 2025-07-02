package com.dkte;
import java.util.Calendar;
import java.util.Scanner;

class Date1{ 
	
	//fields 
	
	private int day; 
	private int month; 
	private int year; 
	
	//parameter less constructor
	public Date1( ) {
	   System.out.println("Date() ");
	   Calendar c = Calendar.getInstance(); 
	   day = c.get(Calendar.DATE); 
	   month = c.get(Calendar.MONTH) + 1; 
	   year = c.get(Calendar.YEAR); 
	}
	
	//parameterized constructor
	public Date1(int day, int month, int year)
	{
		System.out.println("public Date(Day ,Month ,year)");
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Day: ");
		 day = sc.nextInt();
		System.out.println("Month: ");
		 month = sc.nextInt();
		System.out.println("Year: ");
		year = sc.nextInt();

		}
	public void printRecord() {
		System.out.println("Day: "+this.day);
		System.out.println("Month: "+this.month);
		System.out.println("Year:"+this.year);
	}
}


public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Date1 d1 = new Date1(); //instance
	     
		 Date1 d2 = new Date1(2,2,2005);
		 
	       d2.printRecord();
	}      

	}
