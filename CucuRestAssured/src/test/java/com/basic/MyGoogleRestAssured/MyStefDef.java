package com.basic.MyGoogleRestAssured;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyStefDef {
	
	Response res;
	
	@Given("google have website")
	public void google_have_website()
	{
		System.out.println("yes");
	}

	@When("I hit google application")
	public void I_hit_google_application()
	{
		res=RestAssured.get("https://google.com");
	}
	
	@Then("I validate status code")
	public void I_validate_status_code()
	{
		int actualStatCode=res.getStatusCode();
		System.out.println("actualStatusCode = "+actualStatCode);
		Assert.assertTrue(200==actualStatCode);
	}
	
//	@Given("F1 circuit have website")
//	public void F1_circuit_have_website()
//	{
//		System.out.println("yes");
//	}
//
//	@When("I hit F1 application")
//	public void I_hit_F1_application()
//	{
//		res=RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
//	}
//	
//	@Then("I validate status")
//	public void I_validate_status()
//	{
//		int actualStatCode=res.getStatusCode();
//		System.out.println("actualStatusCode = "+actualStatCode);
//		Assert.assertTrue(200==actualStatCode);
//	}

}
