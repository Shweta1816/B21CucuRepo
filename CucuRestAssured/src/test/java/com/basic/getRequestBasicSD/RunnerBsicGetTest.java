package com.basic.getRequestBasicSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//this feature format will run all the feature file present in MyGoogleRestAssured package
		features= {"src/test/resources/com/basic/getRequestBasicFF/ValidateGetRequest.feature"},
		glue= {"com/basic/getRequestBasicSD/"},   // run java files
		monochrome=true
		
		/*features={"src/test/resources/com/basic/MyGoogleRestAssured/MyFeature.feature,
		"src/test/resources/com/basic/MyGoogleRestAssured/MyFeature1.feature"} */
		)

public class RunnerBsicGetTest {

	
}
