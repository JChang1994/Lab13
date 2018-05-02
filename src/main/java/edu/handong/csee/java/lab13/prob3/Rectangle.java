package edu.handong.csee.java.lab13.prob3;
//Rectangle extends Shape so it has access to display, but it is required to define area and perimeter.
public class Rectangle extends Shape{
	//We will save the length and width into these variables.
	private double length;
	private double width;
	//We use this constructor so that we can accept the parameters of length and width and save them.
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	//area returns an area of a rectangle
	public double area() {
		return length * width;
	}
	//perimeter returns the perimeter of a rectangle
	public double perimeter() {
		return (length * 2) + (width * 2);
	}
	//getLength and getWidth are used to get the length and width respectively.
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
}
