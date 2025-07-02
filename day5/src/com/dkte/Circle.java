package com.dkte;

public class Circle {
private double radius;
private final double PI=3.14;
{
	//PI=3.14  //can initialize  here also
}
public Circle(double radius) {
	this.radius=radius;
}
public Circle() {
	//pi=3.14  //can initialize  here also
}

public double getRadius() {
	return radius;
	
}

public void setRadius(double radius) {
	this.radius=radius;
}

public double getPI()
{
return PI;
}

public double calArea() {
	return PI* this.radius * this.radius;
}
public double calPeri() {
	return 2 * PI * this.radius;
}

}
