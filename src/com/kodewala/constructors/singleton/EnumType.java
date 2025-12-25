package com.kodewala.constructors.singleton;

import java.util.Arrays;

enum SingleInstance {
	// This is the single point of access. The JVM creates this only once.

	INSTANCE, SECOND_INSTANCE;
	// Constant object
	// it is effectively:
	// public static final SingleInstance INSTANCE = new SingleInstance();

	int i;

	// This method acts like a regular instance method.
	public void show() {
		System.out.println("The value of i: " + i);
	}
}

public class EnumType {
	public static void main(String[] args) {
		// Both obj1 and obj2 are references to the exact same object.
		SingleInstance obj1 = SingleInstance.INSTANCE;
		SingleInstance obj2 = SingleInstance.INSTANCE;

		obj1.i = 10;
		obj2.i = 11; // This overwrites the value for obj1 as well.

		obj1.show(); // Prints 11, proving it is a Singleton.

		System.out.println(Arrays.toString(SingleInstance.values())); // print all those constant objects inside enum
	}
}