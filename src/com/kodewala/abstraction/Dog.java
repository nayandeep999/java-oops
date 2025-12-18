package com.kodewala.abstraction;

abstract class Animal {
	abstract public void makeSound();

	public void sleep() {
		System.out.println("sleeppp");
	}
}

public class Dog extends Animal {

	@Override
	public void makeSound() {
		System.out.println("dog make sound....");

	}

	public static void main(String[] args) {
		Dog dg = new Dog();
		dg.makeSound();
		dg.sleep();
	}
}
