package com.kodewala.constructors.sdppractice;

class Eager {

	private Eager() {
		System.out.println("Instance Created");
	}

	private static Eager eg = new Eager();

	public static Eager getInstance() {
		return eg;
	}
}

public class EagerType {

	public static void main(String[] args) {

		Eager e1 = Eager.getInstance();
		Eager e2 = Eager.getInstance();

	}

}
