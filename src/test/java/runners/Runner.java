package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@AddStudent",
        dryRun = false,
        plugin = {
                "html:reports/html-reports/cucumber.html",
                "json:reports/json-reports/cucumber.json",
                "junit:reports/xml-reports/cucumber.xml",
                "pretty",
                "rerun:target/failedScenarios.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" // For Spark report
        }

)
public class Runner {

}
