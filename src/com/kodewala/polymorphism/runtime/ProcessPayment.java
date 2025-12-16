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

		processPayment(nb); // Parent type reference is pointing to multiple child objects overtime
		processPayment(upi);
		processPayment(cc);

		// if poly-morphism does not exist then i have to create multiple
		// processPayment() methods with different parameters of the child type
		// processPayment(NetBanking nb), processPayment(UPI upi),
		// processPayment(CreditCard cc)

		// based on the actual object type java calls the method, this decision is taken
		// during runtime

		// Access should be wider not more restrictive, because some class make it
		// private then jvm can't execute it

	}
}
