package com.TestNG.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.automation.pages.CreateAccount;
import com.automation.pages.LoginAccount;
import com.automation.pages.OrderHistory;
import com.automation.pages.Payment;
import com.automation.pages.ProductCart;
import com.automation.pages.SignInLink;
import com.helper.pages.BrowserFactory;

public class TCBuyWomenProducts {
	
	static WebDriver driver;
	
	@Test
	public void startTest()
	{
//		This will launch the specific URL
		
		driver = BrowserFactory.startBrowser("chrome", "http://automationpractice.com/index.php");
		
		SignInLink s1 = PageFactory.initElements(driver, SignInLink.class); //initialize the page using binary class it will return the page object of that particular page
		s1.selectSignIn("preeteshtest07@gmail.com"); // calling method of the class
		
//		Note: You can go with either "Create Account" Or "Login section"
		
//		Create Account
//		CreateAccount c1 = PageFactory.initElements(driver, CreateAccount.class);
//		c1.start_registration("preeteshtest07@gmail.com", "test12345");
		
//		Login Account
		LoginAccount l1 = PageFactory.initElements(driver, LoginAccount.class);
		l1.performLogin("preeteshtest07@gmail.com", "test12345");
		
//		Product Cart
		ProductCart pc1 = PageFactory.initElements(driver, ProductCart.class);
		pc1.select_women_tab();
		pc1.add_products();
		
//		Payment
		Payment pay = PageFactory.initElements(driver, Payment.class);
		pay.confirm_order();
		
//		Order History
		OrderHistory h1 = PageFactory.initElements(driver, OrderHistory.class);
		h1.orderHistory();
		
//		assertEquals(ProductCart, expected, message);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
