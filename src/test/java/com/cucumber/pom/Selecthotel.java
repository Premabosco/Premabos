package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel {
	public static WebDriver driver;
	
	
	
	public Selecthotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(name = "radiobutton_0")
	private WebElement radiobutton_0;
	
	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}


	@FindBy(name = "continue")
	private WebElement continuebtn;
	

	
	
	
	
	
	
	
	
	
	
	

}
