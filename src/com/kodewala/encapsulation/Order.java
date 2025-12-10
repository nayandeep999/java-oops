package com.kodewala.encapsulation;

class A {
	void print() {
		System.out.println("This is from class a");
	}
};

public class Order {

	public static void main(String[] args) {
		A a = new A();
		a.print();
	}

}
