package com.dkte;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter No.:");
      int n = sc.nextInt();
      System.out.println("Given No.:"+n);
      
      //wrapper class
      
      Integer i = new Integer(n); 
      
      String s1 =i.toBinaryString(n);
      String s2 =i.toHexString(n); 
      String s3 =i.toOctalString(n);
      
      System.out.println("Binary equivalent:"+s1);
      System.out.println("Hexadecimal equivalent:"+s2);
      System.out.println("Octal equivalent:"+s3);
	}

}
