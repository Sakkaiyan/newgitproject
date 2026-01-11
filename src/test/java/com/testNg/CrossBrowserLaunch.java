package com.testNg;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.base.Base_Class;

public class CrossBrowserLaunch extends Base_Class {
	
	@Test
	private void chromeBrowser()
	{
		browserlaunch("Chrome");
		getUrl("https://www.youtube.com/");
		System.out.println("BROWSER :"+ Thread.currentThread().getId());
		terminateBrowser();
    }
	
    @Test
	private void operaMini()
	{
		browserlaunch("operabrowser");
		getUrl("https://www.youtube.com/");
		System.out.println("BROWSER :"+ Thread.currentThread().getId());
		terminateBrowser();
    }
	
    @Test
	private void edgeBrowser()
	{
		browserlaunch("Edge");
		getUrl("https://www.youtube.com/");
		System.out.println("BROWSER :"+ Thread.currentThread().getId());
		terminateBrowser();
		
	}


	
	
}
