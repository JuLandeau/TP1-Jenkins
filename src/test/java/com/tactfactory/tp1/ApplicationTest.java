/*******************************************************************************
 * copyright
 ******************************************************************************/
package com.tactfactory.tp1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ApplicationTest {

	@Before
	public void setup() {
		System.out.println("Before");
	}

	@After
	public void testDown() {
		System.out.println("After");
	}

	@Test
	public void testAdd() {
		int i = 2, j = 3;
		int result = Application.add(i, j);
		Assert.assertEquals("Add not good", result, 5);
		System.out.println("Equals");
	}
}
