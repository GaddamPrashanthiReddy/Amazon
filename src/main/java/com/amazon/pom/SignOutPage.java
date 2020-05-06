package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOutPage {
	
	WebDriver driver;

	public SignOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value='Save for later']")
	private WebElement saveForLater;

	@FindBy(id="nav-link-accountList")
	private WebElement mouseHover;

	@FindBy(xpath = "//span[contains(text(),'Sign Out')]")
	private WebElement signOut;
	
	@FindBy(xpath="//input[@value='Move to Wish List']/..")
	private WebElement moveToWishlist;
	
	@FindBy(xpath="//a[@aria-label='Prashanthi (Private,)']")
	private WebElement prashanthilist;
	
	@FindBy(xpath="//span[text()='Prashanthi']")
	private WebElement prashanthi;
	
	public void saveForLater() {
		saveForLater.click();
	}
	
	public void moveToWishList() {
		moveToWishlist.click();
	}
	
	public void prashanthiList() {
		prashanthilist.click();
	}
	
	public void prashanthi() {
		prashanthi.click();
	}
	public void accountListHover() {
		Actions action = new Actions(driver);
		action.moveToElement(mouseHover).build().perform();
	}

	public void signOut() {
		Actions action = new Actions(driver);
		action.moveToElement(signOut).click().perform();
	}


}
