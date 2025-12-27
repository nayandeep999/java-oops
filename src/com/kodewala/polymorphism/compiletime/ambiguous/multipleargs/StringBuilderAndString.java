package com.kodewala.polymorphism.compiletime.ambiguous.multipleargs;

public class StringBuilderAndString {

	public static void show(String str) {
		System.out.println("String");
	}

	public static void show(StringBuilder sb) {
		System.out.println("StringBuilder");
	}

	public static void show(String str, StringBuilder sb) {
		System.out.println("String & String Builder");
	}

	public static void show(StringBuilder sb, String str) {
		System.out.println("String Builder & String");
	}

	public static void main(String[] args) {

		// StringBuilderAndString.show(null); // compiler error -> null is specific to
		// both because they
		// belong to same inheritance hierarchy level
		// String extends Object & StringBuilder extends Object

		StringBuilderAndString.show(new StringBuilder()); // compiler find the exact match
		StringBuilderAndString.show("hello"); // finds a exact match
		StringBuilderAndString.show(new String()); // again finds a exact match
		StringBuilderAndString.show("hello", null); // String & String Builder
		// StringBuilderAndString.show(null, null); // compiler error -> both methods
		// are most specific

	}
}
