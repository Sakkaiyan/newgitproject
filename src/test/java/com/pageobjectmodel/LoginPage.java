package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.LoginPageInterfaceElements;
import com.pageobjectmanager.PageObjectManager;

public class LoginPage  extends Base_Class implements LoginPageInterfaceElements{
	 
     @FindBy(xpath=login_xpath)
     private WebElement login;
     
    
  @FindBy(id=getName_id)
    private WebElement username;
    
   @FindBy(id=getPassword_id)
   private WebElement password;
   
   @FindBy(xpath=singIn_xpath)
   private WebElement signin;
   
   @FindBy (id = user_id)
   private WebElement user;
     
    public LoginPage(){
    	PageFactory.initElements(driver,this);
    }
 public void validlogin() {
	 implicitWait(20);
        clickElement(login);
        explicitWait(username, "visibilityof", 20);
        inputPass(username,PageObjectManager.getpageObject().getFileReader().getDataProperty("username"));
        explicitWait(password, "visibilityof", 20);
	    inputPass(password,PageObjectManager.getpageObject().getFileReader().getDataProperty("password"));
	    clickElement(signin);
        explicitWait(user, "visibilityof", 20);

	   fetchText(user);

	    
	    
	    
	  
    

	    
 }
 
  
}


    
    
    


