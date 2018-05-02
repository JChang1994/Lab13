package edu.handong.csee.java.lab13.prob2;
//Science extends the Book class so it has access to its methods
public class Science extends Book {
	//publisher is a variable specific to a Science book so we keep it in the Science class
	private String publisher;
	
	//We use this constructor to add onto Book's constructor by also accepting the string Publisher as a parameter
	public Science(String name, String Publisher) {
		//This will cause Science to also use Book's constructor which means that the Id count and id will be saved
		//as well as the name without redefining it here in this constructor
		super(name);
		//We save the publisher here because no other type of book will use publisher
		this.publisher = Publisher;
	}
	//We use this method to organize information as a string by using super.toString() we use Book's toString() method
	//Which we then add onto by adding the publisher information.
	public String toString() {
		return super.toString() + "\n\t Publisher: " + publisher;
	}
	//We use this method to organize the book's information and print it out into the console.
	public void show(){
		System.out.println("<<<Science>>>" + this.toString());
		
	}
}