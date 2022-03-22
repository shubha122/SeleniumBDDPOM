package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = {"src/test/resources/com/features/LoginPage.feature"},
		glue = {"stepdefinitions","AppHooks"},
		plugin = {"pretty"	}
			) 
public class MySerenityTestRunner {
}
