package org.stepdefinition;

import org.base.BaseClass;
import org.face.FacePojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucum extends BaseClass {
	FacePojo f;
	@Given("To launch the chrome browser and maxmize window")
	public void to_launch_the_chrome_browser_and_maxmize_window() {
		launchBrowser();
		windowMaximize();
	   }

	@When("To launch the url of facebook application")
	public void to_launch_the_url_of_facebook_application() {
	   launchUrl("https://en-gb.facebook.com/");
	}

	@When("To pass the valid username in email field")
	public void to_pass_the_valid_username_in_email_field() {
		f = new FacePojo();
		passText("r.prakashraj00", f.getEmail());
	   	}

	@When("To pass the valid password in password field")
	public void to_pass_the_valid_password_in_password_field() {
		f = new FacePojo();
		passText("Praku2000", f.getPassword());
	   	}

	@When("To click the Login button")
	public void to_click_the_Login_button() {
		f = new FacePojo();
		clickBtn(f.getLogin());
		
	   	}

	@Then("To close the  browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	   	}



}
