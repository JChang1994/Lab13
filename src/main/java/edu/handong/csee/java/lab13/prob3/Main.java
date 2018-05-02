package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		double n1, n2;
		
		System.out.print("Enter radius: ");
		n1 = keyboard.nextDouble();
		Circle circle1 = new Circle(n1);
		System.out.println("Radius: " + circle1.getRadius());
		circle1.display();
		
		System.out.print("Enter length and width: ");
		n1 = keyboard.nextDouble();
		n2 = keyboard.nextDouble();
		Rectangle rect1 = new Rectangle(n1, n2);
		System.out.println("Length: " + rect1.getLength());
		System.out.println("Width: " + rect1.getWidth());
		rect1.display();
	}
}
