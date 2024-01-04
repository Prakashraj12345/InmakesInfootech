package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.junit.Before;
import org.link.LinkedPojo;

import io.cucumber.datatable.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Rock extends BaseClass{
	LinkedPojo l;
	@Given("To launch the browser and maxmize the window")
	public void to_launch_the_browser_and_maxmize_the_window() {
		launchBrowser();
		windowMaximize();
	
	}

	@When("To launch the url of amazon application")
	public void to_launch_the_url_of_amazon_application() {
	launchUrl("https://in.linkedin.com/");
	}
   
	@When("To enter email in email text box")
	public void to_enter_email_in_email_text_box(DataTable d) {
	    Map<String , String> m = d.asMap(String.class , String.class);
		l = new LinkedPojo();
		passText(m.get("email2"), l.getEmail());
	
	}

	@When("To enter the password in password text box")
	public void to_enter_the_password_in_password_text_box(DataTable d) {
     List<Map<String, String>> m = d.asMaps();
     l = new LinkedPojo();
     passText(m.get(1).get("password2"), l.getPassword());
     
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		

	}



}
