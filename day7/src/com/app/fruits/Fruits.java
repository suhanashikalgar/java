package com.app.fruits;

public class Fruits {
 private String name;
 private String color;
 private double weight;
 private boolean isFresh;
 

 public Fruits(String name ,String color ,double weight){
	 this.name=name;
	 this.color=color;
	 this.weight=weight;
	 this.isFresh=true;
	 	 
 }
 
 public String getName() {
	 return name;
 }
 
 public String getColor() {
	 return color;

 }
 public double getWeight() {
	 return weight;
 }
 public boolean isFresh() {
	 return isFresh;
 }
 public void setFresh(boolean fresh) {
	 isFresh=fresh;
 }
 
 public String taste()
 {
	 return  "fruit taste";
 }
 
 @Override
 public String toString() {
	 return "Name: "+name+", Color: "+color+ ", Weight: "+weight+", ";
 }
 
}

 
 