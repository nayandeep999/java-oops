package com.kodewala.inheritance;

class Manager extends ImportantMultipleInheritance { // should be IS-A relationship

	public String pos2 = pos.concat(" world");

	public void pf() {
		System.out.println(pos2);

	}

}

public class ImportantMultipleInheritance {
	public String pos = "hello";

	public static void main(String[] args) {

		Manager mg = new Manager();
		mg.pf();

	}
}

// chat-gpt link - https://chatgpt.com/share/693baf88-81d4-8011-b331-831b933c4985

//Disadvantage of multi-level inheritance if have multiple child like 9 or 10
//1 loading all the classes (every-time you create a object will result in multiple copy inside heap)
// 2 if something change in your super class your child class will get impacted and it breaks

//Methods are NOT copied to child objects.
//All methods (parent, child, overridden, inherited) exist only once in Meta-space.
//Objects only store non-static fields, not methods.
//The child class only inherits access to these methods — it does not receive copies.
//When a method runs, a new stack frame is created in the Thread Stack for execution.

//Variables created inside methods are local variables.
//They are NOT inherited, NOT stored in the heap, and NOT copied to child objects.
//They live only in the method's stack frame during execution.

//When you create an object of a subclass, the single new object contains instances 
//of all the fields declared in that class and in each of its super-classes. 
//The JVM allocates one object whose memory layout includes the “parent parts” (the superclass fields).
//The superclass constructors are invoked to initialize those parent parts. 
//You do not get a separate, independent parent object in the heap.