package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EmployeeTest {
	@Test
	public void details() {
		Employee e = new Employee();
		int s = e.getSalary();
		int s2 = e.setSalary(3000);
		assertEquals(10000,s);
		assertEquals(13000,s2);
	}

}
