package com.kodewala.abstraction;

abstract class Notifications {
	abstract public void send();
}

class EmailNotification extends Notifications {

	@Override
	public void send() {
		System.out.println("EmailNotification.send()");

	}

}

class SMSNotifications extends Notifications {
	@Override
	public void send() {
		System.out.println("SMSNotifications.send()");

	}
}

public class AbstractPolymorphism {

	public static void main(String[] args) {

		Notifications n = new EmailNotification();
		n.send();

		n = new SMSNotifications();

		n.send();

	}

}
