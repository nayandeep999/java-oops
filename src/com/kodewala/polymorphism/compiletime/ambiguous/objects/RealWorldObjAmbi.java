package com.kodewala.polymorphism.compiletime.ambiguous.objects;

class Animal {

}

class Dog extends Animal {

}

public class RealWorldObjAmbi {

//	public static void show(String str) {
//		System.out.println("Animal");
//	} 
	// Ambiguous error, as both String and Animal belongs to same hierarchy level
	// String extends Object & Animal also extends Object

	public static void show(Animal a) {
		System.out.println("Animal");
	}

	public static void show(Dog a) {
		System.out.println("Dog");
	}

	public static void main(String[] args) {
		RealWorldObjAmbi.show(null);
		// since null will always look for more specific method in the inheritance
		// hierarchy
		// it will print Dog

		RealWorldObjAmbi.show(new Animal()); // Compiler looks for a method that accepts the exact arguement's type.
		// Animal

		RealWorldObjAmbi.show(new Dog()); // Dog
	}

}
