package edu.handong.csee.java.lab13.prob2;

public class History extends Book {
	private String author;
	
	public History(String name, String Author) {
		super(name);
		this.author = Author;
	}
	
	public String toString() {
		return super.toString() + "\n\t Author: " + author;
	}
	
	public void show(){
		System.out.println("<<<History>>>" + this.toString());
		
	}
}