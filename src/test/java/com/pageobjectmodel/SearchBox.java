package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.SerachBoxInterfaceElement;

public class SearchBox extends Base_Class implements SerachBoxInterfaceElement {

	@FindBy(partialLinkText = sony_partialLinkText)
	private WebElement sony;

	@FindBy(partialLinkText = addtoCart_partialLinkText)
	private WebElement addtoCar;

	public SearchBox() {
		PageFactory.initElements(driver, this);
	}

	public void searchProduct() {

		// explicitWait(addtoCar,"visibilityof",20);
		clickElement(sony);
		implicitWait(30);
		// explicitWait(Macbook,"visibilityof",20);
		// clickElement(Macbook);
		// explicitWait(addtoCar,"visibilityof",20);
		clickElement(addtoCar);
		getAlertText();
		simpleAlert();

	}
}
