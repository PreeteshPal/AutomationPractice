package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderHistory {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using = "//a[@class='button-exclusive btn btn-default']") WebElement back_to_orders;
	@FindBy(how=How.XPATH, using = "//span[@class='price']") WebElement total_price;
	
	public OrderHistory(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	public void orderHistory()
	{
		back_to_orders.click();
		
		String history_total_value = total_price.getAttribute("innerHTML");
		System.out.println("History total value"+history_total_value);
	}

}
