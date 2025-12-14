package com.kodewala.polymorphism.compiletime;

class Sum { // Method Overloading happens within the same class

	public double addNum(double a, int b) {
		System.out.println(a + b);
		return (a + b);
	}

//	public void addTwoNum(int a, double b) {
//		System.out.println(a + b); ambiguous
//	}

	public double addNum(double a, double b, int c) { // same return type
		System.out.println(a + b + c);
		return (a + b + c);
	}

	public void printArgs(String a, int b) {
		System.out.println(a + b);
	}

	public void printArgs(int a, String b) {
		System.out.println(a + b);
	}

	private void diffAccModifiers(String a) {
		System.out.println(a);
	}

	public void diffAccModifiers(String a, String b) {
		System.out.println(a);
	}

	static void staticOverload() {
		System.out.println("Sum.staticOverload()");
	}

	static void staticOverload(String a) {
		System.out.println("Sum.staticOverload() " + a);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Sum s1 = new Sum();
		// s1.addTwoNum(100, 100); //ambiguous due to widening

		s1.addNum(100, 100); // java determines which method to call based on number of parameters
		s1.addNum(100, 100, 100); // its call compile time / static polymer-phism

		// or Method Overloading - Multiple methods with same name in the same class
		// but different types, different parameters, order of parameters , return types
		// (can be same)

		s1.printArgs(0, "Hello");
		s1.printArgs("Hello", 0);

		// s1.diffAccModifiers("Private method"); //not visible even after creating
		// object

		s1.staticOverload();
		s1.staticOverload("Overloaded"); // static method overloading
	}

}
