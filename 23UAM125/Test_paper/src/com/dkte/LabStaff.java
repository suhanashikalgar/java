package com.dkte;
import java.util.Scanner;

public class LabStaff extends Staff {
private double salary;

public LabStaff() {
	
}

public LabStaff(int salary) {
	this.salary=salary;
}

public double getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}
public void accept() {
	super.accept();
	Scanner sc = new Scanner(System.in); 
	System.out.print("Salary: ");
	salary = sc.nextDouble();
}

@Override
public String toString() {
	
	return super.toString()+"\nSalary "+salary;
}
}
