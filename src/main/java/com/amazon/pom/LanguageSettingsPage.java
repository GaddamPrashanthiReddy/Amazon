package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LanguageSettingsPage {
	
	WebDriver driver;
	public LanguageSettingsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="icp-nav-flyout")
	public WebElement languageBtn;
	

	public void languageIcon() {
		languageBtn.click();
	}
	
	@FindBy(xpath = "//span[@class=\"a-label a-radio-label\"]/span")
	public WebElement radioBtn;

	public void radioButton() {
		radioBtn.click();
	}
	@FindBy(className = "a-button-input")
	public WebElement saveChangesBtn;

	public void saveChanges() {
		saveChangesBtn.click();
	}
	@FindBy(id = "icp-btn-close-announce")
	public WebElement cancelBtn;

	public void cancel() {
		cancelBtn.click();
	}

}
