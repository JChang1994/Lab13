package edu.handong.csee.java.lab13.prob2;

public class Book {
	private static int idCount = 0;
	private String bookName;
	private int id;
	
	public Book(String name) {
		this.bookName = name;
		idCount++;
		this.id = idCount;
	}
	
	public String toString() {
		return "\n\t Id: " + id + "\n\t Book Name: " + bookName;
	}
	
	public void show(){
		System.out.println("<<<Book>>>" + this.toString());	
	}
}
