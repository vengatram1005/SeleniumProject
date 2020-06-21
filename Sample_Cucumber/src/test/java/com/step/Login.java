package com.step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	@Given("^user is on facebook page$")
	public void user_is_on_facebook_page() throws Throwable {

		System.out.println("user is on facebook page");

	}

	@When("^user enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		System.out.println("user enters UserName and Password");

	}

	@Then("^user clicks login button$")
	public void user_clicks_login_button() throws Throwable {

		System.out.println("user clicks login button");

	}

	@Then("^user verify the home page$")
	public void user_verify_the_home_page() throws Throwable {

		System.out.println("user verify the home page");

	}

}
