package com.dkte;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Date dt1 =new Date(1,1,2020);
      dt1.displayDate();
      
      dt1.setMonth(2);
      dt1.setDay(2);
      dt1.setYear(2005);
      System.out.println("Updated date:");
      dt1.displayDate();
      
	}

}
