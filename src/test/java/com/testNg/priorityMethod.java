package com.testNg;

import org.testng.annotations.Test;

public class priorityMethod {
	
	@Test (priority = 2)
	private void loginPage()
	{
		System.out.println("LOGIN PAGE");
	}
	
	@Test(priority = -2)
    private void serachBox()
	{
		System.out.println("SEARCHBOX");
	}
	
	@Test(priority = 4)
    private void addtoCard()
	{
		System.out.println("ADDTOCARD");
	}


}
