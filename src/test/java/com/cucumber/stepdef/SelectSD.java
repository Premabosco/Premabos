package com.cucumber.stepdef;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

import org.openqa.selenium.WebDriver;

import com.cucumber.pom.Selecthotel;
import com.cucumber.project.Cucumber1.Baseclass;
import com.cucumber.runner.Runner;

import cucumber.api.java.en.When;

public class SelectSD extends Baseclass {
	public static WebDriver driver=Runner.driver;
	
	Selecthotel sh = new Selecthotel(driver);
	

@When("^click the radiobtn$")
public void click_the_radiobtn() throws Throwable {
	click(sh.getRadiobutton_0());
	
}

@When("^click the continue$")
public void click_the_continue() throws Throwable {
	click(sh.getContinuebtn());
	
}


}
