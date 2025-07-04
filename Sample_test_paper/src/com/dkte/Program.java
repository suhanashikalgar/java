package com.dkte;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Employee[] Emp = new Employee[10];
        int counter=0;	
        
        while(true) {
        	System.out.println("1.Add Employee:");
        	System.out.println("2.Display All Employees:");
        	System.out.println("3.Search Employee by ID:");
        	System.out.println("4.Display Employees joined in given Year:");
        	System.out.println("5.Find Employee with Maximum Salary:");
        	System.out.println("6.Find Employee with Minimum Salary:");
        	System.out.println("7.Exit the Application.");
        	
        	System.out.print("Enter Your Choice:");
        	int ch=sc.nextInt();
        	
        	switch(ch) {
        	case 1:
        		if(counter < Emp.length) {
    				
    				Emp[counter]=new Employee();
    				Emp[counter].accept();
    				counter++;
    			}
    			else System.out.println("Employee full");
    			break;
    			
        	case 2:
        		for (int i = 0; i < counter; i++) {
                    System.out.println("\nEmployee " + (i + 1) + ":\n" + Emp[i]);
                }
                break;
        	case 3:
        		System.out.print("Enter Employee ID to search: ");
                int searchId = sc.nextInt();
                boolean found = false;
                for (int i = 0; i < counter; i++) {
                    if (Emp[i].getId() == searchId) {
                        System.out.println("Found Employee\n" + Emp[i]);
                        found = true;
                        break;
                    }
                    else {
                    	System.out.println("Employee not found\n");
                    	
                    }
                    
                }	
                break;
        	case 4:
        		System.out.print("Enter year to search: ");
                int year = sc.nextInt();
                boolean yearFound = false;
                for (int i = 0; i < counter; i++) {
                    if (Emp[i].getDateofjoining().getYear() == year) {
                        System.out.println(Emp[i]);
                        yearFound = true;
                    }
                    else {
                    	System.out.println("No Employee joined this year");
                    	
                    }
                }
                break;
        	case 5:
                if (counter == 0) {
                    System.out.println("No employees in the system.");
                    break;
                }
                Employee maxEmp = Emp[0];
                for (int i = 1; i < counter; i++) {
                    if (Emp[i].getSalary() > maxEmp.getSalary()) {
                        maxEmp = Emp[i];
                    }
                }
                System.out.println("Employee with Max Salary:\n" + maxEmp);
                break;
        	case 6:
                if (counter == 0) {
                    System.out.println("No employees in the system.");
                    break;
                }
                Employee minEmp = Emp[0];
                for (int i = 1; i < counter; i++) {
                    if (Emp[i].getSalary() < minEmp.getSalary()) {
                        minEmp = Emp[i];
                    }
                }
                System.out.println("Employee with Minimum Salary:\n" + minEmp);
                break;
        	case 7:
        	   System.out.println("Exit application");
        	   System.exit(0);
        	   break;
        	   
        	default :
        		System.out.println("Invalid Choice");
        	   
        		
        	}
        	
        		
        }

	}

}