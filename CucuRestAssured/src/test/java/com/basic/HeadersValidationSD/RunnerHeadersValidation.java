package com.basic.HeadersValidationSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/basic/HeadersValidationFF/"},
		glue={"com/basic/HeadersValidationSD/"}, monochrome=true,
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report22711.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		}

		
		)

public class RunnerHeadersValidation {

	public RunnerHeadersValidation() {
		// TODO Auto-generated constructor stub
	}

}
