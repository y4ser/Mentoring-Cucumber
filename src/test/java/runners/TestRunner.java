package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/T01_arithmetic.feature",
        glue = "stepdefinitions",
        tags = "@Arithmetic",
        dryRun = false,
        plugin = {"pretty"}
)

public class TestRunner {
}
