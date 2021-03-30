package com.cucumber.stepdef;

import org.openqa.selenium.WebDriver;

import com.cucumber.pom.bookHotel;
import com.cucumber.project.Cucumber1.Baseclass;
import com.cucumber.runner.Runner;

import cucumber.api.java.en.*;

public class BookSD extends Baseclass {
	public static WebDriver driver = Runner.driver;

	bookHotel bh = new bookHotel(driver);

	@When("^user enter firstname$")
	public void user_enter_firstname() throws Throwable {
		sendkeys(bh.getFirstname(), "prema");
	   	}

	@When("^user enter lastname$")
	public void user_enter_lastname() throws Throwable {
		sendkeys(bh.getLastname(), "bosco");
	   
	}

	@When("^user enter address$")
	public void user_enter_address() throws Throwable {
		sendkeys(bh.getAddress(), ("st.Donbosco(street)Ayandur.villupuram(dt)605-755"));
	  
	}

	@When("^user enter credit card no$")
	public void user_enter_credit_card_no() throws Throwable {
		sendkeys(bh.getCc_num(), "1234567890098765");
	   
	}

	@When("^user enter credit card type$")
	public void user_enter_credit_card_type() throws Throwable {
		DropDown(bh.getCc_type(), "value", "VISA");
	    
	}

	@When("^user select expiry month$")
	public void user_select_expiry_month() throws Throwable {
		DropDown(bh.getCc_exp_month(), "value", "4");
	    	}

	@When("^user select expiry year$")
	public void user_select_expiry_year() throws Throwable {
		DropDown(bh.getCc_exp_year(), "value", "2021");
	    	}

	@When("^user enter cvv number$")
	public void user_enter_cvv_number() throws Throwable {
	   sendkeys(bh.getCc_cvv(), "1234");
	}

	@Then("^click booknow$")
	public void click_booknow() throws Throwable {
		click(bh.getBook_now());
	}
}
