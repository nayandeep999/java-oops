package com.kodewala.constructors.singleton;

class Eager {

	private Eager() {
		System.out.println("Eager - Instance Created"); // now you can't create Object of this class directly
	}

	static private Eager eg = new Eager();
	// Problem with this approach is, an instance of Eager class will be created
	// even without calling the getInstance() method which is not great &
	// unoptimized

	public static Eager getInstance() {
		return eg;
	}

}

public class EagerType {

	public static void main(String[] args) {

		Eager e1 = Eager.getInstance();
		Eager e2 = Eager.getInstance();
		// Eager - Instance Created -> Only prints once

	}

}
