//polymorphism
package com;

public class School {
	String name() {
		return "XYZ School";
	}

}

class Student extends School{
	String name() {
		return "Tvagg";
	}
}