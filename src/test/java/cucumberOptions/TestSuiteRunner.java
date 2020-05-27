package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/features",
		glue = "stepDefinitions", tags="@Selenium", monochrome=true,
		plugin= {"pretty","html:target/TestSuiteRunner","json:target/TestSuiteRunner.json","junit:target/TestSuiteRunner.xml"})

public class TestSuiteRunner {

}
