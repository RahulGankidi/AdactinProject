package com.adactin.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BasePage {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
		driver = new EdgeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}

}
