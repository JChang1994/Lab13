package edu.handong.csee.java.lab13.prob3;
//Circle extends Shape so it has access to display, but it is required to define area and perimeter.
public class Circle extends Shape{
	//The radius will be saved in this variable
	private double radius;
	//We use this constructor so that we can accept radius as a parameter and save it into the radius variable
	public Circle(double radius) {
		this.radius = radius;
	}
	//perimeter() returns the perimeter of a circle
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	//area() returns the area of a circle
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	//getRadius() is used to get the radius of the circle.
	public double getRadius() {
		return radius;
	}
}
