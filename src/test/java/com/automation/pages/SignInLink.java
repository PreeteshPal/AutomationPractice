package com.automation.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author PREETESH
 * 
 * POM - Page Factory Method
 * SignIn link - page
 */

public class SignInLink {
	
	WebDriver driver;
	
//	Using FindBy Annotations
	@FindBy(how=How.XPATH, using="//a[@class='login']") @CacheLookup WebElement select_signin;
	
//	Using FindBy Annotations - Create account text-field box
	
	@FindBy(how=How.XPATH, using = "//input[@id='email_create']") WebElement enter_emailaddr;
	@FindBy(how=How.XPATH,using = "//form[@id='create-account_form']//span[1]") WebElement create_account_btn;
	
	//Declaring constructor
	public SignInLink(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	public void selectSignIn(String enteremail)
	{
		select_signin.click();
		enter_emailaddr.clear();
		enter_emailaddr.sendKeys(enteremail);
		create_account_btn.click();
	}
}
