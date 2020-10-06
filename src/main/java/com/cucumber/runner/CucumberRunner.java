package com.cucumber.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features",glue = {"com\\stepdefinations"},tags= {"@sanity and @smoke"},
 plugin= {"pretty","html:target/Reports"} )
//@CucumberOptions(features = "src\\test\\resources\\Features",glue = {"com\\stepdefinations"})
public class CucumberRunner  {
	
	

}
