package com.cucumber.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.pom.Loginpage;
import com.cucumber.project.Cucumber1.Baseclass;
import com.cucumber.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;



public class LoginSD extends Baseclass {
	
	public static WebDriver driver=Runner.driver;
	
	Loginpage lp=new Loginpage(driver);

	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
		geturl("https://adactinhotelapp.com/");
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
		WebElement username = lp.getUsername();
		sendkeys(username, arg1);
		
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
	sendkeys(lp.getPassword(), arg1);	
	}
	

	@Then("^user verify valid username and valid password$")
	public void user_verify_valid_username_and_valid_password() throws Throwable {
	click(lp.getLogin());
	}
	
}	