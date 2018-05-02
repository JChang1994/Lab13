package edu.handong.csee.java.lab13.prob4;

//Both Dog and Cat extends Animal meaning they can both use the Animal class's methods
public class Cat extends Animal implements Pet{
	//We specify the food method to differentiate the Cat food method from the Dog food method
	public String food() {
		return "(Cat!)Fish";
	}
}
