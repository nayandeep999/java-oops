package com.kodewala.polymorphism.runtime;

class Language {
	private String type;
	private String name;

	Language(String _type, String _name) {
		this.type = _type;
		this.name = _name;
	}

	public boolean equals(Object obj) {
		Language l = (Language) obj; // downcast the reference and store it in a down-casted variable
		return this.type.equals(l.type) || this.name.equals(l.name); // since type field is string therefore it uses the
		// equal method present in String class
		// l1.type = "High-level" -> High-level.equals(High-level) ->
		// string.equals(string)
	}
}

public class OverrideEqualsMethod {

	public static void main(String[] args) {
		Language l1 = new Language("High-level", "Python");
		Language l2 = new Language("High-level", "Java");

		System.out.println(l1.equals(l2));
	}

}
