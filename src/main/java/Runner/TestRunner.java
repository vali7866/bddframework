package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\veni\\eclipse-workspace\\amzone\\src\\main\\java\\Features\\login.Feature",
		glue= {"StepDefinitions"}
				
		)

public class TestRunner {

	
	
}
