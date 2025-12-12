package com.kodewala.polymorphism;

class Child extends Parent {

}

public class Parent {

	public static void main(String[] args) {
		Parent p1 = (Parent) new Child(); // super class can refer child class object b/c of implicit up-casting
											// it happens automatically

		Child c1 = (Child) new Parent(); // its called down-casting which is explicit & manual, child
											// can refer parent class object
	}

}
