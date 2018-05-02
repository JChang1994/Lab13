package edu.handong.csee.java.lab13.prob4;

//Both Dog and Cat extends Animal meaning they can both use the Animal class's methods
public class Dog extends Animal implements Pet{
	//We specify the Dog food method to differentiate from the Cat food method
	public String food(){
		return "(Dog!)Sausage";
	}
}
