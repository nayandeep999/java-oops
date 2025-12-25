package com.kodewala.constructors.singleton;

class LazyFailure {

	private LazyFailure() {
		System.out.println("Lazy - Instance Created");
	}

	private static LazyFailure lz;

	public static LazyFailure getInstance() { // its good for single thread but if multiple thread calls this function
												// at the same time we will get two instance of this class
		if (lz == null) {
			lz = new LazyFailure();
		}

		return lz;
	}
}

public class LazyFailureMultiThread {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> LazyFailure.getInstance());
		Thread t2 = new Thread(() -> LazyFailure.getInstance());

		t1.start();
		t2.start();
		// Lazy - Instance Created
		// Lazy - Instance Created
		// Two Instance Created
	}

}
