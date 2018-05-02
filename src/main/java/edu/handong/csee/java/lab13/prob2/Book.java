package edu.handong.csee.java.lab13.prob2;

public class Book {
	//We will save the information of the Book inside of these variables
	private static int idCount = 0;
	private String bookName;
	private int id;
	//We use this constructor to pass the name of the book as a parameter, but we also use it to make sure that
	//every time a new book is made we increase the idCount and save it to the newly created Book's id
	public Book(String name) {
		this.bookName = name;
		idCount++;
		this.id = idCount;
	}
	
	//We use this method to turn the book's information into a string
	public String toString() {
		return "\n\t Id: " + id + "\n\t Book Name: " + bookName;
	}
	//We use this method to organize the book's information and print it out into the console.
	public void show(){
		System.out.println("<<<Book>>>" + this.toString());	
	}
}
