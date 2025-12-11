package com.kodewala.inheritance;

class UPI extends Payment {

	UPI() {
		setAmount(1000);
		setDestAccNum("003");
		setPaymentType("CuPI");
		processPayment();

	}

}

class NetBanking extends Payment {

	NetBanking() {
		setAmount(1000);
		setDestAccNum("001");
		setPaymentType("NetBanking");
		processPayment();

	}

}

class CreditCard extends Payment {

	CreditCard() {
		setAmount(1000);
		setDestAccNum("002");
		setPaymentType("CreditCard");
		processPayment();

	}

}

public class Payment {

	private String paymentType;
	private int amount;
	private String destAccNum;

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDestAccNum() {
		return destAccNum;
	}

	public void setDestAccNum(String destAccNum) {
		this.destAccNum = destAccNum;
	}

	void processPayment() {
		System.out.println("Payment type is: " + paymentType + " Amount is: " + amount + " Destination Account num is: "
				+ destAccNum);
	}

	public static void main(String[] args) {

		CreditCard cc = new CreditCard();
		NetBanking nb = new NetBanking();
		UPI upi = new UPI();
	}

}
