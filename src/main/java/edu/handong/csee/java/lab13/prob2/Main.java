package edu.handong.csee.java.lab13.prob2;

public class Main {
	public static void main(String[] args) 
	{
		Book book = new Book("Regular Book");
		History history1 = new History("History Book", "History Man");
		Science science = new Science("Science Book", "Science Publisher");
		History history2 = new History("Second History Book", "Abraham Rogers");
		
		book.show();
		history1.show();
		science.show();
		history2.show();
	}
}
