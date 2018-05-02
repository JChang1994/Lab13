package edu.handong.csee.java.lab13.prob1;

public class Prob01 {
	public static void main(String[] args) {
		//Here we create three different friends
		//Friend which is just a friend
		Friend friend1 = new Friend();
		//SchoolFriend which is a school friend
		SchoolFriend friend2 = new SchoolFriend();
		//Finally ClassFriend which is a class friend.
		ClassFriend friend3 = new ClassFriend();
		
		//We use InstanceOf.whatFriend to determine what instance of friend they are 
		//if they are an instance of a ClassFriend or SchoolFriend after determining
		//what friend they are it will print out to the console what kind of friend they are
		InstanceOf.whatFriend(friend1);
		InstanceOf.whatFriend(friend2);
		InstanceOf.whatFriend(friend3);
	}
}
