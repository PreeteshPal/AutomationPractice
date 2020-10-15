package com.automation.pages;
/**
 * @author PREETESH
 * 
 * POM - Page Factory Method
 * Create Account - page
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	WebDriver driver;
	
	
//	Create an account - Your Personnel Info
	@FindBy(how=How.XPATH, using = "//input[@id='id_gender1']") WebElement gender_title;
	@FindBy(how=How.XPATH, using = "//input[@id='customer_firstname']") WebElement fname;
	@FindBy(how=How.XPATH, using = "//input[@id='customer_lastname']") WebElement lname;
	@FindBy(how=How.XPATH, using = "//input[@id='email']") WebElement email;
	@FindBy(how=How.XPATH, using = "//input[@id='passwd']") WebElement pwd;
	@FindBy(how=How.XPATH, using = "//select[@id='days']") WebElement dob_day;
	@FindBy(how=How.XPATH, using = "//select[@id='months']") WebElement dob_month;
	@FindBy(how=How.XPATH, using = "//select[@id='years']") WebElement dob_year;
	@FindBy(how=How.XPATH, using = "//input[@id='newsletter']") WebElement sign_news_letter;
	@FindBy(how=How.XPATH, using = "//input[@id='optin']") WebElement sign_spl_offers;
	
//	Your Address
	@FindBy(how=How.XPATH, using="//input[@id='firstname']") WebElement addr_fname;
	@FindBy(how=How.XPATH, using="//input[@id='lastname']") WebElement addr_lname;
	@FindBy(how=How.XPATH, using="//input[@id='company']") WebElement addr_company;
	@FindBy(how=How.XPATH, using="//input[@id='address1']") WebElement address1;
	@FindBy(how=How.XPATH, using="//input[@id='address2']") WebElement address2;
	@FindBy(how=How.XPATH, using="//input[@id='city']") WebElement addr_city;
	@FindBy(how=How.XPATH, using="//select[@id='id_state']") WebElement addr_state;
	@FindBy(how=How.XPATH, using="//input[@id='postcode']") WebElement addr_zipcode;
	@FindBy(how=How.XPATH, using="//select[@id='id_country']") WebElement addr_country;
	@FindBy(how=How.XPATH, using="//textarea[@id='other']") WebElement additional_info;
	@FindBy(how=How.XPATH, using="//input[@id='phone']") WebElement home_phone;
	@FindBy(how=How.XPATH, using="//input[@id='phone_mobile']") WebElement mobile_phone;
	@FindBy(how=How.XPATH, using="//input[@id='alias']") WebElement alias_addr;
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Register')]") WebElement register_btn;
	
//	Declaring Constructor
	public CreateAccount(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	public void start_registration(String regis_email,String regis_pass)
	{
//		Your Personnel Information
		
		gender_title.click();
		fname.clear();
		fname.sendKeys("Preetesh");
		lname.clear();
		lname.sendKeys("Pal");
		email.clear();
		email.sendKeys(regis_email);
		pwd.clear();
		pwd.sendKeys(regis_pass);
		
		Select day = new Select(dob_day);
		day.selectByValue("9");
		Select month = new Select(dob_month);
		month.selectByValue("11");
		Select year = new Select(dob_year);
		year.selectByValue("1991");
		
		sign_news_letter.click();
		sign_spl_offers.click();
		
//		Your Address
		addr_fname.clear();
		addr_fname.sendKeys("Preetesh");
		addr_lname.clear();
		addr_lname.sendKeys("Pal");
		addr_company.clear();
		addr_company.sendKeys("ABC Corp");
		address1.clear();
		address1.sendKeys("Lane street, 00000, ABC Corp");
		address2.clear();
		address2.sendKeys("Newyork, USA");
		addr_city.clear();
		addr_city.sendKeys("Newyork");
		
		Select city = new Select(addr_state);
		city.selectByValue("32");
		
		addr_zipcode.clear();
		addr_zipcode.sendKeys("00000");
		
		Select country = new Select(addr_country);
		country.selectByValue("21");
		
		additional_info.clear();
		additional_info.sendKeys("NA");
		home_phone.clear();
		home_phone.sendKeys("2025550191");
		mobile_phone.clear();
		mobile_phone.sendKeys("1234567890");
		alias_addr.clear();
		alias_addr.sendKeys("NA");
		register_btn.click();
	}
	

}
