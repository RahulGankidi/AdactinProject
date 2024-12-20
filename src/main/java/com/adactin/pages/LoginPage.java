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
	By SelectLocation = By.xpath("(//*[@class=\"search_combobox\"])[1]");
	By LocationMenu = By.cssSelector("#location > option:nth-child(9)");
	By SelectHotel = By.xpath("(//*[@class=\"search_combobox\"])[2]");
	By HotelMenu = By.cssSelector("#hotels > option:nth-child(3)");
	By RoomType = By.xpath("(//*[@class=\"search_combobox\"])[3]");
	By RoomMenu = By.cssSelector("#room_type > option:nth-child(2)");
	By NumberOfRooms = By.xpath("(//*[@class=\"search_combobox\"])[4]");
	By SelectRoom = By.cssSelector("#room_nos > option:nth-child(3)");
	By CheckInDate = By.xpath("(//*[@class=\"date_pick\"])[1]");
	By CheckOutDate = By.xpath("(//*[@class=\"date_pick\"])[2]");
	By AdultsPerRoom = By.xpath("(//*[@class=\"search_combobox\"])[5]");
	By AdultsMenu = By.cssSelector("#room_nos > option:nth-child(3)");
	By ChildPerRoom = By.xpath("(//*[@class=\"search_combobox\"])[6]");
	By ChildMenu = By.cssSelector("#room_nos > option:nth-child(2)");
	By SearchButton = By.xpath("(//*[@class=\"reg_button\"])[1]");
	By RadioButton = By.id("radiobutton_0");
	By ContinueButton = By.xpath("(//*[@class=\"reg_button\"])[1]");
	By FirstName = By.xpath("(//*[@class=\"reg_input\"])[1]");
	By LastName = By.xpath("(//*[@class=\"reg_input\"])[2]");
	By BillingAddress = By.xpath("//*[@class=\"txtarea\"]");
	By CreditCardNum = By.xpath("(//*[@class=\"reg_input\"])[3]");
	By SelectCardType = By.xpath("(//*[@class=\"select_combobox\"])[1]");
	By CardMenu = By.cssSelector("#cc_type > option:nth-child(4)");
	By ExpiryDateMonth = By.xpath("(//*[@class=\"select_combobox2\"])[1]");
	By MonthMenu = By.cssSelector("#cc_exp_month > option:nth-child(7)");
	By ExpiryDateYear = By.xpath("(//*[@class=\"select_combobox2\"])[2]");
	By YearMenu = By.cssSelector("#cc_exp_year > option:nth-child(18)");
	By EnterCvvNum = By.xpath("(//*[@class=\"reg_input\"])[4]");
	By BookNowButton = By.xpath("(//*[@class=\"reg_button\"])[1]");
	By LogOutButton = By.xpath("(//*[@class=\"reg_button\"])[3]");
	
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
	public void selectLocation() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement locationElement = wait.until(ExpectedConditions.elementToBeClickable(SelectLocation));
		locationElement.click();
	}
	public void locationMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement menuElement = wait.until(ExpectedConditions.elementToBeClickable(LocationMenu));
		menuElement.click();
	}
	public void selectHotel() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement hotelElement = wait.until(ExpectedConditions.elementToBeClickable(SelectHotel));
		hotelElement.click();
	}
	public void hotelMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement menu1Element = wait.until(ExpectedConditions.elementToBeClickable(HotelMenu));
		menu1Element.click();
	}
	public void roomType() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement typeElement = wait.until(ExpectedConditions.elementToBeClickable(RoomType));
		typeElement.click();
	}
	public void roomMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement menu2Element = wait.until(ExpectedConditions.elementToBeClickable(RoomMenu));
		menu2Element.click();
	}
	public void numberofRooms() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement roomsElement = wait.until(ExpectedConditions.elementToBeClickable(NumberOfRooms));
		roomsElement.click();
	}
	public void selectRoom() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement roomElement = wait.until(ExpectedConditions.elementToBeClickable(SelectRoom));
		roomElement.click();
	}
	public void enterCheckInDate() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement checkinElement = wait.until(ExpectedConditions.elementToBeClickable(CheckInDate));
		checkinElement.click();
		checkinElement.sendKeys("25-12-2024");
	}
	public void enterCheckOutDate() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement checkoutElement = wait.until(ExpectedConditions.elementToBeClickable(CheckOutDate));
		checkoutElement.click();
		checkoutElement.sendKeys("30-12-2024");
	}
	public void adultsperRoom() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement adultsElement = wait.until(ExpectedConditions.elementToBeClickable(AdultsPerRoom));
		adultsElement.click();
	}
	public void adultsMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement adultmenuElement = wait.until(ExpectedConditions.elementToBeClickable(AdultsMenu));
		adultmenuElement.click();
	}
	public void childperRoom() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement childElement = wait.until(ExpectedConditions.elementToBeClickable(ChildPerRoom));
		childElement.click();
	}
	public void childMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement childmenuElement = wait.until(ExpectedConditions.elementToBeClickable(ChildMenu));
		childmenuElement.click();
	}
	public void clickonSearchButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement searchElement = wait.until(ExpectedConditions.elementToBeClickable(SearchButton));
		searchElement.click();
	}
	public void clickonRadioButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement radioElement = wait.until(ExpectedConditions.elementToBeClickable(RadioButton));
		radioElement.click();
	}
	public void clickonContinueButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement continueElement = wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		continueElement.click();
	}
	public void enterFirstName() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement fnameElement = wait.until(ExpectedConditions.elementToBeClickable(FirstName));
		fnameElement.click();
		fnameElement.sendKeys("Rahul");
	}
	public void enterLastName() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement lnameElement = wait.until(ExpectedConditions.elementToBeClickable(LastName));
		lnameElement.click();
		lnameElement.sendKeys("Reddy");
	}
	public void enterBillingAddress() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement billingElement = wait.until(ExpectedConditions.elementToBeClickable(BillingAddress));
		billingElement.click();
		billingElement.sendKeys("10 HarbridgeRoad Chester");
	}
	public void enterCreditCardNum() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement creditElement = wait.until(ExpectedConditions.elementToBeClickable(CreditCardNum));
		creditElement.click();
		creditElement.sendKeys("4242424242424242");
	}
	public void selectCreditCardType() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement cardtypeElement = wait.until(ExpectedConditions.elementToBeClickable(SelectCardType));
		cardtypeElement.click();
	}
	public void selectCardMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement cardElement = wait.until(ExpectedConditions.elementToBeClickable(CardMenu));
		cardElement.click();
	}
	public void selectExpiryDateMonth() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement monthElement = wait.until(ExpectedConditions.elementToBeClickable(ExpiryDateMonth));
		monthElement.click();
	}
	public void selectMonthMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement monthmenuElement = wait.until(ExpectedConditions.elementToBeClickable(MonthMenu));
		monthmenuElement.click();
	}
	public void selectExpiryDateYear() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement yearElement = wait.until(ExpectedConditions.elementToBeClickable(ExpiryDateYear));
		yearElement.click();
	}
	public void selectYearMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement yearmenuElement = wait.until(ExpectedConditions.elementToBeClickable(YearMenu));
		yearmenuElement.click();
	}
	public void enterCvvNum() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement cvvElement = wait.until(ExpectedConditions.elementToBeClickable(EnterCvvNum));
		cvvElement.click();
		cvvElement.sendKeys("456");
	}
	public void clickonBookNowButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement booknowElement = wait.until(ExpectedConditions.elementToBeClickable(BookNowButton));
		booknowElement.click();
	}
	public void clickonLogOutButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement logoutElement = wait.until(ExpectedConditions.elementToBeClickable(LogOutButton));
		logoutElement.click();
	}
}
