package com.hms.hospice.GenericUtils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtils {
	
	/**
	 * This method is used to maximize the browser window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
	   driver.manage().window().maximize();
	}
	 
	 
	/**
	 * This method  is usd to minimize the browser window
	 * @param driver
	 */
	public void minimizeWindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	
	public void implicitylyWait(WebDriver driver,int sec)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	/**
	 * This method is used to wait until page load
	 * @param driver
	 * @param sec
	 */
	public void waitForPageLoad(WebDriver driver, int sec)
	{
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(sec));
	}
	
	
	/**
	 * This method is used to wait until element to be visible on the web page
	 */
	public void waitUntilElemetToBeVisble(WebDriver driver, WebElement element,int sec)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This method is used to wait until the element is clickable
	 * @param driver
	 * @param element
	 * @param sec
	 */
	public void waituntilEleToBeclickable(WebDriver driver, WebElement element, int sec)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void selectByIndexDD(WebElement element, int index)
	{
		Select selec=new Select(element);
		selec.selectByIndex(index);
	}
	
	public void selectByValueDD(WebElement element, String value)
	{
		Select selec=new Select(element);
		selec.selectByValue(value);
	}
	
	public void selectByVisibleTextDD(WebElement element,String text)
	{
		Select selec=new Select(element);
		selec.selectByVisibleText(text);
	}
	
	
    /**
     * This method will perform mouse hover action
     * @param driver
     * @param element
     */
	public void mouseover(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/**
	 * 
	 * @param driver
	 * @param src
	 * @param dst
	 */
	public void dragAndDrop(WebDriver driver,WebElement src, WebElement target)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}
	/**
	 * This method will double click on web page
	 * @param driver
	 */
	public void doubleClick(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.doubleClick().click().perform();
	}
	
	/**
	 * This method will double click on Web element
	 * @param driver
	 * @param element
	 */
	public void doubleClickOnElement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element).click().perform();
	}
	
	/**
	 * This method will right click on web page
	 * @param driver
	 */
	public void rightClickOnWebPage(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.contextClick().click().perform();
	}
	
	/**
	 * This method will right click on web Element
	 */
	public void doubleClickOnWebElement(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element);
	}
	
	
	/**
	 * This method is used to press Enter key
	 * @param driver
	 */
	public void enterKeyPress(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	
	/**
	 * This method is used to press Enter key By using ROBOT class
	 * @throws AWTException
	 */
	public void enterKeyPress() throws AWTException
	{
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	
	/**
	 * This method used to release key
	 * @throws AWTException
	 */
	public void enterKeyRelease() throws AWTException
	{
		Robot robot=new Robot();
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	/**
	 * This method is used to switch the driver control into frames
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	
	/**
	 * This method used to switch driver control into frames based on name or ID
	 * @param driver
	 * @param nameORid
	 */
	public void switchToframes(WebDriver driver,String nameORid)
	{
		driver.switchTo().frame(nameORid);
	}
	
	/**
	 * This method used to switch driver control into frames based on address of the element
	 * @param driver
	 * @param address
	 */
	public void switchToFrames(WebDriver driver, WebElement address)
	{
		driver.switchTo().frame(address);
	}
	
	/**
	 * this method is used to accept alert pop up
	 * @param driver
	 */
	public void alertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This method is used to dismiss alert pop up
	 * @param driver
	 */
	public void alertCancel(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public String alertgetText(WebDriver driver)
	{
		String text = driver.switchTo().alert().getText();
		return text;
	}
	
	public void switchToWindow(WebDriver driver,String partialWinTitle)
	{
		//step1: use getWindowHandles to capture all window ids
		Set<String> windows = driver.getWindowHandles();
		
		//step2: iterate thru the windows
		Iterator<String> iters = windows.iterator();
		
		//step3: check whether there is next window
		while(iters.hasNext())
		{
			//step4: capture current window id
			String wid=iters.next();
			
			//step5: switch to current window and capture title
			String currentWinTitle = driver.switchTo().window(wid).getTitle();
			
			
			//step6: check whether the current window is expected
			if(currentWinTitle.contains(partialWinTitle))
			{
				break;
			}
		}
	}
	
	/**
	 * This method will take screenshot and store it in folder called as Screenshot
	 * @return 
	 * @return 
	 * @throws Throwable 
	 */
	public static String getscreenshoot(WebDriver driver, String screenshotname) throws Throwable
	{
		JavaUtils ju=new JavaUtils();
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		String path="./screenshot/"+screenshotname+ju.readDateTime()+".png";
		File dst = new File(path);
		FileUtils.copyFile(src, dst);
		return path;
	}
	/**
	 * This method will perform random scroll
	 */
	public void scrollAction(WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("wndow.scrollBy(0,500)", "");
		
	}
	
	/**
	 * THis method will scroll untill the specified element is found
	 */
	
	public void scrollAction(WebDriver driver,WebElement element)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		int y = element.getLocation().getY();
		jse.executeScript("window.scrollBy(0,"+y+")", element);
		
		//js.executeScript("argument[0].scrollIntoView()",element);
	}
		
	
	
}
