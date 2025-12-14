package com.kodewala.polymorphism.runtime;

class Parentxx {
	void show() {
		System.out.println("Parent");
	}
}

class Child1 extends Parentxx {
	@Override
	void show() {
		System.out.println("Child1");
	}
}

class Child2 extends Parentxx {
	@Override
	void show() {
		System.out.println("Child2");
	}
}

public class advOfUsingParentRef {

	/// Polym-orphism exists when a parent (or interface) reference can point to
	/// multiple different child objects over time, allowing the same method call to
	/// behave differently at runtime.

	public static void main(String[] args) {
		Parentxx p; // parent reference, no object yet // LOOSE COUPLING
		// because this variable can now point to any child object

		p = new Child1(); // point to Child1
		p.show(); // Child1.show()

		p = new Child2(); // now point to Child2
		p.show(); // Child2.show()

		/*- ✅ Notice: same reference p points to different child objects at different times 
		✅ This is runtime poly-morphism in action */

		/// You can't do with child reference

		Child1 c1 = new Child1();
		c1.show(); // Child1.show() // TIGHTLY COUPLED because c1 is locked to Child1 type

		// c1 = new Child2(); // can't do this, comiple-time error
		// c1.show() // XXX
		// c1 is locked to Child1 type
		// Cannot point to Child2 because it’s not a sub-type of Child1
		// No runtime substitution → no poly-morphism

		/*- 
		 * Parent p
			+-----------------+
			| can hold Child1  |
			| can hold Child2  |
			| can hold Child3  |
			+------------------+
			
			The reference type is what determines what can be stored.
			The object type is what determines which method runs.
		 */
	}

}
