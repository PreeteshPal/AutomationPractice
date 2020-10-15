/**
 * 
 */
package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Preetesh
 * POM - Page Factory Method
 * Payment - page
 */
public class Payment {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using = "//a[@class='bankwire']") WebElement pay_wire;
	@FindBy(how=How.XPATH, using = "//span[contains(text(),'I confirm my order')]") WebElement confirm_order;
	
//	Declaring constructor
	public Payment(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	public void confirm_order()
	{
		pay_wire.click();
		confirm_order.click();
	}
}
