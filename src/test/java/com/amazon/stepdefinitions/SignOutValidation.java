package com.amazon.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.pom.AddToCartPage;
import com.amazon.pom.LoginPage;
import com.amazon.pom.SignOutPage;
import com.excel.properties.ExcelData;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignOutValidation {

	WebDriver driver;

	static {

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");

	}

	@Given("^Open the browser and enter the Url of the website$")
	public void open_the_browser_and_enter_the_Url_of_the_website() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		String url = ExcelData.getUrl();
		driver.get(url);
	}

	@When("^I click on Accounts and Lists it takes to SignIn Page$")
	public void i_click_on_Accounts_and_Lists_it_takes_to_SignIn_Page() throws Throwable {
		new LoginPage(driver).accountAndLists();
	}

	@Then("^I enter valid Emailid and click on continue$")
	public void i_enter_valid_Emailid_and_click_on_continue() throws Throwable {
		new LoginPage(driver).typeEmail();
		new LoginPage(driver).continueBtn();
	}

	@Then("^I enter valid password and checks for remember me$")
	public void i_enter_valid_password_and_checks_for_remember_me() throws Throwable {
		new LoginPage(driver).typePassword();
		new LoginPage(driver).rememberMe();
	}

	@When("^I click on login it opens Homepage$")
	public void i_click_on_login_it_opens_Homepage() throws Throwable {
		new LoginPage(driver).login();
	}

	@When("^click on Cart Icon it opens the shopping cart page$")
	public void click_on_Cart_Icon_it_opens_the_shopping_cart_page() throws Throwable {
		new AddToCartPage(driver).cartIcon();
	}

	@When("^I click on save for later the product moves to save for later$")
	public void i_click_on_save_for_later_the_product_moves_to_save_for_later() throws Throwable {
		new SignOutPage(driver).saveForLater();
	}

	@When("^click on move to wish list$")
	public void click_on_move_to_wish_list() throws Throwable {
		new SignOutPage(driver).moveToWishList();
		Thread.sleep(3000);
		new SignOutPage(driver).prashanthiList();
	}

	@Then("^Mouse hover on Accounts and lists and click on prashanthi$")
	public void mouse_hover_on_Accounts_and_lists_and_click_on_prashanthi() throws Throwable {
		Thread.sleep(3000);
		new SignOutPage(driver).accountListHover();
		new SignOutPage(driver).prashanthi();
	}

	@Then("^Mouse Hover on Accounts and lists and click on Signout$")
	public void mouse_Hover_on_Accounts_and_lists_and_click_on_Signout() throws Throwable {
		Thread.sleep(3000);
		new SignOutPage(driver).accountListHover();
		new SignOutPage(driver).signOut();
	}

	@Then("^close browser of website$")
	public void close_browser_of_website() throws Throwable {
		Thread.sleep(3000);
		new LoginPage(driver).close();
	}

}
