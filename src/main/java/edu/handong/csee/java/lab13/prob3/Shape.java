package edu.handong.csee.java.lab13.prob3;

//We use the abstract class so that the classes that extend Shape are required to create the abstract methods
public abstract class Shape {
	//Any class that extends Shape will be required to define area() and perimeter() because they are abstract methods
	public abstract double area();
	public abstract double perimeter();
	
	//The display method will be used to display the results of area and perimeter
	public void display() {
		System.out.println("Area: " + area());
		System.out.println("Perimeter: " + perimeter());
	}
}
