package com.kodewala.constructors.sdppractice;

class Sync {

	private Sync() {
		System.out.println("Instance Created");
	}

	private static Sync sy;

	public static synchronized Sync getInstance() {
		if (sy == null) {
			sy = new Sync();
			return sy;
		}

		return sy;
	}
}

public class SynchronizeType {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> Sync.getInstance());
		Thread t2 = new Thread(() -> Sync.getInstance());

		t1.start();
		t2.start();
	}

}
