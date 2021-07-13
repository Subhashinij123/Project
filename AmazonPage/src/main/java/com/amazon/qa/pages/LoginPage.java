package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
//page factory
	@FindBy(xpath="//*[@id='nav-link-accountList']")
	WebElement SignIn;
	@FindBy(xpath="//*[@id='ap_email']")
	WebElement email;
	@FindBy(xpath="//*[@id='continue']")
	WebElement continuebtn;
	
	@FindBy(xpath="//*[@id='ap_password']")
	WebElement password;
	@FindBy(xpath="//*[@id='signInSubmit']")
	WebElement SignInbtn;
	
	//intilizing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	//Actions
	public String validateLoginPage() {
		return driver.getTitle();
	}
	public HomePage  Login(String em, String pwd) {
		SignIn.click();
		email.sendKeys(em);
		continuebtn.click();
		password.sendKeys(pwd);
		SignInbtn.click();
		
		return new HomePage();
		
		
	}

}
