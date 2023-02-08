package org.utilities;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.core.api.Scenario;
import io.cucumber.core.event.Status;

public class Cucumber_ExtentReport extends BaseClass {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentHtmlReporter htmlReport;
	static ExtentSparkReporter sparkReport;

	public static void startReport(String loc) {
		// Extent report object
		report = new ExtentReports();
		// Project details
		report.setSystemInfo("Browser Name", "Chrome");
		report.setSystemInfo("Browser Version", "105");
		report.setSystemInfo("OS", "Windows 11");
		report.setSystemInfo("Environment", "QA");
		report.setSystemInfo("SprintExtent", "20");
		// Report location
		htmlReport = new ExtentHtmlReporter(loc);
		// Basic configuration

		htmlReport.config().setDocumentTitle("CustomerFile");
		htmlReport.config().setReportName("Customer");
		htmlReport.config().setTheme(Theme.STANDARD);

		// sparkReport location
		sparkReport = new ExtentSparkReporter(loc);
		// Basic configuration

		sparkReport.config().setDocumentTitle("CustomerFile");
		sparkReport.config().setReportName("Customer");
		sparkReport.config().setTheme(Theme.STANDARD);

		// Attach configuration to the report generation
		
		report.attachReporter(sparkReport);

	

	}

	public static void createTestLog(Scenario sc) {
		String name = sc.getName();
		System.out.println("Scenario name is :"+ name);
		Status status = sc.getStatus();
		System.out.println("The status of the scenario is :" + status );
		String base64code = captureScreenshot();
		String path = captureScreenshot(name);

		switch (status) {
		case PASSED:
			report.createTest(name).pass("The test case passed").addScreenCaptureFromBase64String(base64code, name);
			break;

		case FAILED:
			try {
				report.createTest(name).fail("The test case failed").addScreenCaptureFromPath(path, name);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			break;

		default:

			report.createTest(name).skip("The test case skipped").addScreenCaptureFromBase64String(base64code, name);
			break;
             
		}
		/*
		 * if(status==Status.PASSED) {
		 * report.createTest(name).pass("The test case passed"); } else
		 * if(status==Status.FAILED) {
		 * report.createTest(name).fail("The test case failed");
		 * 
		 * 
		 * } else { report.createTest(name).skip("The test case skipped"); }
		 */
	}

	public static void endReport() {
		report.flush();
	}

}
