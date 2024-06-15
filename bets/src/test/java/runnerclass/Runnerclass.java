package runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features ="src/test/java/featurefile/Loginfeature.feature",
glue ="stepdefinition",
tags="@taskcreation or @ProjectEnquiry or @Strategyhub",
plugin = { "html:target/cucumber-reports.html", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" })
public class Runnerclass {

}
