package testrunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        publish = false,
        features = {"src/test/resources/features/Search.feature"},
        glue = {"StepDefinition"},
        plugin = {"pretty",
        "json:target/MyReports/report.json",
        "junit:target/MyReports/report.xml"},
        tags = "@smoke",
        monochrome = false,
        dryRun = false

)

public class ProductTest {
}
