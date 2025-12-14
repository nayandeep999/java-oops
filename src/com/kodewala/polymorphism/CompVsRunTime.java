package com.kodewala.polymorphism;

class Netbanking {

	public void doNetbanking() {
		System.out.println("Parent - Netbanking");
	}
}

class AxisNetbanking extends Netbanking {

	@Override // annotation for compiler to implement overriding rules
	public void doNetbanking() {
		System.out.println("Child - AxixNetbanking");
	}
}

public class CompVsRunTime {

	public static void main(String[] args) {

		AxisNetbanking axnb = new AxisNetbanking();
		axnb.doNetbanking(); // Compile time -> it will check if doNetbanking available in AxisNetbanking or
								// not, If not it gives compile time error
								// Runtime -> It will call the method on actual object(AxisNetbanking())

		Netbanking nb = new AxisNetbanking();
		nb.doNetbanking(); // Compile time -> it will check if doNetbanking available in Netbanking
							// (Super class/Parent class) or not If not it gives compile time error
							// Runtime -> it will call the method on actual Object(AxisNetbanking)
							// References changes from super class in compile time b/c compiler doesn't
							// any object is created or not b/c object creation happens on runtime
							// to reference pointing to actual object created inside the heap

	}

	// Whatever you can access depends on the reference type not the object type
	// Meaning while a parent class is referencing an object of child class
	// compiler just checks if the method that the object is calling is present
	// on the parent class (reference type or not) because child have access to all
	// the fields and methods of the parent class (during compile time)
	// Netbanking nb = new AxisNetbanking();
	// nb.doNetbanking();

}
