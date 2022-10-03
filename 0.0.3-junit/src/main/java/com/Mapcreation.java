package com;
import java.util.HashMap;

public class Mapcreation {
	public String Map(){ 
	HashMap<Integer,String> m = new HashMap<Integer,String>();
	
	m.put(123,"Name1");
	m.put(124,"Name2");
	m.put(126,"Name3");
	m.put(128,"Name4");
	//System.out.println(m.get(123));
	//System.out.println(m);
return m.get(123);
}
}