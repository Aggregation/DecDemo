package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorLoginPage {
	
	//declaration
		@FindBy(name = "username")
		private WebElement Doctor_UN;
		
		@FindBy(name = "password")
		private WebElement Doctor_PWD;
		
		@FindBy(name = "submit")
		private WebElement submit_Btn;
		

		//initialization
		public DoctorLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//utilization
		public WebElement getDoctor_UN() {
			return Doctor_UN;
		}


		public WebElement getDoctor_PWD() {
			return Doctor_PWD;
		}


		public WebElement getSubmit_Btn() {
			return submit_Btn;
		}
	

}
