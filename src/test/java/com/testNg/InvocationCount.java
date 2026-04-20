package com.testNg;

import org.testng.annotations.Test;

import com.base.Base_Class;
import com.pageobjectmanager.PageObjectManager;

public class InvocationCount extends Base_Class {
	
	@Test (invocationCount = 8)
	private void count()
	{
		browserlaunch(PageObjectManager.getpageObject().getFileReader().getDataProperty("browser"));
		getUrl(PageObjectManager.getpageObject().getFileReader().getDataProperty("url"));
	}
	

}
