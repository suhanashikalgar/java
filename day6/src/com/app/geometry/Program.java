package com.app.geometry;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter coordinates of pt.1:");
    
    int x1=sc.nextInt();
    int y1=sc.nextInt();
    
    System.out.println("Enter coordinates of pt.2:");
    
    int x2=sc.nextInt();
    int y2=sc.nextInt();
    
    Point2D p1 = new Point2D(x1,y1);
    Point2D p2 =new Point2D(x2,y2);
    
    System.out.println(p1.getDetails());
    System.out.println(p2.getDetails());
    
    if(p1.isEqual(p2)) {
    	System.out.println("Both pts. are at same location");
    }else {
    	System.out.println("pts. are at diff location");
    	double distance=p1.calculateDistance(p2);
    	
    	System.out.printf("distance betn 2 pts. :%.2f" ,distance);
    }
    
	}

}
