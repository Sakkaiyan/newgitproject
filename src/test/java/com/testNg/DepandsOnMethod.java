package com.testNg;

import org.testng.annotations.Test;

public class DepandsOnMethod {
	
	@Test
	private void loginPage()
	{
		System.out.println("LOGIN PAGE");
	}
	
	@Test (dependsOnMethods= {"addtoCard","loginPage"})
    private void serachBox()
	{
		System.out.println("SEARCHBOX");
	}
	
	@Test (expectedExceptions = ArithmeticException.class)
    private void addtoCard()
	{
		int i = 2;
		System.out.println(i/0);
		System.out.println("ADDTOCARD");
	}



}
