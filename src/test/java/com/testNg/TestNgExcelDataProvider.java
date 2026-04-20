package com.testNg;

import java.time.Duration;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgExcelDataProvider<WebDriver> {
	// private Object ExcelUtility;
	@DataProvider(name = "excelDataProvider")
	public Object[][] dataProviderMethod() {
		String filePath = System.getProperty("user.dir") + "\\excel\\TestData.xlsx";
		String sheetName = "data";
		return ExcelUtility.getExcelData(filePath, sheetName);
	}

	@Test(dataProvider = "excelDataProvider")
	public void testLogin(String username, String password) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		System.out.println("Username : " + username + " | Password : " + password);
	}

}
