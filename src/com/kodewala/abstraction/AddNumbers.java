package com.kodewala.abstraction;

class Sum {
	private int sum(int a, int b) { // hiding the core implementation or logic
		System.out.println(a + b);
		return (a + b);
	}

	public void addNumbers(int a, int b) {
		System.out.println("Adding numbers: " + a + " + " + b);
		sum(a, b);
	}

}

public class AddNumbers {

	public static void main(String[] args) {
		Sum add = new Sum();
		add.addNumbers(100, 100); // can only access the addNumbers() method
	}

}
