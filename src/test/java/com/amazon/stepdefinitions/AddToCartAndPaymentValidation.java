package com.amazon.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.pom.AddToCartPage;
import com.amazon.pom.LoginPage;
import com.excel.properties.ExcelData;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCartAndPaymentValidation {

	WebDriver driver;

	static {

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");

	}

	@Given("^Open the browser and enter the url of the website$")
	public void open_the_browser_and_enter_the_url_of_the_website() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		String url = ExcelData.getUrl();
		driver.get(url);
	}

	@When("^I click on Accounts and Lists it opens SignIn Page$")
	public void i_click_on_Accounts_and_Lists_it_opens_SignIn_Page() throws Throwable {
		new LoginPage(driver).accountAndLists();
	}

	@Then("^I enter Valid Emailid and click on continue$")
	public void i_enter_Valid_Emailid_and_click_on_continue() throws Throwable {
		new LoginPage(driver).typeEmail();
		new LoginPage(driver).continueBtn();
	}

	@Then("^I enter Valid password and checks for remember me$")
	public void i_enter_Valid_password_and_checks_for_remember_me() throws Throwable {
		new LoginPage(driver).typePassword();
		new LoginPage(driver).rememberMe();
	}

	@When("^I click on login it enters into Homepage$")
	public void i_click_on_login_it_enters_into_Homepage() throws Throwable {
		new LoginPage(driver).login();
	}

	@When("^I click on Open Menu it goes to shop by category$")
	public void i_click_on_Open_Menu_it_goes_to_shop_by_category() throws Throwable {
		new AddToCartPage(driver).openMenu();
	}

	@Then("^click on Beauty,Health,Grocery it goes to Grocery and Gourment foods$")
	public void click_on_Beauty_Health_Grocery_it_goes_to_Grocery_and_Gourment_foods() throws Throwable {
		new AddToCartPage(driver).groceriesClick();
	}

	@Then("^click on Tea,coffee and beverages it opens coffee tea page$")
	public void click_on_Tea_coffee_and_beverages_it_opens_coffee_tea_page() throws Throwable {
		new AddToCartPage(driver).coffeeBeveragesClick();
	}

	@When("^I click on cola and soft drinks it opens soft drinks page$")
	public void i_click_on_cola_and_soft_drinks_it_opens_soft_drinks_page() throws Throwable {
		new AddToCartPage(driver).colaSoftDrinksClick();
	}

	@Then("^click on coco cola product$")
	public void click_on_coco_cola_product() throws Throwable {
		new AddToCartPage(driver).colaDrinkClick();
	}

	@When("^I click on Add to cart it goes to Amazon shopping cart$")
	public void i_click_on_Add_to_cart_it_goes_to_Amazon_shopping_cart() throws Throwable {
		new AddToCartPage(driver).addToCart();
	}

	@Then("^click on cart the product gets add to shopping cart$")
	public void click_on_cart_the_product_gets_add_to_shopping_cart() throws Throwable {
		new AddToCartPage(driver).viewCart();
	}

	@Then("^close the browser of the website$")
	public void close_the_browser_of_the_website() throws Throwable {
		Thread.sleep(3000);
		new LoginPage(driver).close();
	}

	@When("^I click on Cart Icon it opens the shopping cart page$")
	public void i_click_on_Cart_Icon_it_opens_the_shopping_cart_page() throws Throwable {
		new AddToCartPage(driver).cartIcon();
	}

	@Then("^click on Proceed to buy it goes to delivery address page$")
	public void click_on_Proceed_to_buy_it_goes_to_delivery_address_page() throws Throwable {
		new AddToCartPage(driver).proceedToBuy();
	}

	@When("^I click on deliver to this address it takes to shipping delivery page$")
	public void i_click_on_deliver_to_this_address_it_takes_to_shipping_delivery_page() throws Throwable {
		new AddToCartPage(driver).deliverToThisAddress();
	}

	@Then("^click on continue it goes to payment method page$")
	public void click_on_continue_it_goes_to_payment_method_page() throws Throwable {
		new AddToCartPage(driver).continueButton();
	}

	@Then("^close  browser of the website$")
	public void close_browser_of_the_website() throws Throwable {
		Thread.sleep(3000);
		new LoginPage(driver).close();
	}

}
