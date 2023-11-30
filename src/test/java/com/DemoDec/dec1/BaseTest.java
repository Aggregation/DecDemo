package com.DemoDec.dec1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseTest {

	public WebDriver driver;
	
	
	@Test
	public void s4test()
	{
		String bros = System.getProperty("browser");
		String urrl = System.getProperty("url");
		
		System.out.println(bros);
		System.out.println(urrl);
		
		if(bros.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if(bros.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(bros.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		
		driver.get(urrl);
		
		
	}
}
