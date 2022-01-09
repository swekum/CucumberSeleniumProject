package testrunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        features = {"src/test/resources/parallel"},
        glue = {"parallel"},
        plugin = {"pretty",
                "json:target/MyReports/report.json",
                "junit:target/MyReports/report.xml",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/"},
        tags = "@accounts",
        monochrome = false,
        dryRun = false

)
public class ParallelRun extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
