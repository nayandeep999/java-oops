package com.kodewala.constructors.singleton;

class Lazy {

	private Lazy() {
		System.out.println("Lazy - Instance Created");
	}

	private static Lazy lz;

	public static Lazy getInstance() { // its good for single thread but if multiple thread calls this function at the
										// same time we will get two instance of this class
		if (lz == null) {
			lz = new Lazy();
		}

		return lz;
	}
}

public class LazyType {

	public static void main(String[] args) {
		Lazy l1 = Lazy.getInstance();
		Lazy l2 = Lazy.getInstance();
	}

}
