package com.mycompany.codechallenge.util;


import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;


public class UtilityTest {
	
	@Test
	public void testRandomNumberPass() {
			
		int result = Utility.generateRandomNumber(10);
		assertThat(result, Matchers.lessThan(10));
	}
}
