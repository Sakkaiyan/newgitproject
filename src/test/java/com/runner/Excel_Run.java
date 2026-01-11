package com.runner;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.ReadExcelData;

public class Excel_Run {
	
	public static void main(String[] args) throws AWTException
	{
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://youtube.com/");
	
	String search = ReadExcelData.getParticularCellData(5, 0);
	
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(search);
	driver.findElement(By.xpath("//button[@title='Search']")).click();
}
}



