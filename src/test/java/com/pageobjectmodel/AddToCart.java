package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.AddToCartInterfaceElements;

public  class AddToCart extends Base_Class implements AddToCartInterfaceElements {
	
	@FindBy(xpath =cart_xpath)
	private WebElement cart;
	
	@FindBy(xpath = placeOrder_xpath)
	private WebElement placeorder;
	
	
	public AddToCart() {
		PageFactory.initElements(driver, this);
	}
	
	public void addCart() {
		clickElement(cart);
		clickElement(placeorder);
		
	}

}
