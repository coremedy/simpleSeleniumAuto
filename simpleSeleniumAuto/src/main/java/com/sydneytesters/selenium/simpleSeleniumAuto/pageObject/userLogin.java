package com.sydneytesters.selenium.simpleSeleniumAuto.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class userLogin extends mainPage {
	
	@FindBy(how = How.XPATH, using = "//*[@id='wpName1']")
	protected WebElement user_name;

	@FindBy(how = How.XPATH, using = "//*[@id='wpPassword1']")
	protected WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@id='wpLoginAttempt']")
	protected WebElement login_button;

	public void fillInUsername(String username) {
		user_name.sendKeys(username);
	}

	public void fillInPassword(String passwd) {
		password.sendKeys(passwd);
	}

	public void performLogin() {
		login_button.submit();
	}
}