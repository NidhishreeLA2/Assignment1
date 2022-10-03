// Inhertitance concept

package com;


public class Birds {
	int wings(){
		return 2;
		}

}
class Pelican extends Birds{
String sound(){
return "keek keek";
}}

// multilevel inheritance birds -> pelican -> pelican1
class Pelican1 extends Pelican{
	String color() {
		return "blue";
	}
}

//multiple inheritance through Interface
class Pelican2 implements Int,IntB{

	public String sing() {
		// TODO Auto-generated method stub
		return "koookoooo";
	}

	public int weight() {
		// TODO Auto-generated method stub
		return 100;
	}
}