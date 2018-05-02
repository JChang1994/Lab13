package edu.handong.csee.java.lab13.prob4;

public class Animal {
	//We record the animal's name in this variable
	private String name;
	//We use this method to set the Animal's name
	public void setName(String name) {
		this.name = name;
	}
	//We use this method to get the Animal's name
	public void getName() {
		System.out.println("Name: " + name);
	}
}
