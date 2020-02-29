package com.basic.MyGoogleRestAssured;

import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class NewF1StefDef {
	
	Response res;
	
	@When("I hit the F1 race application")
	public void i_hit_the_F_race_application() {
	    // Write code here that turns the phrase above into concrete actions
		res=RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
	}

	@Then("I validate the status code of F1 app")
	public void i_validate_the_status_code_of_F_app()  {
	    // Write code here that turns the phrase above into concrete actions
		int actualStatCode=res.getStatusCode();
		System.out.println("actualStatusCode = "+actualStatCode);
		Assert.assertTrue(200==actualStatCode);
	}

	@Then("I want F1 race data")
	public void i_want_F_race_data()  {
	    // Write code here that turns the phrase above into concrete actions
		String actualData=res.getBody().asString();
		System.out.println("Data = "+actualData);
		throw new PendingException();
	}


}
