package com.amazon.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.pom.LanguageSettingsPage;
import com.amazon.pom.LoginPage;
import com.excel.properties.ExcelData;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LanguageSettingsValidation {
	
	WebDriver driver;
	
	static{
		
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");

	}
	
	@Given("^Open the browser and Enter the url of the website$")
	public void open_the_browser_and_Enter_the_url_of_the_website() throws Throwable {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		String url = ExcelData.getUrl();
		driver.get(url);
	}

	@When("^I click on Account and Lists it opens SignIn Page$")
	public void i_click_on_Account_and_Lists_it_opens_SignIn_Page() throws Throwable {
		new LoginPage(driver).accountAndLists();
	}

	@Then("^I type Valid Emailid and click on continue$")
	public void i_type_Valid_Emailid_and_click_on_continue() throws Throwable {
		new LoginPage(driver).typeEmail();
		new LoginPage(driver).continueBtn();
	}

	@Then("^I type Valid password and checks for remember me$")
	public void i_type_Valid_password_and_checks_for_remember_me() throws Throwable {
		new LoginPage(driver).typePassword();
		new LoginPage(driver).rememberMe();
	}

	@When("^I click on Login it enters into Homepage$")
	public void i_click_on_Login_it_enters_into_Homepage() throws Throwable {
		new LoginPage(driver).login();
	}

	@When("^I click on language icon it opens changes Language Settings Page$")
	public void i_click_on_language_icon_it_opens_changes_Language_Settings_Page() throws Throwable {
	new LanguageSettingsPage(driver).languageIcon();
	}

	@Then("^I click on radio button$")
	public void i_click_on_radio_button() throws Throwable {
		new LanguageSettingsPage(driver).radioButton();
	}

	@When("^I Click on Savechanges it opens Homepage$")
	public void i_Click_on_Savechanges_it_opens_Homepage() throws Throwable {
		new LanguageSettingsPage(driver).saveChanges();
	}

	@Then("^Close browser of the website$")
	public void close_browser_of_the_website() throws Throwable {
		new LoginPage(driver).close();
	}

	@When("^I Click on Cancel it opens HomePage$")
	public void i_Click_on_Cancel_it_opens_HomePage() throws Throwable {
		new LanguageSettingsPage(driver).cancel();
	}

	@Then("^Close the browser of the website$")
	public void close_the_browser_of_the_website() throws Throwable {
		new LoginPage(driver).close();
	}


}
