package com.kodewala.polymorphism.compiletime.ambiguous.multipleargs;

public class IntLong {

	public static void show(int i, long l) {
		System.out.println("int: " + i + " long: " + l);
	}

	public static void show(long l, int i) {
		System.out.println("long: " + l + " int: " + i);
	}

	public static void main(String[] args) {
		// IntLong.show(10, 10); // compiler error: 1st args exact match to 1st method
		// 2nd args exact match to 2nd method

		IntLong.show(100, 100l); // finds exact match
	}

}
