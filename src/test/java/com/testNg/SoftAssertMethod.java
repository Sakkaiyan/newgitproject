package com.testNg;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.testng.annotations.Test;


public class SoftAssertMethod {
	@Test
	private void softAssort()
	{
		String actual = "saankarthi";
		String ecpected = "saankarthi";
		Assert.assertEquals(actual, ecpected);
		System.out.println("VALIDATION DONE");		
	}
}
