package tester;
import java.util.Scanner;
import com.app.gometry.*;



public class TestPointArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     
	    System.out.print("Enter no of points to plot:");
	    Point2D[] points =new Point2D[sc.nextInt()];
	    
	    for(int i=0 ;i<points.length;i++) {
	    	System.out.println("Enter X & Y Coordinates for points " +i+" :");
	    	double x=sc.nextDouble();
	    	double y=sc.nextDouble();
	    	
	       points[i] =new  Point2D(x,y);
	    }
	    
	    while(true) {
	    	System.out.println("\nMENU:");
	    	System.out.println("1. Display details of a specific point");
	    	System.out.println("2. Display x, y co-ordinates of all points");
	    	System.out.println("3. validate the indices");
	    	System.out.println("4. Exit");
	    	System.out.print("Enter your Choice:");
	    	int ch = sc.nextInt();
	    	
	    	switch(ch) {
	    	
	    	case 1:
	    		System.out.println("Enter index of points:");
	    		int index=sc.nextInt();
	    		if(index >=0 && index < points.length) {
	    			System.out.println("Points["+index+"]="+points[index].getDetails());
	    		}else
	    			System.out.println("Invalid index");
	    	   break;
	    	   
	    	case 2:
	    		System.out.println();
	    		for(Point2D p : points) {
	    			System.out.println(p.getDetails());
	    		}
	    		break;
	    		
	    	case 3:
	    		  System.out.print("Enter the index of start: ");
	    		  int index1=sc.nextInt();
	    		  System.out.println("Enter the index of end: ");
	    		  int index2=sc.nextInt();
	    		  
	    		  if(index1>=0 && index1<points.length) 
	    			  if(index2>=0 && index2 < points.length) {
	    				  if(! points[index1].isEqual(points[index2])) {
	    					  double distance = points[index1].calculateDistance(points[index2]);
	    					  System.out.println("Distance: "+distance);
	    				  }else {
	    					  System.out.println("Points are at the same location");
	    				  }
	    			  }else {
	    				  System.out.println("Invalid indices");
	    			  }
	    		  break;
	    	case 4:
	    		System.out.println("Exiting From Program");
	    		System.exit(0);
	    		break;
	    	default:
	    		System.out.println("Invalid choice");
	    	 
	    	}
	    }
	    
	}

}
