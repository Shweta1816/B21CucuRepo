package com.basic.useOfBackgroundKey;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyBackgroundKeySD {
	
	/*Background key in cucumber is used to define a step or series of steps 
	 * that are common to all the tests in the feature file. It runs
	 * before each and every scenario were for a feature in which it is defined.
	
*/
	@Given("^I navigate to Login Page$")
	public void i_navigate_to_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am at the Login page");
	}

	@Then("^I submit username and password$")
	public void i_submit_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I submit username and password");
	}

	@Then("^I should be logged in$")
	public void i_should_be_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am logged into the website");
	}

	@Given("^User search for Sony TV$")
	public void user_search_for_Sony_TV() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Searched for Sony TV");
	}

	@Then("^Add the first product to User basket$")
	public void add_the_first_product_to_User_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Add Sony TV to user basket");
		System.out.println();
		
	}

	@Given("^User search for Iphone$")
	public void user_search_for_Iphone() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Search for Iphone");
	}

	@Then("^Add the second product to User basket$")
	public void add_the_second_product_to_User_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Add Iphone 7 to the user basket");
	}


//	@Given("User search for Iphone$")
//	public void user_search_for_Iphone(int arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Search for Iphone");
//	}
//
//	@Then("Add the second product to User basket$")
//	public void add_the_second_product_to_User_basket() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Add Iphone 7 to the user basket");
//	}

		
		
	

}
