package testRun;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Specify the path to your feature files
    glue = "stepdefinition",
    plugin = {"pretty", "html:target/cucumber-reports"} // Optional: Specify the plugin for report generation
)
public class testRunClass {

}