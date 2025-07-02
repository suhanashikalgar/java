package com.app.fruits;
import java.util.Scanner;

;

public class FruitsBasket {

	public static void main(String[] args) {
		
   Scanner sc = new Scanner(System.in);
     
    System.out.print("Enter the Basket size:");
    Fruits[] Basket = new Fruits[sc.nextInt()];
    int counter = 0;
    
    while(true) {
    	System.out.println("0. Exit\n1. Add Mango \n2. Add Orange\n3. Add Apple ");
    	System.out.println("4.Show Fruit Name\n5. Fresh Fruit Details");
    	System.out.println("6. Mark a fruit as stale\n7. Display tastes of all stale(not fresh) fruits in the basket. ");
    	System.out.print("Enter your Choice:");
    	
    	int ch = sc.nextInt();
    	
    	switch(ch) {
    	case 0: System.exit(0);
    	
    	case 1: 
    		System.out.println("// Add Mango: //");
    		if(counter < Basket.length) {
    			System.out.println("Enter Name:,Color:,Weight:");
    			Basket [counter++]= new Mango(sc.next(),sc.next(),sc.nextDouble());
    		}else 
    			System.out.println("Basket is FULL");
    		break;
    	case 2:
    		System.out.println(" //Add Orange:// ");
    		if(counter < Basket.length) {
    			System.out.println("Enter Name:,Color:,Weight:");
    			Basket [counter++]= new Orange(sc.next(),sc.next(),sc.nextDouble());
    		}else 
    			System.out.println("Basket is FULL");
    		break;
    	case 3:
    		System.out.println(" //Add Apple:// ");
    		if(counter < Basket.length) {
    			System.out.println("Enter Name:,Color:,Weight:");
    			Basket [counter++]= new Apple(sc.next(),sc.next(),sc.nextDouble());
    		}else 
    			System.out.println("Basket is FULL");
    		break;
    	case 4:
    		System.out.println("// Name of Fruits: //");
    		for(Fruits f : Basket) 
    			if(f!=null) 
    				System.out.println(f.getName());
    				break;
    	case 5:
    		System.out.println(" Details: ");
    		for(Fruits f : Basket)
    			if(f!=null && f.isFresh())
    			System.out.println(f+"Taste:"+f.taste());
    		    break;
    		 
    	case 6:	
    		System.out.println(" //Stale Marking// ");
    		System.out.println("Enter index to mark as a stale");
    		int index= sc.nextInt();
    		if(index >=0 && index < counter) {
    			Basket[index].setFresh(false);
    			System.out.println(index+"Marks as stale");
    		}
    		else
    			System.out.println(index+"Invalid Index");

    	case 7:
    		System.out.println("// Display List Stale Fruits Name & Taste// ");
    		for(Fruits f : Basket)
    			if(f!=null && !f.isFresh())
    				System.out.println(f.getName()+"Taste:"+f.taste());
    		break;
    		
    	default: System.out.println("Invalid choice");
    		
    	}
    	
    }
    
	}

}
