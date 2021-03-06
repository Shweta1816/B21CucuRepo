package com.basic.MyGoogleRestAssured;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//this feature format will run all the feature file present in MyGoogleRestAssured package
		features= {"src/test/resources/com/basic/MyGoogleRestAssured/MyFeatureFileSele.feature"},
		glue= {"com/basic/MyGoogleRestAssured"},   // run java files
		monochrome=true
		
		/*features={"src/test/resources/com/basic/MyGoogleRestAssured/MyFeature.feature,
		"src/test/resources/com/basic/MyGoogleRestAssured/MyFeature1.feature"} */
		)
public class RunnerSeleCucu {
	
}
