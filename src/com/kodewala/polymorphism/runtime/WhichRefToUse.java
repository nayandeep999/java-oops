package com.kodewala.polymorphism.runtime;

class Parentx {
	void show() {
		System.out.println("Parent");
	}
}

class Childx extends Parentx {
	@Override
	void show() {
		System.out.println("Child");
	}

	void childOnly() {
		System.out.println("Child only");
	}
}

public class WhichRefToUse {

	public static void main(String[] args) {

		Parentx p = new Childx();
		p.show(); // ✅ Calls overridden Child.show()
		/// p.childOnly(); // ❌ Compile-time error //reference does not have this method

		// Pros: ✅ Polymor-phism, flexible, can swap implementations at runtime
		// Cons: ❌ Cannot access child-only methods

		Childx c = new Childx();
		c.show(); // ✅ Calls overridden Child.show()
		c.childOnly(); // ✅ Works, can access child-only methods

		// Pros: ✅ Access to everything
		// Cons: ❌ No runtime substitution (not poly-morphic)

		// ----------------------------------------------------------------------------------------

		/// If you need to call child-only methods → use Child reference
		/// If you only need poly-morphic behavior (overridden methods) → use Parent
		/// reference

		// 💡 Rule of thumb:

		/// Parent reference → general, flexible, preferred in real-world design
		/// Child reference → when you must use child-specific functionality

		// Parent p = new Child();
		// p.show(); // Calls Child.show()
		// ((Child)p).childOnly(); // Cast to Child to access child-specific methods

	}
}
