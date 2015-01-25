package com.example.youngjae.app;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

/**
 * Created by Youngjae on 2015-01-25.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	public MainActivityTest(){
		super(MainActivity.class);
	}

	public void testHelloString(){
		Activity activity = getActivity();
		TextView tvHello = (TextView)activity.findViewById(android.R.id.text1);
		assertEquals(activity.getText(R.string.hello_world), tvHello.getText().toString());
	}

}
