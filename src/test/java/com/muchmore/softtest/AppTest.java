package com.muchmore.softtest;
import java.io.IOException;

import org.junit.Test;

import junit.framework.TestCase;

public class AppTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testGetPrice() throws IOException {
		App app = new App();
		app.readFile("C://Users//ty//Desktop//data0.csv");
		System.out.println("'data1.csv' is fully loaded!");

		assertEquals(app.getPrice(-1), 0);
		assertEquals(app.getPrice(0),  399900);
		assertEquals(app.getPrice(46), 239500);
		assertEquals(app.getPrice(47), 0);
	}
	
	@Test
	public void testSortPrice() throws IOException{
		App app = new App();
		app.readFile("C://Users//ty//Desktop//data0.csv"); // Unsorted
		app.sortPrice();
		
		App app2 = new App();
		app2.readFile("C://Users//ty//Desktop//data1.csv"); // Sorted
		
		for(int i = 0; i < 47; i++){
			assertEquals(app.getPrice(i), app2.getPrice(i));
		}
	}
	
	@Test
	public void testArrayMinMax() throws IOException{
		App app = new App();
		app.readFile("C://Users//ty//Desktop//data0.csv"); // Unsorted
		int[] prices = new int[47];
		for(int i = 0; i < 47; i++){
			prices[i] = app.getPrice(i);
		}
		assertEquals(app.arrayMinMax(prices)[0], 169900);
		assertEquals(app.arrayMinMax(prices)[1], 699900);
	}
	
}
