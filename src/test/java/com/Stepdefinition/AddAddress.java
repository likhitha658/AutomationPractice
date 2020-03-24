package com.Stepdefinition;

import java.io.IOException;

import com.pages.AddNewAddress;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddAddress {

	AddNewAddress add=new AddNewAddress();
	
	@Given("^launch the chrome browser$")
	public void user_launch_the_chrome_application() {
	    // Write code here that turns the phrase above into concrete actions
		add.url();
		
	}

	@When("^the user logged in to the home page and signin$")
	public void the_user_loggedin_to_the_home_page() throws IOException, InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		add.LoginDeatils();
		
	}

	@Then("^click on my address button and navigate to next page$")
	public void the_user_search_the_product() throws InterruptedException, IOException  {
	    // Write code here that turns the phrase above into concrete actions
		add.myAddress();
	}

	@Then("^click on add new address and fill the mandatory details and save$")
	public void click_on_down_arrow_and_enter_key_the_user_get_the_searching_products() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		add.addAddress();
		
	}
}
