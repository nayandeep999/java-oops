package com.kodewala.polymorphism;

class Dog {

	private void sound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Dog {
	// @Override
//	private void sound() { //private only visible inside the class 
//		System.out.println("Cat meows");
//	}
}

public class Test {
	public static void main(String[] args) {
		Dog d = new Dog();
		// d.sound();

		Cat c = new Cat();
		// c.sound();

		// can't override private methods
	}
}
