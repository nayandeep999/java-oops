package com.kodewala.abstraction;

abstract class Machine {
	public Machine() {
		start(); // call happens based on the objects type
		System.out.println("After start() method is called");
	}

	abstract void start();
}

class Printer extends Machine {
	@Override
	void start() {
		System.out.println("Printer.start()");

	}
}

public class ConstrctorAbsMethodCall {

	public static void main(String[] args) {

		Printer pr = new Printer();

	}

}
