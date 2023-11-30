package com.DemoDec.dec1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample5Test {
	
	
	@Test
	public void m1Test()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		System.out.println("Done success");
	}

}
