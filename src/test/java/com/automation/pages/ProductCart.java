package com.automation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

/**
 * @author PREETESH
 * 
 * POM - Page Factory Method
 * Product Cart - page
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductCart {
	
	static WebDriver driver;
	
	String shopping_total_value;
	
//	Using FindBy Annotation - Select Women
	@FindBy(how=How.XPATH, using="//a[@class='sf-with-ul'][contains(text(),'Women')]") WebElement WomenTab;
	
//	Using FindBy Annotation - Add product
	@FindBy(how=How.XPATH, using ="//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//img[@class='replace-2x img-responsive']") WebElement select_product;
	@FindBy(how=How.XPATH, using = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line hovered']//span[contains(text(),'Quick view')]") WebElement quick_view;
	@FindBy(how=How.XPATH, using = "//a[@class='btn btn-default button-plus product_quantity_up']//span") WebElement add_quantity;
	@FindBy(how=How.XPATH, using = "//span[contains(text(),'Add to cart')]") WebElement addtocart_btn;
	@FindBy(how=How.XPATH, using = "//span[contains(text(),'Proceed to checkout')]") WebElement proceed_tocheckout_btn01;
	
//	01 Summary
	@FindBy(how=How.XPATH, using = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]") WebElement proceed_checkout_btn02;

//	03 Address
	@FindBy(how=How.XPATH, using = "//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]") WebElement proceed_checkout_btn03;

//	04 Shipping
	@FindBy(how=How.XPATH, using = "//input[@name='cgv' and @id='cgv']") WebElement Terms_service;
	@FindBy(how=How.XPATH, using = "//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]") WebElement proceed_checkout_btn04;
	
	
	public ProductCart(WebDriver ldriver)
	{
		this.driver =  ldriver;
	}
	
	public void select_women_tab()
	{
		WomenTab.click();
	}
	
	public void add_products()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement product = select_product;
		
		Actions action = new Actions(driver);
		action.moveToElement(product).perform();
		quick_view.click();
		
		driver.switchTo().frame(0); //Switch to frame
		add_quantity.click();
		addtocart_btn.click();
		driver.switchTo().defaultContent(); // getting out of the frame
		
		// Total price of products
		WebDriverWait wait = new WebDriverWait(driver, 10);
		shopping_total_value = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ajax_block_cart_total']"))).getAttribute("innerHTML");
		
		System.out.println("Shopping total value "+shopping_total_value);
		
		proceed_tocheckout_btn01.click();
		proceed_checkout_btn02.click();
		proceed_checkout_btn03.click();
		Terms_service.click();
		proceed_checkout_btn04.click();
		
	}

}
