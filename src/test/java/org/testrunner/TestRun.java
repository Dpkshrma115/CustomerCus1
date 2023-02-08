package org.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.utilities.Cucumber_ExtentReport;
import org.utilities.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {".//Features/Customer.feature", ".//Features/Login.feature"},
glue = "org.stepdefinition",
tags= {"@reg , @smoke"},
//tags= {"@reg", "@sanity"}, 
//tags= {"~@retest, ~@epic10"},
//tags= {"~@retest", "~@epic10"}, 
dryRun = false,
monochrome = true,
plugin = {"pretty",
		"json:src\\test\\resources\\Reports\\JsonReports\\jsonreport.json",
		"html:src\\test\\resources\\Reports\\HtmlReport",
		"junit:src\\test\\resources\\Reports\\JunitReport\\report.xml",
		"rerun:src\\test\\resources\\Reports\\FailedScenarios\\failedscenario.txt"  
		}
)


public class TestRun {
	
	@BeforeClass
	public static void before() { 
		Cucumber_ExtentReport.startReport("C:\\Users\\sharm\\eclipse-workspace\\CucumberCus\\src\\test\\resources\\ExtentReport\\CustomerExtent.html");
	  
	}
	  
	public static void  report() {
		JVMReport.generateJVMReport("src\\test\\resources\\Reports\\JsonReports\\jsonreport.json");
		System.out.println("The report has been generated");
		Cucumber_ExtentReport.endReport();
	}

}
