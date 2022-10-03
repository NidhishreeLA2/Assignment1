package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class BirdsTest {
	
	@Test
	public void Pelican1() {
		Pelican p = new Pelican();
		Pelican1 p1 =new Pelican1();
		Pelican2 p2 =new Pelican2();
		String s = p.sound();
		int s2 = p.wings();
		String s3 = p1.color();
		int s4 = p2.weight();
		assertEquals("keek keek",s);
		assertEquals(2,s2);
		assertEquals("blue",s3);
		assertEquals(100,s4);
		
	}

}
