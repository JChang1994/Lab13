package edu.handong.csee.java.lab13.prob2;
//History extends Book so it has access to Book's methods
public class History extends Book {
	//author is a variable specific to a History book so we keep it in the History class
	private String author;
	
	//We use this constructor to add onto Book's constructor by also accepting the string Author as a parameter
	public History(String name, String Author) {
		//This will cause History to also use Book's constructor which means that the Id count and id will be saved
		//as well as the name without redefining it here in this constructor
		super(name);
		//We save the author here because no other type of book will use author
		this.author = Author;
	}
	//We use this method to organize information as a string by using super.toString() we use Book's toString() method
	//Which we then add onto by adding the author information.
	public String toString() {
		return super.toString() + "\n\t Author: " + author;
	}
	
	//We use this method to organize the book's information and print it out into the console.
	public void show(){
		System.out.println("<<<History>>>" + this.toString());
		
	}
}