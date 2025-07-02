package com.app.gometry;

public class Point2D {
	private double x;
	private double y;

	public Point2D(double x ,double y) {
		this.x=x;
		this.y=y;
		
	}
		public String getDetails() {
			return("Coordinates: ("+this.x+","+this.y+")"); 
					}
		
		public boolean isEqual(Point2D obj) {
			return this.x == obj.x&& this.y == obj.y;
			
		}
		
		public double calculateDistance(Point2D otherPoint) {
	        return Math.sqrt(Math.pow(this.x - otherPoint.x, 2) + Math.pow(this.y - otherPoint.y, 2));
	    }
		
}
