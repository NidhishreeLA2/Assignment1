package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class BookTest {
	@Test
	public void check() {
		Book b = new Book1();
		
		String b1 = b.name();
		int b12 = b.solve(2,3,8);
		int b13 = b.solve(2,3);
		assertEquals("I am Book1",b1);
		assertEquals(13,b12);
		assertEquals(5,b13);
	}

}
