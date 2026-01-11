package com.testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {

	@BeforeSuite
    private void propertySetting()
    {
		System.out.println("PROPERTY SETTING");
    }
	
	@BeforeTest
	private void browserlaunch()
	{
		System.out.println("BROWSER LAUNCH");
	}
	
	@BeforeClass
	private void getUrl()
	{
		System.out.println("URL LAUNCH");
	}
	
	@BeforeMethod
	private void login()
	{
		System.out.println("LOGIN");
	}
	
	@Test
	private void userName()
	{
		System.out.println("USERNAME");
	}
	
    @Test
    private void passWord()
    {
	System.out.println("PASSWORD");
    }

    @Test
    private void submit()
    {
	System.out.println("SUBMIT");
    }
   
    @Test
    private void forgotPassword()
    {
    	System.out.println("FORGOTPASSWORD");
    }
    
    @AfterMethod
    private void logout()
    {
    	System.out.println("LOGOUT");
    }
    
    @AfterClass
    private void screenShot()
    {
    	System.out.println("SCREEN SHOT");
    }
    
    @AfterTest
    private void browserClose()
    {
    	System.out.println("BROWSER CLOSE");
    }
    
    @AfterSuite
    private void terminateBrowser()
    {
    	System.out.println("TERMINATE BROWSER");
    }

    
    
    
    
    
    
    
    
    
    
    
}

