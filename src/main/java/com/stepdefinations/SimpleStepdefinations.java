package com.stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SimpleStepdefinations {

	@Given("Open the Chrome Browser")
	public void open_the_Chrome_Browser() {
		System.out.println("Chrome browser is open.......");
	}

	@Then("Enter the URL")
	public void enter_the_URL() {
		System.out.println("URL is entered........");
	}

	@Then("Enter valid login Credentials")
	public void enter_valid_login_Credentials() {
		System.out.println("Valid Credentials is entered......");
	}

	@Then("check for the Homepage")
	public void check_for_the_Homepage() {
		System.out.println("Directed to home page......");
	}

}
