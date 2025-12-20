package com.kodewala.abstraction;

public class PaymentProcessor {

	// 1. PRIVATE: Hides the blueprint from other developers.
	// 2. STATIC: Allows us to use this without a PaymentProcessor object.
	// 3. ABSTRACT: Defines the 'template' but leaves details to subclasses.

	// Since you can't really create a object of abstract class just make it static
	// static inner class doesn't have references to the outer class
	// non static classes have references to the outer class
	// so that they can access the non static fields and methods of outer class
	private static abstract class Gateway {
		// Template Method
		public final void executePayment(double amount) {
			connect();
			authenticate();
			transfer(amount);
			System.out.println("Payment finalized.\n");
		}

		protected abstract void connect();

		protected abstract void authenticate();

		protected abstract void transfer(double amount);
	}

	// Concrete implementation - Hidden inside the class
	private class PayPal extends Gateway {
		@Override
		protected void connect() {
			System.out.println("Connecting to PayPal...");
		}

		@Override
		protected void authenticate() {
			System.out.println("Checking PayPal Token...");
		}

		@Override
		protected void transfer(double amount) {
			System.out.println("Transferring $" + amount + " via PayPal");
		}
	}

	// Concrete implementation - Also hidden
	private class Stripe extends Gateway {
		@Override
		protected void connect() {
			System.out.println("Connecting to Stripe API...");
		}

		@Override
		protected void authenticate() {
			System.out.println("Validating Stripe Secret Key...");
		}

		@Override
		protected void transfer(double amount) {
			System.out.println("Charging $" + amount + " to Credit Card");
		}
	}

	// PUBLIC API: The only way for the outside world to interact
	public void process(String provider, double amount) {
		Gateway gateway;
		if (provider.equalsIgnoreCase("paypal")) {
			gateway = new PayPal();
		} else {
			gateway = new Stripe();
		}

		// Polymorphism works perfectly here because we are INSIDE the outer class
		gateway.executePayment(amount);
	}

	public static void main(String[] args) {
		// The user doesn't need to know about 'Gateway', 'PayPal', or 'Stripe' classes.
		PaymentProcessor engine = new PaymentProcessor();

		// Now you call the instance method
		engine.process("paypal", 150.00);
		engine.process("stripe", 299.99);
	}
}
