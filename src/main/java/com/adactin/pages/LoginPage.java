package com.adactin.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	By UserName = By.xpath("(//*[@class=\"login_input\"])[1]");
	By Password = By.xpath("(//*[@class=\"login_input\"])[2]");
	By LoginButton = By.className("login_button");
	
	public void enterUserName() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement unameElement = wait.until(ExpectedConditions.elementToBeClickable(UserName));
		unameElement.click();
		unameElement.sendKeys("RAHULREDDY");
	}
	public void enterPassword() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement passElement = wait.until(ExpectedConditions.elementToBeClickable(Password));
		passElement.click();
		passElement.sendKeys("Rahul@123");
	}
	public void clickonLoginButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement loginElement = wait.until(ExpectedConditions.elementToBeClickable(LoginButton));
		loginElement.click();
	}
	
}
