package com.kodewala.polymorphism.runtime;

public class ProcessPayment {

	public static void processPayment(CoreBanking cb) {

		cb.doFundTransfer(); // at compile-time refer the reference type -> CoreBanking
		// but at run-time refer the actual object type (whatever object you pass here
		// -> nb,upi & cc

	}

	public static void main(String[] args) {

		CoreBanking nb = new NetBanking(); // at compile-time refer the reference type -> CoreBanking
		CoreBanking upi = new UPI();
		CoreBanking cc = new CreditCard();

		processPayment(nb);
		processPayment(upi);
		processPayment(cc);

	}
}
