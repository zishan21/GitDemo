package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/features/Login_Prerequisite.feature",
		glue = "stepDefinitions")

public class TestRunner_Prerequisite {

}
