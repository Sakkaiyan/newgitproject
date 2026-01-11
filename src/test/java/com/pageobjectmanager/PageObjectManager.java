
package com.pageobjectmanager;

import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.AddToCart;
import com.pageobjectmodel.AddressPage;
import com.pageobjectmodel.SearchBox;
import com.utility.FileReaderManager;
import com.utility.ReadExcelData;

public class PageObjectManager {
	
	private LoginPage loginPage;
	private FileReaderManager fileReader;
	private static PageObjectManager pageObjectManager;
	private SearchBox searchBox;
	private AddressPage productStore;
	private ReadExcelData readExcelData;
	private AddToCart addToCart;
	
	
	public AddToCart getAddToCart() {
		if(addToCart == null)
			addToCart = new AddToCart();
		return addToCart;
	}



	public ReadExcelData getExcelData()
	{
		if(readExcelData==null) {
			readExcelData=new ReadExcelData();
		}
		return readExcelData ;
	}
	
	public LoginPage getloginpage()
	{
		if(loginPage == null) {
			loginPage = new LoginPage();
		}
		return loginPage;
	}
	public FileReaderManager getFileReader()
	{
		if(fileReader== null) {
			fileReader = new FileReaderManager();
		}
		return fileReader;
	}
	public static PageObjectManager getpageObject()
	{
		if(pageObjectManager==null)
		{
			pageObjectManager= new PageObjectManager();
		}
		return pageObjectManager; 
	}

	public SearchBox getSearchBox() {
		if(searchBox == null) {
			searchBox = new SearchBox();
		}
		return searchBox;
	}





	public AddressPage getProduct()
		{
			if(productStore==null) {
				productStore = new AddressPage();
			}
			return productStore ;

	}
}

