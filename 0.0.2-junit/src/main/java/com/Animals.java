//4. Apply abstract class concept and create 4 concrete classes for abstract class 
//with 2 methods for each abstract class.

package com;

public abstract class Animals {
	abstract String Active();
	abstract String type();
	abstract int DangerLevel();
	public int legs() {
		return 4;
	}

}

class Lion extends Animals{

	@Override
	String Active() {
		// TODO Auto-generated method stub
		return "Active";
	}

	@Override
	String type() {
		// TODO Auto-generated method stub
		return "Carnivores";
	}

	@Override
	int DangerLevel() {
		// TODO Auto-generated method stub
		return 10;
	}
	
	String food() {
		return "flesh";
	}
	
}

class deer extends Animals{

	@Override
	String Active() {
		// TODO Auto-generated method stub
		return "Active";
	}

	@Override
	String type() {
		// TODO Auto-generated method stub
		return "Herbivores";
	}

	@Override
	int DangerLevel() {
		// TODO Auto-generated method stub
		return 5;
	}
	
	String speed() {
		return "fast";
	}
	
}

class elephant extends Animals{

	@Override
	String Active() {
		// TODO Auto-generated method stub
		return "less active";
	}

	@Override
	String type() {
		// TODO Auto-generated method stub
		return "Herbivores";
	}

	@Override
	int DangerLevel() {
		// TODO Auto-generated method stub
		return 6;
	}
	
	String size() {
		return "big";
	}
	
}

class Tiger extends Animals{

	@Override
	String Active() {
		// TODO Auto-generated method stub
		return "Active";
	}

	@Override
	String type() {
		// TODO Auto-generated method stub
		return "Carnivores";
	}

	@Override
	int DangerLevel() {
		// TODO Auto-generated method stub
		return 9;
	}
	
	String sound() {
		return "Roar";
	}
	
}