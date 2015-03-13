package com.sydneytesters.selenium.simpleSeleniumAuto.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class preferences extends mainPage {

	@FindBy(how = How.XPATH, using = "//*[@id='preftab-rendering']")
	protected WebElement appearance;

	@FindBy(how = How.XPATH, using = "//*[@id='mw-input-wpskin-modern']")
	protected WebElement skinModernRadioButton;

	@FindBy(how = How.XPATH, using = "//*[@id='mw-input-wpskin-vector']")
	protected WebElement skinVectorRadioButton;

	@FindBy(how = How.XPATH, using = "//*[@id='mw-input-wpunderline']")
	protected WebElement underlineLinks;

	@FindBy(how = How.XPATH, using = "//*[@id='prefcontrol']")
	protected WebElement savePreferences;

	public void selectApperanace() {
		appearance.click();
	}

	public void changeSkin() {
		if (skinVectorRadioButton.isSelected()) {
			skinModernRadioButton.click();
		}
		if (skinModernRadioButton.isSelected()) {
			skinVectorRadioButton.click();
		}
	}

	public void changeUnderlineLinks() {
		Select underlineLinksSelect = new Select(underlineLinks);
		underlineLinksSelect.selectByIndex(1);
		underlineLinksSelect.selectByIndex(0);
	}

	public void savePreferences() {
		savePreferences.click();
	}
}