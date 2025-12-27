package com.kodewala.polymorphism.compiletime.ambiguous.multipleargs;

public class AmbiInMultipleArgs {

	public static void show(String str, Object obj) {
		System.out.println(str + " " + obj);
	}

	public static void show(Object obj, String str) {
		System.out.println(obj + " " + str);
	}

	public static void main(String[] args) {

		// AmbiInMultipleArgs.show(null, null); // compiler error: 1st argument is more
		// specific to first method
		// 2nd argument is more specific to second method

		AmbiInMultipleArgs.show(new Object(), new String()); // compiles as 2nd method is more specific
		AmbiInMultipleArgs.show(new Object(), null); // compiles as 2nd method is more specific

		// AmbiInMultipleArgs.show(null, "hi"); // compiler error: 1st argument is more
		// specific to first method
		// 2nd argument is more specific to second method

		// AmbiInMultipleArgs.show("hi", "hi"); // compiler error: again 2 arguments
		// specific to 2
		// different methods

	}

}
