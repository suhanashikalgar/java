package com.dkte;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String [] arr1 = {"Red","Black","White","Grey",""};
   String []arr2 = {"Blue","Green","Black","White","Orange"};
   
   System.out.println("Duplicate values are:");
   for(int i=0;i<arr1.length;i++){
   for(int j=0; j<arr2.length;j++) {
	   if(arr1[i].equals(arr2[j])) {
		   System.out.println(arr1[i]);
	   }
   }
   }
	}

}
