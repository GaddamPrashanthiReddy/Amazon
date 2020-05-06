package com.amazon.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "D:\\Amazon\\Amazon\\src\\main\\java\\com\\amazon\\features\\SignOut.feature", glue = {
		"com.amazon.stepdefinitions" }, monochrome = true, dryRun = false)

public class SignOutRunner extends AbstractTestNGCucumberTests {

}
