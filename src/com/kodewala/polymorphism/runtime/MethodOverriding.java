package com.kodewala.polymorphism.runtime;

class Child extends Parent {

	@Override // annotation
	public void print() {
		System.out.println("print() from child class");
	}

	public void methodFromChild() {
		System.out.println("This is method from child");
	}

}

class Parent {

	public void methodFromParent() {
		System.out.println("This is the method from parent");
	}

	public void print() {
		System.out.println("print() from parent class"); // everything same but body can be different
	}

}

public class MethodOverriding { // Runtime poly-morphism | Dynamic method dispatch

	public static void main(String[] args) {
		Parent c1 = (Parent) new Child(); // super class can refer child class object b/c of implicit up-casting
											// it happens automatically

		Child c2 = (Child) new Parent(); // its called down-casting which is explicit & manual, child
											// can refer parent class object

		c1.methodFromParent(); // child can access this method defined in parent
		c1.print(); // child can access everything from parent but can override the implementation
					// if child doesn't like
		// which method to call determines during the runtime using dynamic method
		// dispatch simply means actual call depends upon the type of object

		// so during compile time compiler time doesn't know which method is getting
		// called

		/// Although the same overridden behavior can be achieved using
		/// Child c1 = new Child(), it is not recommended because it tightly
		/// couples the code to a concrete implementation and prevents
		/// substituting other child implementations at runtime.
		/// Create object reference based on what you want to call on that object

		/// Use parent/interface reference when behavior may vary at runtime.
		/// Use concrete class when implementation is fixed and specific methods are
		/// needed.

		// c1.methodFromChild(); //reference type doesn't have this method
	}

}
