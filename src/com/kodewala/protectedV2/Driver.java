package com.kodewala.protectedV2;

public class Driver implements Cloneable {
	public static void main(String[] args) {
		GrandChild gc = new GrandChild();
		// gc.protectedMethod(); // The method protectedMethod() from the type Parent is
		// not visible
		// Protected = inheritance-only access OR same package
		// since protectedMethod() is present inside protectedV1 package
		// And you are trying to call this inside protectedV2 package
		// & Its out of the Grandchild scope -> It will not work
		// just overwrite protectedMethod() and inside body call super.protectedMethod()
		// Done now you can call

		gc.protectedMethod();

		// Protected is like default PLUS subclass access across packages

		Driver d1 = new Driver();
		try {
			d1.clone();
			// You can access clone and call it because this class call clone on its
			// own object not other class object
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		String s1 = "hello";
		// String s2 = s1.clone(); // you can't call clone on String object even though
		// String class implicitly extends Object class.
		// Only Driver can call clone() on its own object
		// Not on any other object
	}
}
