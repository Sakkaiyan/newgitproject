package com.base;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.FileHandler;

import org.junit.Assert;
import org.junit.platform.suite.api.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public abstract class Base_Class {
	
	   protected static WebDriver browserlaunch(String browserName) {
			try {
				if(browserName.equalsIgnoreCase("Chrome")) {
					driver = new ChromeDriver();
				}else if(browserName.equalsIgnoreCase("firefox")){
					driver = new FirefoxDriver();
				}else if(browserName.equalsIgnoreCase("Edge")) {
					driver = new EdgeDriver();
				}else if(browserName.equalsIgnoreCase("operabrowser")) {
							driver = new EdgeDriver();
						}
				driver.manage().window().maximize();
				
			} catch (Exception e) {
			Assert.fail("ERROR OCCURED : LAUNCH BROWSER");	
			}
			return driver;
		}
		
		protected static void getUrl(String url) {
			try {
				driver.get(url);
			} catch(Exception e)
			{
				System.out.println(e);
				Assert.fail("ERROR OCCURED : GET URL");
			}
		}
		
		protected static void inputPass(WebElement element, String input ) {
			try {
				element.sendKeys(input);
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : PASS INPUT");
			}
	
		}
		
		protected static void clickElement(WebElement element) {
			try {
				element.click();
			}catch(Exception e) {
	            Assert.fail("ERROR OCCURED : CLICK ELEMENT");
			}
		}
		
		protected static void terminateBrowser() {
			try {
				driver.quit();
			}catch(Exception e){
				Assert.fail("ERROR OCCURED : TERMINATE BROWSER");
			}
		}
		
		protected static void closeTab() {
			try {
				driver.close();
			}catch(Exception e){
				Assert.fail("ERROR OCCURED : CLOSE TAB");
			}
		}
		
		protected static void navigationTo(String url) {
			try {
				driver.navigate().to(url);
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : NAVIGATION TO");
			}
		}
		
		protected static void forward() {
			try {
				driver.navigate().forward();
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : FORWARD");
			}
		}
		
		protected static void backward() {
			try {
				driver.navigate().back();
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : BACKWARD");
			}
		}
		
		protected static void refresh() {
			try {
				driver.navigate().refresh();
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : REFRESH");
			}
		}
		
		protected static void selectDropDownOption(WebElement element, String type, String value) {
			try {
				Select select = new Select(element);
				if(type.equalsIgnoreCase("visibletext")) {
					select.selectByVisibleText(value);
				} 
				else if(type.equalsIgnoreCase("value")) {
					select.selectByValue(value);
				}
				else if(type.equalsIgnoreCase("index")) {
					select.selectByIndex(Integer.parseInt(value));
				}	                                                   
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : SELECT DROP DOWN OPTION");
			}
		}	
		
		protected static void deselectDropDownOption(WebElement element, String type, String value) {
			try {
				Select select = new Select(element);
				if(type.equalsIgnoreCase("visibletext")) {
					select.deselectByVisibleText(value);
				} 
				else if(type.equalsIgnoreCase("value")) {
					select.deselectByValue(value);
				}
				else if(type.equalsIgnoreCase("index")) {
					select.deselectByIndex(Integer.parseInt(value));
				}	
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : DESELECT DROP DOWN OPTION");
			}
		}
		
		protected static void checkMultiple(WebElement element) {
			try {
				Select select = new Select(element);
				boolean checkMultiple = select.isMultiple();
				System.out.println(checkMultiple);
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : CHECK MULTIPLE");
			}
		}
		
		protected static void firstSelectedOptions(WebElement element) {
			try {
				Select select = new Select(element);
				WebElement firstSelectedOption = select.getFirstSelectedOption();
				System.out.println(firstSelectedOption);
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : FIRST SELECTED OPTIONS");
			}
		}
		
		protected static void allSelectedOptions(WebElement element) {
			try {
				Select select = new Select(element);
				List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
				System.out.println(allSelectedOptions);
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : ALL SELECTED OPTIONS");
			}
		}
		
		protected static void fetchOptions(WebElement element) {
			try {
				Select select = new Select(element);
				List<WebElement> getOptions = select.getOptions();
				System.out.println(getOptions);
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : FETCH OPTIONS");
			}
		}
		
		protected static void fetchTitle() {
			try {
				String title = driver.getTitle();
				System.out.println(title);
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : FETCH TITLE");
			}
		}
		
		protected static void currentUrl() {
			try {
				String title = driver.getCurrentUrl();
				System.out.println(title);
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : CURRENT URL");
			}
		}
		
		protected static void statusOfElements(WebElement element, String type) {
			try {
				if(type.equalsIgnoreCase("selected")) {
					boolean selected = element.isSelected();
					System.out.println(selected);
				}
				else if(type.equalsIgnoreCase("enabled")) {
					boolean enabled = element.isEnabled();
					System.out.println(enabled);
				}
				else if(type.equalsIgnoreCase("displayed")) {
					boolean displayed = element.isDisplayed();
					System.out.println(displayed);
				}
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : STATUS OF ELEMENTS");
			}
		}
		
		protected static void simpleAlert() {
			try {
				Alert alert = driver.switchTo().alert();
				alert.accept();
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : SIMPLE ALERT");
			}
		}
		
		protected static void confirmAlert(String text) {
			try {
				Alert alert = driver.switchTo().alert();
				if(text.equalsIgnoreCase("accept")) {
					alert.accept();
				}
				else if(text.equalsIgnoreCase("dismiss")){
					alert.dismiss();
				}
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : CONFIRM ALERT");
			}
		}
		
		protected static void promptAlert(String value) {
			try {
				Alert alert = driver.switchTo().alert();
				alert.sendKeys(value);
				alert.accept();
				
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : PROMPT ALERT");
			}
		}
		
		protected static void getAlertText() {
    	    try {
    	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

    	        String alertText = alert.getText();
    	        System.out.println("Alert Text: " + alertText);

    	    } catch (Exception e) {
    	        Assert.fail("ERROR: OCCURED DURING GETTING ALERT TEXT");
    	    }
    	}
		protected static void fetchText(WebElement element) {
			try {
				String text = element.getText();
				System.out.println(text);
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : FETCH TEXT");
			}
		}
		
		protected static void mouseRightClickOnElement(WebElement element) {
			try {
				Actions act = new Actions(driver);
				act.contextClick(element).perform();
				
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : MOUSE RIGHT CLICK");
			}
		}
		
		protected static void mouseClickOnElement(WebElement element) {
			try {
				Actions act = new Actions(driver);
				act.click(element).perform();
				
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : MOUSE CLICK");
			}
		}
		
		protected static void mouseDoubleClickOnElement(WebElement element) {
			try {
				Actions act = new Actions(driver);
				act.doubleClick(element).perform();
				
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : MOUSE DOUBLE CLICK");
			}
		}
		
		protected static void mouseDragAndDrop(WebElement source, WebElement target) {
			try {
				Actions act = new Actions(driver);
				act.dragAndDrop(source, target).perform();
				
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : MOUSE DRAG AND DROP");
			}
		}
		
		protected static void mouseMove(WebElement element) {
			try {
				Actions act = new Actions(driver);
				act.moveToElement(element).perform();
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : MOVE TO ELEMENT");
			}
		}
		
		protected static void mouseClickAndHold(WebElement element) {
			try {
				Actions act = new Actions(driver);
				act.clickAndHold(element).perform();
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : CLICK AND HOLD");
			}
		}
		
		protected static void mouseRelease(WebElement element) {
			try {
				Actions act = new Actions(driver);
				act.release(element).perform();
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : MOUSE RELEASE");
			}
		}
		
		protected static void mouseScroll(WebElement element) {
			try {
				Actions act = new Actions(driver);
				act.scrollToElement(element).perform();
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : MOUSE SCROLL");
			}
		}
		
		protected static void implicitWait(long seconds) {
			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : IMPLICIT WAIT");
			}
		}
		
		protected static void explicitWait(WebElement element ,String input, long seconds) {
			try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
			if(input.equalsIgnoreCase("visibilityof")) {
				wait.until(ExpectedConditions.visibilityOf(element));
			}
			else if(input.equalsIgnoreCase("Invisibilityof")) {
				wait.until(ExpectedConditions.invisibilityOf(element));
			}
		
			else if(input.equalsIgnoreCase("ElementIsClickable")) {
				wait.until(ExpectedConditions.elementToBeClickable(element));
			
			}	
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : EXPLICIT WAIT");
			}
		}
		protected static void alertExplicitWait(long seconds) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
				wait.until(ExpectedConditions.alertIsPresent());
				
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : ALERT EXPLICIT WAIT");
			}
		}
		
		protected static void frameIndex(int index) {
			try {
				driver.switchTo().frame(index);
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : FRAME INDEX");
			}
		}
		
		protected static void frameIdOrName(String value) {
			try {
				driver.switchTo().frame(value);
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : FRAME ID OR NAME");
			}
		}
		
		protected static void frameByElement(WebElement element) {
			try {
				driver.switchTo().frame(element);
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : FRAME BY WEBELEMENT");
			}
		}
		
		protected static void parentFrame() {
			try {
				driver.switchTo().parentFrame();
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : PARENT FRAME");
			}
		}
		
		protected static void defaultFrame() {
			try {
				driver.switchTo().defaultContent();
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : DEFAULT CONTENT");
			}
		}
		
		protected static void windowHandle(int num) {
			try {
				List<String> allWindow = new ArrayList<>(driver.getWindowHandles());
				driver.switchTo().window(allWindow.get(num));
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : WINDOW HANDLING");
			}
		}
		
		protected static void clickByJS(WebElement element) {
			try {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", element);
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : CLICK BY JAVASCRIPT");
			}
		}
		
		protected static void scrollUp(int range) {
			try {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,-range)");
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : SCROLL UP");
			}
		}
		
		protected static void scrollDown(int range) {
			try {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,arguments[0]);",range);
			}catch(Exception e) {
				Assert.fail("ERROR OCCURED : SCROLL DOWN");
			}
		}
		
		protected static void scrollIntoView(WebElement element) {
			 try {
			        JavascriptExecutor js = (JavascriptExecutor) driver;
			        js.executeScript(
			            "arguments[0].scrollIntoView({behavior:'smooth', block:'center'});",
			            element
			        );
			        Thread.sleep(300); // allow UI repaint
			    } catch (Exception e) {
			        Assert.fail("ERROR: OCCURRED DURING SCROLL INTO VIEW JAVASCRIPT");
			    }
		}
		
		protected static void takeScreen(String filePath) {
	    	 try {
	             File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	             File destFile = new File(filePath);
	             FileHandler.copy(srcFile, destFile);

	         } catch (Exception e) {
	             Assert.fail("ERROR:OCCURED DURING SCREENSHOT");
	         }
		}
	    	 
	    protected static void validation(WebElement element, String expected)
	    {
	    	try {
	    		String text = element.getText();
	    		System.out.println(text);
	    Assert.assertEquals(element.getText(),expected);
	    		} catch (Exception e) {
				Assert.fail("ERROR : OCCUR DURING VALIDATATION");
			}
	    }
	    	
	    public String takeScreenShot() throws IOException{
	    	 
	    	try {
	    		
	    		TakesScreenshot screenshot = (TakesScreenshot) driver;
	    		String timeStamp = new SimpleDateFormat("yyyMMDD_HHmmss").format(new Date());
	    		File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
	    		File destfile = new File("ScreenShot\\.png" + "_" + timeStamp + ".png");
	    	    FileHandler.copy(scrfile, destfile);
	    	   return destfile.getAbsolutePath();
	           }
		        catch (Exception e) {
				Assert.fail("ERROR : OCCUR DURING TAKE SCREENSHOT");
			}
			return null;
	    
	    	
	    
	    }
		}
	 
	
	

	    
