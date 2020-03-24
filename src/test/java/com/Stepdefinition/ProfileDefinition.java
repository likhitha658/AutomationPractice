package com.Stepdefinition;

import java.io.IOException;

import com.pages.ProfileDetails;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProfileDefinition {

	ProfileDetails profile = new ProfileDetails();

	@Given("^launch the chrome application$")
	public void launch_the_chrome_application() {
		// Write code here that turns the phrase above into concrete actions
		profile.url();
	}

	@When("^the user logged in to the home page$")
	public void the_user_logged_in_to_the_home_page() throws IOException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		profile.LoginDeatils();
	}

	@Then("^the user click the profile and get the profile email$")
	public void the_user_click_the_profile_and_get_the_profile_email() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		profile.search();
	}

}
