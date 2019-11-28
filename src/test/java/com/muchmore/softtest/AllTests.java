package com.muchmore.softtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.JUnit4TestAdapter;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({ AppTest.class })
public class AllTests {
	public static TestSuite suite(){
		TestSuite suite = new TestSuite("All JUnit test");
		suite.addTest(new JUnit4TestAdapter(App.class));
		return suite;
	}

}
