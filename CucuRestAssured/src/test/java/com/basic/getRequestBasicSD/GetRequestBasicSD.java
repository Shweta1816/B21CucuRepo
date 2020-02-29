package com.basic.getRequestBasicSD;


import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestBasicSD {

		Response res;
		
		@Given("^race circuite application is running$")
		public void race_circuite_application_is_running()
		{
			System.out.println("application ready to use");   
			
		}

		@When("^I hit get request to get response$")
		public void i_hit_get_request_to_get_response()
		{
			res=RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
			String actualData=res.getBody().asString();
			System.out.println("Data = "+actualData);
		}

		//to test dynamic value from feature file using regular expression
		@Then("^I validate circuite \"([^\"]*)\" value as \"([^\"]*)\" present$")
		public void i_validate_circuite_limit_value(String jPath, String valueTobeValidated)
		{
		   String attriValue=res.body().jsonPath().getString(jPath);
		   Assert.assertTrue(attriValue.equals(valueTobeValidated));
				   
		}


		@Then("^I validate Circuite Id value as americas$")
		public void i_validate_Circuite_Id_value_as_americas()
		{
			String totalValue=res.body().jsonPath().getString("MRData.total");
			int totalIntVal=Integer.parseInt(totalValue);
			
			for (int i = 0; i < totalIntVal; i++)
			{
				 String circuitIdValue=res.body().jsonPath().getString("MRData.CircuitTable.Circuits[1].circuitId"); // as Circuits is array
				 if(circuitIdValue.equals("americas"))
				 {
					   Assert.assertTrue(circuitIdValue.equals("americas"));
					   break;
				}else{
					if(i==totalIntVal-1)
					{
						   Assert.assertTrue(false);

					}
				}
			}
		}

		@Then("^I validate total value$")
		public void i_validate_total_value()
		{
		   String totalValue=res.body().jsonPath().getString("MRData.total");
		   Assert.assertTrue(totalValue.equals("20"));
				   
		}

	
	}
//framework is a rule and guideline for testing and wrting your scripts
