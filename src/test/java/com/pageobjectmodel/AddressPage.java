package com.pageobjectmodel;



import com.base.Base_Class;
import com.interfaceelements.AddressPageInterfaceElements;
import com.pageobjectmanager.PageObjectManager;

public class AddressPage extends Base_Class implements AddressPageInterfaceElements {

	@FindBy(xpath = name_xpath)
	private WebElement name;
	@FindBy(xpath=country_xpath)
	private WebElement country;
	@FindBy(xpath=city_xpath)
	private WebElement city;
	@FindBy(xpath=cardNum_xpath)
	private WebElement cardNum;
	@FindBy(xpath=month_xpath)
	private WebElement month;
	@FindBy (xpath=year_xpath)
	private WebElement year;
	@FindBy(xpath =purchase_xpath)
	private WebElement purchase;
	@FindBy (xpath = ok_xpath)
	private WebElement ok;
	
	@FindBy(xpath = box_xpath)
	private WebElement leadtext;
	
	@FindBy(xpath = message_xpath)
	private WebElement Thankyou;
	
	@FindBy(partialLinkText = logout_partialLinkText)
	private WebElement logout;
	

	
	public AddressPage(){
    	PageFactory.initElements(driver,this);
	}
	public void addDetails() {
		implicitWait(20);
		//explicitWait(name,"visibilityof",20);
		inputPass(name,PageObjectManager.getpageObject().getFileReader().getDataProperty("name"));
		inputPass(country,PageObjectManager.getpageObject().getFileReader().getDataProperty("country"));
		inputPass(city,PageObjectManager.getpageObject().getFileReader().getDataProperty("city"));
		inputPass(cardNum,PageObjectManager.getpageObject().getFileReader().getDataProperty("cardNum"));
		inputPass(month,PageObjectManager.getpageObject().getFileReader().getDataProperty("month"));
		inputPass(year,PageObjectManager.getpageObject().getFileReader().getDataProperty("year"));
		clickElement(purchase);
		takeScreenshot("C:\\Users\\Hp\\eclipse-workspace\\Maven_Project\\Screenshot.png");
		fetchText(Thankyou);
		fetchText(leadtext);
		clickElement(ok);
		implicitWait(10);
		clickElement(logout);
			
		
		
	}
	

	

}
