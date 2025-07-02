package com.dkte;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Human[] arr = new Human[4];
        
      /*  Human[] arr1 = {
        		        new Human(31, 69,172),
        		        new Human(31, 69,172),
        		        new Human(31,69,172),
        		        new Human(31,69,172),
        };*/
        
       arr[0]= new Human(31, 69,172);
       arr[1]= new Human(31, 69,172);
       arr[2]= new Human(31,69,172);
       arr[3]=new Human(31,69,172);
       
       for(int i=0;i<arr.length;i++) {
    	   arr[i].display();
       }
	}

}
