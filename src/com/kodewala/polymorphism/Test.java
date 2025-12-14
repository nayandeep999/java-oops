package com.kodewala.polymorphism;

class Dog {
	void sound() {
		System.out.println("Dog barks");
	}
}

class Cat {
	void sound() {
		System.out.println("Cat meows");
	}
}

public class Test {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();

		Cat c = new Cat();
		c.sound();
	}
}
