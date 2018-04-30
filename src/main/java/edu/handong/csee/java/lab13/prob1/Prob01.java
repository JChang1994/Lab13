package edu.handong.csee.java.lab13.prob1;

public class Prob01 {
	public static void main(String[] args) {
		Friend friend1 = new Friend();
		SchoolFriend friend2 = new SchoolFriend();
		ClassFriend friend3 = new ClassFriend();
		
		InstanceOf.whatFriend(friend1);
		InstanceOf.whatFriend(friend2);
		InstanceOf.whatFriend(friend3);
	}
}
