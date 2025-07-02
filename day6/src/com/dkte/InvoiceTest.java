package com.dkte;
import java.util.Scanner;

public class InvoiceTest {
 Invoice i  =new Invoice();
 
 public void acceptRecord()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Part Number:");
		i.setPartNum(sc.nextLine());
		
		System.out.print("Enter Part Description:");
		i.setPartDescription(sc.nextLine());
		System.out.print("Enter Quantity:");
		i.setQuantity(sc.nextInt());
		System.out.print("Enter Price:");
		i.setPrice(sc.nextDouble());
	}
 
 public void printRecord() {
	 System.out.println("PartNumber: "+i.getPartNum());
	 System.out.println("PartDescription: "+i.getPartDescription());
	 System.out.println("Quantity: "+i.getQuantity());
	 System.out.println("Price per item: "+i.getPrice());
	 System.out.println("Total Amount: "+i.getAmount());
	 
 }
}
