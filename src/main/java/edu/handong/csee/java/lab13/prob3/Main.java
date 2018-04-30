package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		double x, y;
		
		System.out.print("Enter radius: ");
		x = keyboard.nextDouble();
		Circle circle1 = new Circle(x);
		System.out.println("Radius: " + circle1.getRadius());
		circle1.display();
		
		System.out.print("Enter length and width: ");
		x = keyboard.nextDouble();
		y = keyboard.nextDouble();
		Rectangle rect1 = new Rectangle(x, y);
		System.out.println("Length: " + rect1.getLength());
		System.out.println("Width: " + rect1.getWidth());
		rect1.display();
	}
}
