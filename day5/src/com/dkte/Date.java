package com.dkte;
import java.util.Scanner;

public class Date {
private int day , month ,year;

public Date() {
	this(1,1,2000);
}
public Date(int day , int month ,int year) {
	this.day=day;
	this.month=month;
	this.year=year;
}
//getter setter
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day=day;
}

public int getMonth() {
	return day;
}
public void setMonth(int month) {
	this.month=month;
}
public int getYear() {
	return day;
}
public void setYear(int year) {
	this.year=year;
}
public void accept( ) {
	Scanner sc = new Scanner(System.in); 
	System.out.print("Day : ");
	day = sc.nextInt(); 
	System.out.print("Month : ");
	month = sc.nextInt(); 
	System.out.print("Year : ");
	year = sc.nextInt(); 
}
public void display() {
	System.out.printf("Date : %d-%d-%d\n",this.day,this.month,this.year);
}
}
