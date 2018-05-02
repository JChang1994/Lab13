package edu.handong.csee.java.lab13.prob4;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		//We will save the cat's name and dog's name in the variables and
		//we use keyboard as a Scanner so that we can accept user input.
		Scanner keyboard = new Scanner(System.in);
		String catName, dogName;
		
		//We create a new Master, Cat, and Dog so that we can interact with the objects and use them
		//to print out what the Master feed's the Dog and Cat
		Master master = new Master();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		//We prompt the user to input the cat's name and then the dog's name and save them into catName and dogName respectively
		System.out.print("Enter the cat name and dog name: ");
		catName = keyboard.next();
		dogName = keyboard.next();
		
		//We use this block of code to set the cat's name and then get it to show on the console and then we feed the cat using master.feed(cat)
		//Which will print out what the cat is fed.
		cat.setName(catName);
		cat.getName();
		master.feed(cat);
		
		//We use this block of code to set the dog's name and then get it to show on the console and then we feed the dog using master.feed(dog)
		//Which will print out what the dog is fed.
		dog.setName(dogName);
		dog.getName();
		master.feed(dog);
	}
}
