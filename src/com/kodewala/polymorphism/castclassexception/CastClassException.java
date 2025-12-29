package com.kodewala.polymorphism.castclassexception;

class A {

	public void methodFromA() {
		System.out.println("A.methodFromA()");
	}

}

class B extends A {

	public void methodFromB() {
		System.out.println("B.methodFromB()");
	}

}

public class CastClassException { // You are casting a obj to some other object which it doesn't have access to

	public static void main(String[] args) {
		A b1 = new B();
		b1.methodFromA();
		// b1.methodFromB() since we are referencing A, we can't call child methods

		B b2 = (B) b1; // since reference of b1 was A, we need to downcast to access method in B ->
		// methodFromB(), We can do this because the object b1 has the access of class B

		b2.methodFromB();
		b2.methodFromA(); // B can also access methods from B due to inheritance

		A a1 = new A();
		// B b3 = (B) a1; //you can't do this because you are reducing the access of
		// object A to B
		// since A don't have access to B you can't really do this

		// B b3 = (B) new A(); -> You can't do this too again trying to cast object
		// which it does have access

	}

}
