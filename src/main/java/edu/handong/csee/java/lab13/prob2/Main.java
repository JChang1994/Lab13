package edu.handong.csee.java.lab13.prob2;

public class Main {
	public static void main(String[] args) 
	{
		//We create 4 new objects 1 of the Book 2 of the History and 1 of the Science
		Book book = new Book("Regular Book");
		History history1 = new History("History Book", "History Man");
		Science science = new Science("Science Book", "Science Publisher");
		History history2 = new History("Second History Book", "Abraham Rogers");
		//We then use the show method of each object to print out to the console each of the book's information
		book.show();
		history1.show();
		science.show();
		history2.show();
	}
}
