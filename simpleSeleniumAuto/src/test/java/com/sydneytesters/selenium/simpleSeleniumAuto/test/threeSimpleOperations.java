package com.sydneytesters.selenium.simpleSeleniumAuto.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.sydneytesters.selenium.simpleSeleniumAuto.pageObject.mainPage;
import com.sydneytesters.selenium.simpleSeleniumAuto.pageObject.preferences;
import com.sydneytesters.selenium.simpleSeleniumAuto.pageObject.userLogin;
import com.sydneytesters.selenium.simpleSeleniumAuto.util.seleniumConnection;

public class threeSimpleOperations {
	
	protected userLogin userLoginPage = new userLogin();
	
	protected preferences preferencesPage = new preferences();

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
		seleniumConnection.closeSeleniumDriver();
	}

	@Parameters({"url", "credential"})
	@Test
	public void login(String url, String credential) {
		mainPage.launch(url);
		mainPage.logIn();
		userLoginPage.fillInUsername(credential);
		userLoginPage.fillInPassword(credential);
		userLoginPage.performLogin();
	}

	@Test(dependsOnMethods = { "login" })
	public void changePreference() {
		mainPage.selectPreference();
		preferencesPage.selectApperanace();
		preferencesPage.changeSkin();
		preferencesPage.changeUnderlineLinks();
		preferencesPage.savePreferences();
	}

	@Test(dependsOnMethods = { "changePreference" })
	public void logout() {
		mainPage.logOut();
	}
}