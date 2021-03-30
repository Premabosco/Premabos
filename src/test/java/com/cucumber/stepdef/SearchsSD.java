package com.cucumber.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SubmitElement;

import com.cucumber.pom.Searchpage;
import com.cucumber.project.Cucumber1.Baseclass;
import com.cucumber.runner.Runner;

import cucumber.api.java.en.*;

public class SearchsSD  extends Baseclass{
	

	public static WebDriver driver = Runner.driver;

	Searchpage sp = new Searchpage(driver);

	@Given("^user select the Location$")
	public void user_select_the_Location() throws Throwable {
		DropDown(sp.getLocation(),"value","New York");
		
	}

	@When("^user select the Hotels$")
	public void user_select_the_Hotels() throws Throwable {
		DropDown(sp.getHotels(),"value","Hotel Sunshine");
	}

	@When("^user select the Room Type$")
	public void user_select_the_Room_Type() throws Throwable {
	DropDown(sp.getRoom_typ(),"value","Super Deluxe");
	}

	@When("^user select the Number of Rooms$")
	public void user_select_the_Number_of_Rooms() throws Throwable {
		DropDown(sp.getRoom_nos(), "value", "3");
	}

	@When("^user select the Check In Date$")
	public void user_select_the_Check_In_Date() throws Throwable {
		sendkeys(sp.getDatepick_in(), "28/03/2021");
	}

	@When("^user select the Check Out Date$")
	public void user_select_the_Check_Out_Date() throws Throwable {
		sendkeys(sp.getDatepick_out(), "29/03/2021");
	}

	@When("^user select Adult Per Room$")
	public void user_select_Adult_Per_Room() throws Throwable {
		DropDown(sp.getAdult_room(), "value", "2");
	}

	@When("^user select the Children per Room$")
	public void user_select_the_Children_per_Room() throws Throwable {
		DropDown(sp.getChild_room(), "value", "1");
	}

	@Then("^click the Search$")
	public void click_the_Search() throws Throwable {
	
		click(sp.getSubmit());
	}

}
