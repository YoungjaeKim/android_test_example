package com.example.youngjae.app;

/**
 * Created by Youngjae on 2015-01-25.
 */

import junit.framework.TestCase;

public class BasicTest extends TestCase {
	public void testSimple() {
		Adder adder = new Adder();
		assertEquals(5, adder.add(2, 3));
	}
}
