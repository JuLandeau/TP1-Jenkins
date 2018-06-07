/*******************************************************************************
 * copyright
 ******************************************************************************/
package com.tactfactory.tp1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test of my main application.
 * @author Julien
 *
 */
public class ApplicationTest {

	@Before
	public void setup() {
	}

	@After
	public void testDown() {
	}

	@Test
	public void testAdd() {
		int i = 2, j = 3;
		int result = Application.add(i, j);
		Assert.assertEquals("Add not good", result, 5);
	}
}
