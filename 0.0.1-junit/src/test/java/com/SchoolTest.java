package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class SchoolTest {
	
	@Test
	
	public void SchoolStudent(){
		Student s = new Student();
		String v = s.name();
		assertEquals("Tvagg",v);
		
	}

}
