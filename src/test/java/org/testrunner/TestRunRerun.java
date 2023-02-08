package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="@src\\test\\resources\\Reports\\FailedScenarios\\failedscenario.txt",
		glue="org.stepdefinition",
		plugin= {
		"pretty",
		"json:src\\test\\resources\\RerunReports\\JsonReports\\rejsonreport.json",
		"html:src\\test\\resources\\RerunReports\\HtmlReport",
		"junit:src\\test\\resources\\RerunReports\\JunitReport\\rereport.xml"
		})
public class TestRunRerun {
  

}
