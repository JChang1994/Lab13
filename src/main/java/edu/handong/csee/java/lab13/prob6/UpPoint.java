package edu.handong.csee.java.lab13.prob6;

//We have UpPoint implement CapitalPrint so that we can use instanceof 
//to check whether the point should be capitalized or not
public class UpPoint implements CapitalPrint{
	//We use these variables to track the two points x and y
	private int x, y;
	
	//We use this constructor to accept the parameters and set them to the x and y variable
	UpPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//We use this method to format a string and return a string which includes the x and y
	public String toString()
	{
		return "x: " + x + " y: " + y;
	}
}
