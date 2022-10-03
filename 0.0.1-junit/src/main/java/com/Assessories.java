//Abstraction concept
package com;

public abstract class Assessories {
	abstract int books();
	abstract int pens();

}

class Student1 extends Assessories{

	@Override
	int books() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	int pens() {
		// TODO Auto-generated method stub
		return 1;
	}
	
}

class Student2 extends Assessories{

	@Override
	int books() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	int pens() {
		// TODO Auto-generated method stub
		return 3;
	}
	
}


