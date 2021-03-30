package com.cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.project.Cucumber1.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\cucumber\\feature\\Cucumber.feature", glue = "com\\cucumber\\stepdef", monochrome = true, dryRun = false, plugin = "pretty")

public class Runner extends Baseclass {

	public static WebDriver driver;

	@BeforeClass
	public static void Setup1() {
		driver = Baseclass.BrowserLaunch("chrome");
	}

	@AfterClass
	public static void teardown() {
		driver.close();
	}

}
