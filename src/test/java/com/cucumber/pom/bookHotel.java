package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookHotel {
	public static WebDriver driver;

	public bookHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(name = "first_name")
private WebElement firstname;

@FindBy(name = "last_name")
private WebElement lastname;

@FindBy(name = "address")
private WebElement address;

@FindBy(name = "cc_num")
private WebElement cc_num;

@FindBy(name = "cc_type")
private WebElement cc_type;

@FindBy(name = "cc_exp_month")
private WebElement cc_exp_month;

@FindBy(name = "cc_exp_year")
private WebElement cc_exp_year;

@FindBy(name = "cc_cvv")
private WebElement cc_cvv;

@FindBy(name = "book_now")
private WebElement book_now;

public WebElement getFirstname() {
	return firstname;
}

public WebElement getLastname() {
	return lastname;
}

public WebElement getAddress() {
	return address;
}

public WebElement getCc_num() {
	return cc_num;
}

public WebElement getCc_type() {
	return cc_type;
}

public WebElement getCc_exp_month() {
	return cc_exp_month;
}

public WebElement getCc_exp_year() {
	return cc_exp_year;
}

public WebElement getCc_cvv() {
	return cc_cvv;
}

public WebElement getBook_now() {
	return book_now;
}







}

