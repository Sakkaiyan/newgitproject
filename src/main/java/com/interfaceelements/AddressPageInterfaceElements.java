package com.interfaceelements;

public interface AddressPageInterfaceElements {
	
	String name_xpath="//input[@id='name']";
	String country_xpath="//input[@id='country']";
	String  city_xpath = "//input[@id='city']";
	String cardNum_xpath="//input[@id='card']";
	String month_xpath="//input[@id='month']";
	String year_xpath=" //input[@id='year']";
	String purchase_xpath= "//button[text()='Purchase']";
    String ok_xpath = "//button[text()='OK']";
	
	String box_xpath = "//p[contains(@class,'lead text')]";
	
	String message_xpath = "//h2[contains(text(),'Thank you')]";
	
	String logout_partialLinkText = "Log out";

}
