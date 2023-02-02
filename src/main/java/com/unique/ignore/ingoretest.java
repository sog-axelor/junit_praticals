package com.unique.ignore;

import org.junit.Ignore;
import org.junit.Test;

public class ingoretest {
	
	@Ignore("Test is ignored as a demonstration")
	@Test
	public void testSame() {
		assertThat(x, is(3));
		assertThat(x, is(not(4)));
		assertThat(responseString, either(containsString("color")).or(containsString("colour")));
		assertThat(myList, hasItem("3"));
	}
	
}
