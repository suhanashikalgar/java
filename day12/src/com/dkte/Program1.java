package com.dkte;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //String s1="Suhana";
      //String s2="";
      
      /*for(int i=s1.length()-1;i>=0;i--) {
    	  s2+=s1.charAt(i);
      }
      System.out.println("Reversed: "+s2);
	*/
    //using String Buffer
    		String str = "Suhana";
            StringBuffer sb = new StringBuffer(str);
            String reversed = sb.reverse().toString();
            System.out.println("Reverse string: " + reversed);
    
}
}