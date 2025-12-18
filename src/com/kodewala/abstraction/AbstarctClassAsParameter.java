package com.kodewala.abstraction;

abstract class Payment {

	Payment() {
		System.out.println("Payment cons called");
	}

}

class UPI extends Payment {

	UPI() {
		System.out.println("UPI cons called");
	}

	void processPayment(Payment p) {
		System.out.println("UPI.processPayment()");
	}

}

class CardPayment extends Payment {
	void processPayment(Payment p) {
		System.out.println("CardPayment.processPayment()");
	}
}

public class AbstarctClassAsParameter {

	public static void main(String[] args) {
		// Payment upi = new UPI(); // Payment does not have processPayment()
		UPI upi = new UPI();
		upi.processPayment(upi); // can pass sub variant
	}

}
