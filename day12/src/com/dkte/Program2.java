package com.dkte;
import java.util.Scanner;
public class Program2 {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		/* int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
		}*/
	}
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = scanner.nextLine();
	        
	        if (isPalindrome(str)) {
	            System.out.println(str + " is a palindrome.");
	        } else {
	            System.out.println(str + " is not a palindrome.");
	        }
	       
	    }
		//using string buffer
		public static boolean isPalindrome(String str) {
	        StringBuffer sb = new StringBuffer(str);
	        String reversed = sb.reverse().toString();
	        return str.equals(reversed);
	}

}
