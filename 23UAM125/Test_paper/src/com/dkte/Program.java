package com.dkte;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
   
    Staff[] stf =  new Staff[10];
    int counter=0;
    
    while(true) {
    	System.out.println();
    	System.out.println("1. Add Teaching staff.");
    	System.out.println("2. Add Lab staff.");
    	System.out.println("3. Display all Teaching staff.");
    	System.out.println("4. Display All Lab staff.");
    	System.out.println("5. Find specific teaching staff.");
    	System.out.println("6. Find specific lab staff.");
    	System.out.println("7. Display teaching staff who worked for highest hours");
    	System.out.println("8. Display lab staff who have lowest salary");
    	System.out.println("9. Exit");
    	
    	System.out.print("Enter Your Choice:");
    	int ch=sc.nextInt();
    	switch(ch) {
    	case 1:
    		if(counter < stf.length) {
				
				stf[counter]=new TeachingStaff();
				stf[counter].accept();
				counter++;
			}
			else System.out.println(" Teaching staff can not be added");
			break;

    	case 2:
    		if(counter < stf.length) {
				
				stf[counter]=new LabStaff();
				stf[counter].accept();
				counter++;
			}
			else System.out.println("Employee full");
			break;

            
    	case 3: // Display all Teaching staff
    	    for (int i = 0; i < counter; i++) {
    	        if (stf[i] instanceof TeachingStaff) {
    	            System.out.println(stf[i].toString());
    	        }
    	    }
    	    break;

    	case 4: // Display all Lab staff
    	    for (int i = 0; i < counter; i++) {
    	        if (stf[i] instanceof LabStaff) {
    	            System.out.println(stf[i].toString());
    	        }
    	    }
    	    break;

    	case 5: // Find specific teaching staff by name
    	    sc.nextLine(); // Clear buffer
    	    System.out.print("Enter name to search (Teaching Staff): ");
    	    String tName = sc.nextLine();
    	    boolean tFound = false;
    	    for (int i = 0; i < counter; i++) {
    	        if (stf[i] instanceof TeachingStaff && stf[i].getName().equalsIgnoreCase(tName)) {
    	            System.out.println(stf[i].toString());
    	            tFound = true;
    	        }
    	    }
    	    if (!tFound) {
    	        System.out.println("No Teaching Staff found with that name.");
    	    }
    	    break;

    	case 6: // Find specific lab staff by name
    	    sc.nextLine(); // Clear buffer
    	    System.out.print("Enter name to search (Lab Staff): ");
    	    String lName = sc.nextLine();
    	    boolean lFound = false;
    	    for (int i = 0; i < counter; i++) {
    	        if (stf[i] instanceof LabStaff && stf[i].getName().equalsIgnoreCase(lName)) {
    	            System.out.println(stf[i].toString());
    	            lFound = true;
    	        }
    	    }
    	    if (!lFound) {
    	        System.out.println("No Lab Staff found with that name.");
    	    }
    	    break;

    	case 7: // Teaching staff who worked highest hours
    	    int maxHours = -1;
    	    TeachingStaff topTeaching = null;
    	    for (int i = 0; i < counter; i++) {
    	        if (stf[i] instanceof TeachingStaff) {
    	            TeachingStaff ts = (TeachingStaff) stf[i];
    	            if (ts.getNoOfHours() > maxHours) {
    	                maxHours = ts.getNoOfHours();
    	                topTeaching = ts;
    	            }
    	        }
    	    }
    	    if (topTeaching != null) {
    	        System.out.println("Teaching staff with highest working hours:");
    	        System.out.println(topTeaching.toString());
    	    } else {
    	        System.out.println("No teaching staff found.");
    	    }
    	    break;

    	case 8: // Lab staff with lowest salary
    	    double minSalary = Double.MAX_VALUE;
    	    LabStaff lowestLab = null;
    	    for (int i = 0; i < counter; i++) {
    	        if (stf[i] instanceof LabStaff) {
    	            LabStaff ls = (LabStaff) stf[i];
    	            if (ls.getSalary() < minSalary) {
    	                minSalary = ls.getSalary();
    	                lowestLab = ls;
    	            }
    	        }
    	    }
    	    if (lowestLab != null) {
    	        System.out.println("Lab staff with lowest salary:");
    	        System.out.println(lowestLab.toString());
    	    } else {
    	        System.out.println("No lab staff found.");
    	    }
    	    break;

    	case 9:
    		System.out.println("Exit application");
     	   System.exit(0);
     	  
    		break;
    	default :
    		System.out.println("Invalid Choice");
    	}
    }
	}



}
