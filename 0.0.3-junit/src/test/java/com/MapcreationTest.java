package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class MapcreationTest {
	@Test
	
	public void getit() {
		Mapcreation m = new Mapcreation();
		
		assertEquals("Name1",m.Map());
	}

}
