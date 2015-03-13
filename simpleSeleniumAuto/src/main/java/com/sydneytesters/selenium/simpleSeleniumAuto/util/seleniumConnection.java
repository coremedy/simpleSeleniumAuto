package com.sydneytesters.selenium.simpleSeleniumAuto.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumConnection {

	protected static WebDriver driver = null;

	public static WebDriver getSeleniumDriver() {
		if (driver == null) {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return driver;
	}

	public static void closeSeleniumDriver() {
		if (driver != null) {
			driver.close();
			driver.quit();
			driver = null;
		}
	}
}