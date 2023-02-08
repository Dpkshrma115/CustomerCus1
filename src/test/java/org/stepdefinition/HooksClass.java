package org.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.BaseClass;
import org.utilities.Cucumber_ExtentReport;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	@Before(order = 1)
	public void beforeScenario() {
		System.out.println("Before Scenario");

		edgeLaunch();

		driver.manage().window().maximize();
		implicitWait(10);
	}

	@After(order = 2)
	public void afterScenario1(Scenario sc){
		System.out.println("@After 2");
	
		Cucumber_ExtentReport.createTestLog(sc);
		implicitWait(10);

	}

	@After(order = 1)
	public void afterScenario() {
     driver.close();
		System.out.println("@After 1");
		
	}

}
