package com.dkte;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	int n=5;
	int i = 0;
	int j=1;
	int nt;
	
    System.out.println("Fibonacci Series:");
    
    for(i=0 ; i<n ; i++)
    {
    	nt=i+j;
    	
    	i=j;
    	
    	j=nt;
    	
    	System.out.println(nt);
    }
        
        
	}

}
