package com.amazon.qa.tesecases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initilization();
		 loginPage = new LoginPage();
		
	}
	@Test(priority = 0)
	public void LoginPageTitleTest() {
	String title =	loginPage.validateLoginPage();
	Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
@Test(priority = 1)
public void loginTest() {
	homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
   
}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
