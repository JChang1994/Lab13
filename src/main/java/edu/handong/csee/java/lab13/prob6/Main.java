package edu.handong.csee.java.lab13.prob6;

public class Main {
	public static void main(String args[]) {
		//We use these lines to create new UpPoints and DownPoints that we will use Printer to print
		UpPoint p1 = new UpPoint(3,3);
		DownPoint p2 = new DownPoint(2,5);
		DownPoint p3 = new DownPoint(4,7);
		UpPoint p4 = new UpPoint(9,12);
		
		//Printer will take the different UpPoints and DownPoints and call the print() method which
		//will print out a capitalized version of the string if the parameter is an instance of UpPoint
		//and print out a lower case version if it not.
		Printer.print(p1);
		Printer.print(p2);
		Printer.print(p3);
		Printer.print(p4);
	}
}
