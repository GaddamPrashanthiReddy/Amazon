package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	WebDriver driver;
	public AddToCartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="nav-hamburger-menu")
	private WebElement menu;
	
	@FindBy(xpath="//a[@data-menu-id=\"12\"]/..")
	private WebElement groceries;
	
	@FindBy(xpath="//a[text()='Coffee, Tea & Beverages']/..")
	private WebElement coffeeBeverages;
	
	@FindBy(xpath="//span[text()='Cola & Soft Drinks']")
	private WebElement colaSoftDrinks;
	
	@FindBy(xpath="//h2[text()='Coca Cola 300ml (Pack of 6)']")
	private WebElement colaDrink;
	
	@FindBy(id="add-to-cart-button")
	private WebElement addToCart;
	
	@FindBy(xpath="//span[@class='a-button-inner']/..")
	private WebElement cart;
	
	@FindBy(id="nav-cart")
	private WebElement cartIcon;
	
	@FindBy(id="sc-buy-box-ptc-button")
	private WebElement proceedToBuy;
	
	@FindBy(xpath="//a[@data-action='page-spinner-show']")
	private WebElement deliverToThisAddress;
	
	@FindBy(xpath="//input[@value=\"Continue\"]/..")
	private WebElement continueButton;
	
	public void openMenu() {
		menu.click();
	}
	
	public void groceriesClick() {
		groceries.click();
	}
	
	public void coffeeBeveragesClick() {
		coffeeBeverages.click();
	}
	
	public void colaSoftDrinksClick() {
		colaSoftDrinks.click();
	}
	
	public void colaDrinkClick() {
		colaDrink.click();
	}
	
	public void addToCart() {
		addToCart.click();
	}
	
	public void viewCart() {
		cart.click();
	}
	
	public void cartIcon() {
		cartIcon.click();
	}
	
	public void proceedToBuy() {
		proceedToBuy.click();
	}
	
	public void deliverToThisAddress() {
		deliverToThisAddress.click();
	}
	
	public void continueButton() {
		continueButton.click();
	}
	
}
