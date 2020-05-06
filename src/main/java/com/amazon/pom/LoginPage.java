package com.amazon.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.excel.properties.ExcelData;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Using FindBy for locating elements

	@FindBy(id = "nav-link-accountList")
	private WebElement Accountandlistsbtn;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement typeEmail;

	@FindBy(id = "continue")
	private WebElement continuebtn;

	@FindBy(name = "password")
	private WebElement typePassword;

	@FindBy(name = "rememberMe")
	private WebElement checkrememberMe;

	@FindBy(id = "signInSubmit")
	private WebElement loginbtn;

	// Defining all the user actions (Methods)

	// This method is used to click on SignIn
	public void accountAndLists() {
		Accountandlistsbtn.click();
	}

	// This method is to set Email in the email text box

	public void typeEmail() throws IOException {
		String EmailId = ExcelData.getEmailId();
		typeEmail.sendKeys(EmailId);
	}

	// This method is to click on Login Button
	public void login() {
		loginbtn.click();
	}

	// This method is to click on continue Button
	public void continueBtn() {
		continuebtn.click();
	}
	// This method is to set Password in the password text box

	public void typePassword() throws IOException {
		String password = ExcelData.getPassword();
		typePassword.sendKeys(password);
	}

	// This method is to click on Keep me signIn checkbox
	public void rememberMe() {
		checkrememberMe.click();
	}

	// This method is to close browser
	public void close() {
		driver.close();
	}

}
