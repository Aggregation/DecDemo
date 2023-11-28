package com.hms.hospice.GenericUtils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.objectRepository.AdminDashboardPage;
import com.objectRepository.AdminLoginPage;
import com.objectRepository.HomePage;


public class BaseClass {
	
	   public DatabaseUtils du=new DatabaseUtils();
	   public FileUtils fu=new FileUtils();
	   public ExcelUtils eu=new ExcelUtils();
	   public JavaUtils ju=new JavaUtils();
	   public WebdriverUtils wu=new WebdriverUtils();
	   
	   public WebDriver driver;
	   public static WebDriver sdriver;
	
	@BeforeSuite(alwaysRun = true)
	public void config_BS() throws Throwable
	{
		du.connectDB();
		System.out.println("-- connected to DB --");
	}
	
	
	@Parameters("BROWSER")
	@BeforeClass(alwaysRun = true)
	public void congig_BC(String BROWSER) throws Throwable
	//public void congig_BC() throws Throwable
	{
		//String BROWSER = fu.readDataFromPropertyFile("browser");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			 driver=new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("--Invalid Browser--");
		}
		
		sdriver=driver;
		wu.maximizeWindow(driver);
		
		
		System.out.println("--Lanunch Browser--");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void config_BM() throws Throwable
	{
		String URL = fu.readDataFromPropertyFile("url");
		String AUN=fu.readDataFromPropertyFile("AdminUsername");
		String APWD = fu.readDataFromPropertyFile("AdminPassword");
		Thread.sleep(2000);
		driver.get(URL);
		
		wu.waitForPageLoad(driver, 5);
		
		HomePage home=new HomePage(driver);
		home.adminlinkClick();
		AdminLoginPage adminloginP=new AdminLoginPage(driver);
		adminloginP.adminlogin(AUN, APWD);
		
		System.out.println("--Login application---");		
	}
	
	@AfterMethod(alwaysRun = true)
	public void config_AM()
	{
		AdminDashboardPage adminDash=new AdminDashboardPage(driver);
		adminDash.getProfileDD().click();
		adminDash.getLogout_link().click();
		
		System.out.println("--logout application--");
	}
	
	@AfterClass(alwaysRun = true)
	
	public void config_AC()
	{
		driver.quit();
		System.out.println("--close Browser--");
	}
	
	@AfterSuite(alwaysRun = true)
	public void config_AS() throws Throwable
	{
		
		du.disconnectDB();
		System.out.println("--disconnect DB--");
	}
	

}
