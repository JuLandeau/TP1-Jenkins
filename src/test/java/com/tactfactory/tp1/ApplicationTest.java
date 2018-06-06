package com.tactfactory.tp1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

	@Test
	public void testAdd() {
		int i = 2, j = 3;
		int result = Application.add(i, j); 
		Assert.assertEquals("Add not good", result, 5);
	}
}
