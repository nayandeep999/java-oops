package com.kodewala.abstraction;

abstract class Vehicle {
	Vehicle() {
		System.out.println("vehicle craeted");
	}

	abstract public void move();
}

public class Car extends Vehicle {

	Car() {
		System.out.println("car cons..");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Vehicle car = new Car();
	}

}
