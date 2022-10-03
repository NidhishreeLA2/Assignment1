//Diamond problem occurs when class tries to extend to two different classes with same method names
// gets confused which method to refer to
//class A extends B,C not possible in java
//solved using interface

// In method overriding, the previous method is overriden by the new method
// thus clearing the confusions.

// In method overloading, the method name is same but the parameters given are
//different thus no confusion occurs while calling the method


package com;

public class Book {
	String name() {
		return "I am Book";
	}
	int solve(int a,int b) {
		return a+b;
	}
	int solve(int a,int b,int c) {
		return a+b+c;                     //overloading
	}
	

}

class Book1 extends Book{
	String name() {
		return "I am Book1"; //overriding
	}
	
	
}

//class can extend to two interfaces
class person implements Int1,Int2{

	@Override
	public String drink() {
		// TODO Auto-generated method stub
		return Int1.super.drink();
	}
	
}
