package testRun;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/main/java/feature/amazon.feature", // Specify the path to your feature files
    		publish =true,	
    glue = "stepdefinition",
    plugin = {"pretty", "html:target/cucumber-reports"} // Optional: Specify the plugin for report generation
)


public class amazonrunner {

}
