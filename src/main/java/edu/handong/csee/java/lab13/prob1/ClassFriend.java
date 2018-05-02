package edu.handong.csee.java.lab13.prob1;
//We have ClassFriend extend SchoolFriend so that we can differentiate ClassFriend, SchoolFriend, and Friend by their instances
public class ClassFriend extends SchoolFriend {
	//We use this object to print out that this object is a class friend
	public void classFriend() {
		System.out.println("Class Friend!");
	}
}
