package com.kodewala.polymorphism.compiletime.ambiguous.primitives;

public class PrimitivesAmbi {

	public static void show(int i) {
		System.out.println("int");
	}

	public static void show(long i) {
		System.out.println("long");
	}

	public static void show(Integer i) {
		System.out.println("Integer");
	}

	public static void show(int... i) {
		System.out.println("int...");
	}

	public static void show(byte i) {
		System.out.println("byte");
	}

	public static void show(short i) {
		System.out.println("short");
	}

	public static void main(String[] args) {
		show(10); // First priority -> int , as its the exact match
		// Second Priority -> long, due to widening
		// Thrid Priority -> Integer wrapper class, due to boxing
		// Fourth & last priority -> int... , due to varargs

		System.out.println("-------------------------");

		// Calling specific methods
		show(10l); // long -> adding L would cast int to long
		show((byte) 10); // byte
		show((short) 10); // short
		show((Integer) 10); // Integer
		show(10, 20); // int... -> varargs
		show(new int[] { 10 }); // int...
	}

}
