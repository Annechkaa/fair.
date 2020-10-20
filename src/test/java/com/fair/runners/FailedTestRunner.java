package com.fair.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/fair/step_definitions",
        features = "@target/rerun.txt",
        plugin = {
                "html:target/failed-default-report",
                "json:target/failed_report.json",
        }
)
public class FailedTestRunner {
}
