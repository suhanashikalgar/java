package com.dkte;
import java.util.Scanner;

public class Staff {
	private int id;
	private String name;
	
	public Staff() {
		//to do
	}
	public Staff(int id , String name) {
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void  setName(String name) {
		this.name=name;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Staff Id: ");
		id=sc.nextInt();
		System.out.println("Enter Staff Name: ");
		name=sc.next();
	}
	
	
	@Override
	public String toString() {
		
		return "\nId: "+id+"\nName: "+name ;
	}


}
