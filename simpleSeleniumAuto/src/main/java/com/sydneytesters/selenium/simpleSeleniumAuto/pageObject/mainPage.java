package com.sydneytesters.selenium.simpleSeleniumAuto.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.sydneytesters.selenium.simpleSeleniumAuto.util.seleniumConnection;

public class mainPage {

	@FindBy(how = How.XPATH, using = "//*[@id='pt-login']/a")
	@CacheLookup
	protected static WebElement log_in;

	@FindBy(how = How.XPATH, using = "//*[@id='pt-preferences']/a")
	@CacheLookup
	protected static WebElement preference;

	@FindBy(how = How.XPATH, using = "//*[@id='pt-logout']/a")
	@CacheLookup
	protected static WebElement log_out;

	public static void launch(String url) {
		seleniumConnection.getSeleniumDriver().get(url);
	}

	public static void logIn() {
		log_in.click();
	}

	public static void selectPreference() {
		preference.click();
	}

	public static void logOut() {
		log_out.click();
	}

	protected mainPage() {
		PageFactory.initElements(seleniumConnection.getSeleniumDriver(), this);
	}
}