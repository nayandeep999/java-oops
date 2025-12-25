package com.kodewala.constructors.singleton;

class SyncType {

	private SyncType() {
		System.out.println("SyncType - Instance Created");
	}

	private static SyncType sync;

	public static synchronized SyncType getInstance() { // its good for multi-thread but its slow due to synchronize
														// overhead

		if (sync == null) {
			sync = new SyncType();
		}

		return sync;
	}
}

public class Synchronized {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> SyncType.getInstance());
		Thread t2 = new Thread(() -> SyncType.getInstance());

		t1.start();
		t2.start();
		// SyncType - Instance Created
		// Only Once Instance Created
	}

}
