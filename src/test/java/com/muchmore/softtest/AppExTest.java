package com.muchmore.softtest;

import java.io.IOException;

import org.junit.Test;

public class AppExTest {
	@Test
	public void testSortPrice() throws IOException{
		AppEx app = new AppEx();
		app.readFile("C://Users//ty//Desktop//data0.csv"); // Unsorted
		app.sortPrice();
	}

}
