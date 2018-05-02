package edu.handong.csee.java.lab13.prob1;

public class InstanceOf {
	//We use the whatFriend to determine what kind of friend the variable friend is.
	//We can do this because ClassFriend extends SchoolFriend which extends Friend which means that all three are
	//a Friend object but can be differentiated through their instances.
	public static void whatFriend(Friend friend) {
		//If the friend object that is passed down is an instance of ClassFriend we know to call classFriend() to print out
		//that the friend is a Class Friend
		if(friend instanceof ClassFriend) {
			((ClassFriend) friend).classFriend();
		}
		//If the friend object that is passed down is an instance of SchoolFriend we know to call schoolFriend() to print out
		//that the friend is a School Friend
		else if(friend instanceof SchoolFriend) {
			((SchoolFriend) friend).schoolFriend();
		}
		//Otherwise the friend is just a Friend.
		else
			friend.justFriend();
	}
}
