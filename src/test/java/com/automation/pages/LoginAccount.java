package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginAccount {
	
	WebDriver driver;
	
//	Using FindBy Annotations
	@FindBy(how = How.XPATH, using = "//input[@id='email']") @CacheLookup WebElement enter_emailaddr;
	@FindBy(how=How.XPATH, using = "//input[@id='passwd']") @CacheLookup WebElement enter_pass;
	@FindBy(how=How.XPATH, using = "//button[@id='SubmitLogin']") @CacheLookup WebElement signIn;
	
	//Declaring constructor
		public LoginAccount(WebDriver ldriver)
		{
			this.driver = ldriver;
		}
		
		public void performLogin(String username, String password)
		{
			enter_emailaddr.clear();
			enter_emailaddr.sendKeys(username);
			enter_pass.clear();
			enter_pass.sendKeys(password);
			signIn.click();
		}

}
