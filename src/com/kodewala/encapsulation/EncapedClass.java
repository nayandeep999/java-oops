package com.kodewala.encapsulation;

class Transaction {
	private int balance;
	private String accNum;

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public int getBalance() {
		return balance;
	}

	public void setBlance(int balance) {
		if (balance > 0) {
			this.balance = balance;
		}
	}

} // giving controlled access to the private fields
// Encapsulation is a way to secure the data, giving them controlled access to them
// Encapsulation is a way to bind the data together

public class EncapedClass {

	public static void main(String[] args) {
		Transaction tx = new Transaction();
		tx.setAccNum("001");
		tx.setBlance(100000000);

		System.out.println("Acc num: " + tx.getAccNum() + " Balance: " + tx.getBalance());
	}
}
