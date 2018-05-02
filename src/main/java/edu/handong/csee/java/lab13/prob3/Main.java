package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		//n1 and n2 will be used to store the dimensions of the shapes
		//and the Scanner keyboard will be used to accept user input
		Scanner keyboard = new Scanner(System.in);
		double n1, n2;
		
		//This will prompt the user to input the radius of the circle.
		System.out.print("Enter radius: ");
		//Then we save it into n1
		n1 = keyboard.nextDouble();
		//Then we create a new Circle using n1 as the radius by passing it as a parameter
		Circle circle1 = new Circle(n1);
		//Then we print out the radius of the circle
		System.out.println("Radius: " + circle1.getRadius());
		//and finally we use display() to calculate and display the area and perimeter of the circle
		circle1.display();
		
		//This will prompt the user to input the length and width of the rectangle.
		System.out.print("Enter length and width: ");
		//Then we save these two values into n1 and n2
		n1 = keyboard.nextDouble();
		n2 = keyboard.nextDouble();
		//We then use the values to create a new rectangle using n1 and n2 as the length and width of the rectangle
		Rectangle rect1 = new Rectangle(n1, n2);
		//Then we print out the length and width of the rectangle
		System.out.println("Length: " + rect1.getLength());
		System.out.println("Width: " + rect1.getWidth());
		//Finally we use display() to calculate and display the area and perimeter of the circle.
		rect1.display();
	}
}
