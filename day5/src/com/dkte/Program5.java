package com.dkte;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Person p1 =new Person() ;
		p1.display();
		Person p2 = new Person(" ",20);
		p2.display();
		*/
		//Student s1 =new Student();
		//s1.display();
		Student s2=new Student("Suhana",20,1,"BTech",88);
        //s2.display();
        
        
		System.out.println("Name : " + s2.getName());
		System.out.println("Age  : "+s2.getAge());
		System.out.println("Roll : "+s2.getRoll());
		System.out.println("Course : "+s2.getCourse());
		System.out.println("Marks : "+s2.getMarks());
	}

}
