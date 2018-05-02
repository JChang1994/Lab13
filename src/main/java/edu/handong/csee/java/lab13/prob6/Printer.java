package edu.handong.csee.java.lab13.prob6;

public class Printer {
	public static void print (Object object) {
		//This line changes the object that is passed down as a parameter to a string by using the defined toString
		//method inside of both UpPoint and DownPoint
		String str = object.toString();
		
		//If the object is an instance of CapitalPrint then we will capitalize the string that we just made
		if(object instanceof CapitalPrint)
				str = str.toUpperCase();
		//This will print out the string that we have created
		System.out.println(str);
	}
}
