package com.dkte;
import java.util.Scanner;

public class Employee extends Person{
	private int id;
	private String department;
	private double salary;
	private MyDate dateofjoining;
	
	public Employee() {
		this.id=0;
		this.department="";
		this.salary=0.0;
		this.dateofjoining=new MyDate();
	}
	public Employee(int id,String department,double salary,MyDate dateofjoining) {
		this.id=id;
		this.department=department;
		this.salary= salary;
		this.dateofjoining=dateofjoining;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public MyDate getDateofjoining() {
		return dateofjoining;
	}
	public void setDateofjoining(MyDate dateofjoining) {
		this.dateofjoining=dateofjoining;
	}
	public void accept( ) {
		super.accept();
		Scanner sc = new Scanner(System.in); 
		System.out.print("Id : ");
		id = sc.nextInt(); 
		System.out.print("Department : ");
		department= sc.next(); 
		System.out.print("Salary : ");
		salary = sc.nextDouble(); 
		System.out.print("Enter the date of joining : ");
		this.dateofjoining.accept();
	}
	@Override
	public String toString() {
		
		return super.toString()+"\nId:"+id+"\nDepartment:"+department+
				"\nSalary:"+salary+
				"\nDateofJoining:"+dateofjoining+"\n";
	}
	
	

}