package com.adactin.tests;

import org.testng.annotations.Test;

import com.adactin.pages.BasePage;
import com.adactin.pages.LoginPage;

public class LoginTest extends BasePage {
	
	LoginPage loginpage;
	
	@Test
	public void LoginTest() {
		
		loginpage = new LoginPage(driver);
		loginpage.enterUserName();
		loginpage.enterPassword();
		loginpage.clickonLoginButton();
	}

}
