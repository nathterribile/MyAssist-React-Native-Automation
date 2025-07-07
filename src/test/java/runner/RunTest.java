package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CAMELCASE,
        features = "src/test/resources/features",
        glue = {"steps"},
        tags = "@acessoAPP",
        monochrome = true,
//        dryRun = true,
        plugin = { "summary", "pretty", "json:target/jsonReports/cucumber-report.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)
public class RunTest {}
