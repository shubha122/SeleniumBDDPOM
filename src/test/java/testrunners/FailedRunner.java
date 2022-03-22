package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"@target/failedscenarios.txt"},
		glue = {"stepdefinitions","AppHooks"},
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"rerun:target/failedscenarios.txt"
				}
			) 
public class FailedRunner {

}
