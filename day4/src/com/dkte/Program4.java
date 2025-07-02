package com.dkte;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		int[] arr1 = new int[3]; 
		
		int[] arr2 = new int[] {10,20,30};
		
		int[] arr3 = {10,20,30,40,50}; 
		
		/* 
		for(int i = 0 ; i < arr3.length ; i++) {
			System.out.println(arr3[i]);
		}*/ 
		/* 
		for(int ele : arr3) {
			System.out.println(ele);
		}*/ 
		//System.out.println(arr3[-1]);
		//Bound checking done by compiler (ArrayIndexOutOfBoundException) 
		
		Scanner sc = new Scanner(System.in); 
		double[] arr = new double[3]; 
		System.out.println("Enter the elements ");
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextDouble(); 
		}
		double arrayAddition = Program4.arraySum(arr); 
		System.out.println("Sum : "+arrayAddition);
	}
	public static double arraySum(double[] a) {
		double total = 0.0; 
		for(int i = 0 ; i < a.length ; i++) {
			total = total + a[i]; 
		}
		return total; 
	}


}
