package com.basic.MyGoogleRestAssured;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefSeleCucu {

	WebDriver driver;

		@Given("Selenium dev have website")
		public void selenium_dev_have_website()
		{

			System.setProperty("webdriver.gecko.driver", "E:\\Selenium contents\\geckodriver-v0.18.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		
		}

		@When("^I go to the Selenium dev website$")
		public void i_go_to_the_Selenium_dev_website()
		{
			driver.get("https://selenium.dev/");

			System.out.println("Open selenium website");
		    // Write code here that turns the phrase above into concrete actions

		}

		@Then("^I want to check if Project Tab is present or not$")
		public void i_want_to_check_if_Project_Tab_is_present_or_not() throws InterruptedException
		{
			driver.findElement(By.xpath("//nav/a[contains(text(),'Projects')]")).click();
			Thread.sleep(2000);
			boolean result=true;
			String msg="";
			
			
			try{
				Thread.sleep(2500);
				driver.findElement(By.xpath("//nav/a[contains(text(),'Projects')]"));
			}catch(Exception e){
				System.out.println("Projects tab mimssing");
				result=false;
				msg=msg+" documentation tab missing";
			}
			//Assert.assertTrue(result, msg);
			Assert.assertTrue(result);
			
		}


	}


