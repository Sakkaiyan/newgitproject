package com.utility;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import org.junit.Assert;



public class FileReaderManager {
	private static FileInputStream fileInputStream;
	private static Properties property;
	public static void setupProperty()
	{
		File file = new File("C:\\Users\\Hp\\eclipse-workspace\\Maven_Project\\src\\main\\resources\\TestData.properties");
	try
	{
		fileInputStream = new FileInputStream(file);
		property = new Properties();
		property.load(fileInputStream);
	}
	catch(FileNotFoundException e)
	{
	       Assert.fail("ERROR : OCCUR DURING FILE LOADING");

	}
     catch(Exception e)
	{
	      Assert.fail("ERROR : OCCUR DURING FILE READING");
	}
	}
	public String getDataProperty(String value)
	{
		setupProperty();
		String data = property.getProperty(value);
		return data;
	}
	public  void main(String[] args)
	{
	System.out.println(getDataProperty("browser"));
    }
}


