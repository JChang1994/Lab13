package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double area() {
		return length * width;
	}
	
	public double perimeter() {
		return (length * 2) + (width * 2);
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
}
