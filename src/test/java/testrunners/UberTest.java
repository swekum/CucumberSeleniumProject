package testrunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        publish = true,
        features = {"src/test/resources/features/Uber.feature"},
        glue = {"StepDefinition"},
        plugin = {"pretty"},
        tags="@smoke"

)

public class UberTest {
}
