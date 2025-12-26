package com.kodewala.polymorphism.runtime.staticmethodhiding;

class Parent {
	public static void stupidStaticMethod() {
		System.out.println("Parent.stupidStaticMethod()");
	}

	public void nonStaticMethod() {
		System.out.println("Parent.nonStaticMethod()");
	}
}

class Child extends Parent {

	// Method Overriding -> Static Method Hiding , We can still access both the
	// static methods based on reference type
	public static void stupidStaticMethod() {
		System.out.println("Child.stupidStaticMethod()");
	}

	@Override
	public void nonStaticMethod() {
		System.out.println("Child.nonStaticMethod()");
	}
}

public class StaticMethodHiding {

	public static void main(String[] args) {

		Parent p = new Child(); // static method belongs to reference type, we can still access parents static
		p.stupidStaticMethod(); // method

		Child c = new Child(); // Its method hiding, because parents static method is hidden
		c.stupidStaticMethod(); // & we can still access the parents static method

		System.out.println("---------------------------------");

		p.nonStaticMethod(); // no way child can access the original non static method in parent class
		c.nonStaticMethod(); // its completely replaced my the overridden method

	}

}
