package com.testNg;

import org.testng.annotations.Test;

public class Grouping {
	
	
	@Test (groups = "CAR")
	private void ford ()
	{
		System.out.println("FORD");
	}
	@Test (groups = "CAR")
    private void toyato ()
	{
		System.out.println("TOYATO");
	}

	@Test (groups = "CAR")
    private void honda ()
	{
		System.out.println("HONDA");
	}

	
	@Test (groups = "BIKE")
    private void yamaha()
	{
		System.out.println("YAMAHA");
	}	
	@Test(groups = "BIKE")
	private void bajaj()
	{
		System.out.println("BAJAJ");
	}
	@Test(groups = "BIKE")
	private void hero()
	{
		System.out.println("HERO");
	}
	
	
	
	@Test(groups = "MOBILE")
	private void samsung()
	{
		System.out.println("SAMSUNG");
	}
	@Test (groups = "MOBILE")
	private void vivo()
	{
		System.out.println("VIVO");
	}
	@Test (groups = "MOBILE")
	private void iphone()
	{
		System.out.println("IPHONE");
	}
	
}
    