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
		loginpage.selectLocation();
		loginpage.locationMenu();
		loginpage.selectHotel();
		loginpage.hotelMenu();
		loginpage.selectRoom();
		loginpage.roomType();
		loginpage.roomMenu();
		loginpage.numberofRooms();
		loginpage.selectRoom();
		loginpage.enterCheckInDate();
		loginpage.enterCheckOutDate();
		loginpage.adultsperRoom();
		loginpage.adultsMenu();
		loginpage.childperRoom();
		loginpage.childMenu();
		loginpage.clickonSearchButton();
		loginpage.clickonRadioButton();
		loginpage.clickonContinueButton();
		loginpage.enterFirstName();
		loginpage.enterLastName();
		loginpage.enterBillingAddress();
		loginpage.enterCreditCardNum();
		loginpage.selectCreditCardType();
		loginpage.selectCardMenu();
		loginpage.selectExpiryDateMonth();
		loginpage.selectMonthMenu();
		loginpage.selectExpiryDateYear();
		loginpage.selectYearMenu();
		loginpage.enterCvvNum();
		loginpage.clickonBookNowButton();
		loginpage.clickonLogOutButton();
	}

}
