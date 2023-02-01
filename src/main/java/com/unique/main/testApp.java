package com.unique.main;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.unique.test.MainApp;

public class testApp {
	 
	@Test
	public void testZero() {
		int expect  = 0;
		int generated = new MainApp().calsi(0, 7, 2);
		assertEquals("Zero value Test : ",expect, generated);
	}
}
	