package com.dkte;
import java.util.Scanner;

public class CreditCal {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Account Number: ");
    int accNo = sc.nextInt();
    
    System.out.println("Enter Balance of beginning of the month: ");
    int bal = sc.nextInt();
    
    System.out.println("Enter total of all items charged by the customer this month: ");
    int charges = sc.nextInt();
    
    System.out.println("total of all credits applied to the customer’s account this: ");
    int credits = sc.nextInt();
    
    System.out.println("Enter allowed credit limit: ");
    int creditLimit = sc.nextInt();
    
    int newBalance = (bal + charges - credits);
    System.out.println("New Balance: "+newBalance);
    
  boolean isCreditLimitExceeded = newBalance > creditLimit;  
  
   if(isCreditLimitExceeded) {
	   System.out.println("Credit Limit is Exceeded.");
   }
   
	}
}
