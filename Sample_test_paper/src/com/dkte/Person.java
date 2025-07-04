package com.dkte;
import java.util.Scanner;
public class Person {
  private String name;
  private MyDate dateofBirth;
  
  public Person() {
	  this.name="";
	  this.dateofBirth=new MyDate();
  }
  public Person(String name,MyDate dateofBirth) {
	  this.name=name;
	  this.dateofBirth=dateofBirth;
  }
  public String getName() {
	  return name;
  }
  public void setName(String name) {
	  this.name=name;
  }
  public MyDate getDateofBirth() {
	  return dateofBirth;
  }
  public void setDateofBirth(MyDate dateofBirth) {
	  this.dateofBirth=dateofBirth;
  }
  public void accept() {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Name:");
	  name=sc.next();
	  System.out.println("Enter the date of birth: ");
	this.dateofBirth.accept();
	  
  }
  @Override
	public String toString() {
		return "Name:"+name+"\ndateofBirth:"+dateofBirth+"\n";
	}
}