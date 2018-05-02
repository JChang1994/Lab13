package edu.handong.csee.java.lab13.prob1;

//We have SchoolFriend extend Friend so that we can differentiate ClassFriend, SchoolFriend, and Friend by their instances
public class SchoolFriend extends Friend {
	//We use this object to print out that this object is a school friend.
	public void schoolFriend()
	{
		System.out.println("School Friend!");
	}
}
