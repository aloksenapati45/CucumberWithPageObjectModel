package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features",
                 glue={"steps"},
                 tags = "@FindNewCar or @UsedCar",
                 plugin ={"html:target/cucumber-report/cucumber-html-report.html"})
public class RunCuke extends AbstractTestNGCucumberTests {}
