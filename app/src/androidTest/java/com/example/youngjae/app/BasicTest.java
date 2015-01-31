package com.example.youngjae.app;

/**
 * Created by Youngjae on 2015-01-25.
 */

import junit.framework.TestCase;
import org.json.JSONObject;

public class BasicTest extends TestCase {
	public void testAdder() {
		Adder adder = new Adder();
		assertEquals(5, adder.add(2, 3));
	}

	public void testJson(){
		JSONObject jsonObject = new JSONObject();
	}

}
