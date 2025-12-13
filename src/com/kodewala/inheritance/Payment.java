package com.kodewala.inheritance;

//Child classes with constructors accepting parameters
class CreditCard extends Payment {
	CreditCard(String paymentType, int amount, String destAccNum) {
		super(paymentType, amount, destAccNum);
	}
}

class NetBanking extends Payment {
	NetBanking(String paymentType, int amount, String destAccNum) {
		super(paymentType, amount, destAccNum);
	}
}

class UPI extends Payment {
	UPI(String paymentType, int amount, String destAccNum) {
		super(paymentType, amount, destAccNum);
	}
}

// Parent class
public class Payment {

	private String paymentType;
	private int amount;
	private String destAccNum;

	// Parameterized constructor
	public Payment(String paymentType, int amount, String destAccNum) {
		this.paymentType = paymentType;
		this.amount = amount;
		this.destAccNum = destAccNum;
		processPayment();
	}

	public String getPaymentType() {
		return paymentType;
	}

	public int getAmount() {
		return amount;
	}

	public String getDestAccNum() {
		return destAccNum;
	}

	void processPayment() {
		System.out.println(
				"Payment type: " + paymentType + ", Amount: " + amount + ", Destination Account: " + destAccNum);
	}

	public static void main(String[] args) {
		CreditCard cc = new CreditCard("CreditCard", 1000, "002");
		NetBanking nb = new NetBanking("NetBanking", 1000, "001");
		UPI upi = new UPI("UPI", 1000, "003");

		// Private fields of a parent class are inherited by child objects (each child
		// object has its own copy),
		// but they cannot be accessed directly in the child. They can only be accessed
		// or modified
		// via the parent’s public/protected methods or constructors.

	}
}
