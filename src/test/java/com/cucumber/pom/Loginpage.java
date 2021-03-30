package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage  {
	
	public static WebDriver driver;
	
	@FindBy(name = "username")
	private WebElement username;

	

	public Loginpage(WebDriver driver3) {
		this.driver=driver3;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(name = "password")
	private WebElement password;
	@FindBy(name = "login")
	private WebElement login;

}
