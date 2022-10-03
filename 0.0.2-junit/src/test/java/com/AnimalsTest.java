package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class AnimalsTest {
	@Test
	public void Animal(){
		Lion l = new Lion();
		deer d = new deer();
		Tiger t = new Tiger();
		elephant e = new elephant();
		int l1 = l.DangerLevel();
		String d1 = d.type();
		String t1 = t.sound();
		int e1 = e.legs();
		assertEquals(10,l1);
		assertEquals("Herbivores",d1);
		assertEquals("Roar",t1);
		assertEquals(4,e1);
				
	}

}
