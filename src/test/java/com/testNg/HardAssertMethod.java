package com.testNg;

import org.junit.Assert;
import org.testng.annotations.Test;

public class HardAssertMethod {
	@Test
	private void softAssort()
	{
		String actual = "saankarthi";
		String ecpected = "saankarthi";
		Assert.assertEquals(actual, ecpected);
		System.out.println("VALIDATION DONE");		
	}

}
