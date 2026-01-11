package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base_Class;
import com.pageobjectmanager.PageObjectManager;

public class Program_Run extends Base_Class{

public static void main(String[] args) throws InterruptedException {
	   browserlaunch(PageObjectManager.getpageObject().getFileReader().getDataProperty("browser"));
	   getUrl(PageObjectManager.getpageObject().getFileReader().getDataProperty("url"));
       PageObjectManager.getpageObject().getloginpage().validlogin();
       PageObjectManager.getpageObject().getSearchBox().searchProduct();
       PageObjectManager.getpageObject().getAddToCart().addCart();
      PageObjectManager.getpageObject().getProduct().addDetails();
      
       
        }
}


	


	





	
		
	
			
	


