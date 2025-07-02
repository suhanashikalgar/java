package com.dkte;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Date d1 =new Date();
        d1.display();
        
        Date d2 =new Date(2,2,2005);
        d2.display();
        
        Emp e1 = new Emp(1,"Suhana",10.00,d2);
        e1.display();
        
        Emp e2 =new Emp();
        e2.accept();
        e2.display();
        
	}

}
