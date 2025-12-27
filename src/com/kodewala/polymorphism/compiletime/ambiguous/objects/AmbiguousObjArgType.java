package com.kodewala.polymorphism.compiletime.ambiguous.objects;

public class AmbiguousObjArgType {

	public static void show(Object obj) {
		System.out.println("Object");
	}

	public static void show(String str) {
		System.out.println("String");
	}

	public static void main(String[] args) {

		AmbiguousObjArgType.show(null); // Since null is a value that can only be assigned to objects
		// Since null is more specific to String as it the closest in the inheritance
		// hierarchy

	}

}
