package com.kodewala.polymorphism.runtime;

public class DBAccessLayer {

	public void connect() {
		System.out.println("DBAccessLayer.connect()");
	}

	public static void connectToDB(DBAccessLayer db) {
		db.connect();
	}

	public static void main(String[] args) {
		DBAccessLayer mySQL = new MySQL();
		DBAccessLayer postgress = new Postgress();

		connectToDB(mySQL);
		connectToDB(postgress);

		// Runtime Polymorphism:
		// Parent class reference (DBAccessLayer) is pointing to different child objects
		// (MySQL, Postgress).
		// At compile time, method call is resolved using reference type,
		// but at runtime JVM decides which overridden connect() method to execute
		// based on the actual object type.

	}
}

class MySQL extends DBAccessLayer {
	@Override
	public void connect() {
		System.out.println("MySQL.connect()");
	}
}

class Postgress extends DBAccessLayer {
	@Override
	public void connect() {
		System.out.println("Postgress.connect()");
	}
}
