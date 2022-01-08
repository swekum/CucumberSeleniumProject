package testrunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        publish = true,
        features = {"src/test/resources/com.features/LoginPage.feature"},
        glue = {"StepDefinition" , "AppHooks"},
        plugin = {"pretty",
        "json:target/MyReports/report.json",
        "junit:target/MyReports/report.xml",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
//        tags = "@smoke",
        monochrome = false,
        dryRun = false

)

public class LoginTest {
}
