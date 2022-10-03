package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class AssessoriesTest {
	@Test
	public void getthings() {
		Student1 s1 = new Student1();
		Student2 s2 = new Student2();
		int v1 = s1.books();
		int v2 = s2.pens();
		assertEquals(2,v1);
		assertEquals(3,v2);
	}

}
