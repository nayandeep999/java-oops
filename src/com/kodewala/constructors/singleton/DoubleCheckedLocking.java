package com.kodewala.constructors.singleton;

class DoubleChecked {

	private DoubleChecked() {

		System.out.println("DoubleChecked - Instance Created");

	}

	private static DoubleChecked dc;

	public static DoubleChecked getInstance() {
		// 1. First check: If instance exists, return it immediately without locking.
		// This improves performance by avoiding the overhead of synchronization.
		if (dc == null) {

			// 2. Synchronization: Ensure only one thread can enter the creation block.
			synchronized (DoubleChecked.class) {

				// 3. Second check: When T1 leaves and T2 enters, T2 must check again.
				// Without this second check, T2 would create a second instance, breaking the
				// Singleton rule.
				if (dc == null) {
					dc = new DoubleChecked();
				}
			}
		}
		return dc;
	}

}

public class DoubleCheckedLocking {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> DoubleChecked.getInstance());
		Thread t2 = new Thread(() -> DoubleChecked.getInstance());

		t1.start();
		t2.start();

	}

}
