package com.kodewala.inheritance;

class Parent {
	static {
		System.out.println("Parent static");
	}

	Parent() {
		System.out.println("Parent constructor");
	}
}

class Child extends Parent {
	static {
		System.out.println("Child static");
	}

	Child() {
		System.out.println("Child constructor");
	}
}

public class StaticBlockInMultiLvlInheritance { // Multi-Level Inheritance

	public static void main(String[] args) {
		System.out.println("---- First object ----");
		Child c1 = new Child();

		System.out.println("---- Second object ----");
		Child c2 = new Child();
		// static block will run only once per class load not per object
		// no matter how many times we create object
	}

}

/*-
 * Explanation:
 * 1. Class loading happens first, when JVM loads the class into Metaspace.
 *    - Static blocks and static variables are initialized here.
 *    - This happens ONLY ONCE per class per ClassLoader, no matter how many objects are created.
 *
 * 2. Constructor runs every time a new object is created.
 *    - Parent constructors are called first (top-down) to initialize inherited instance fields.
 *    - Each object gets its own copy of instance fields in the heap.
 *
 * 3. Summary:
 *    - Static = class-level, runs once, shared across all objects.
 *    - Constructor = object-level, runs every time, initializes the specific object.
 */
