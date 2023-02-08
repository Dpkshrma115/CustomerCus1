package org.utilities;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
//public static void main(String[] args) {
//	System.out.println(System.getProperty("user.dir")+"\\src\\test");
//}
public static void generateJVMReport(String json) {
	//File Location
	File loc = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JsonReports");
	
	// File Configuration
	Configuration con = new Configuration(loc,"Customer");
	con.addClassifications("Browser Name", "Chrome");
	con.addClassifications("Browser Version", "106");
	con.addClassifications("OS Name", "Windows 11");
	con.addClassifications("Environment", "QA");
	con.addClassifications("SprintJVM", "20");
	
	//ReportBuilder
	List<String> jsonFiles= new LinkedList<String>();
	jsonFiles.add(json);
	ReportBuilder r =new ReportBuilder(jsonFiles, con);
			r.generateReports();
	
}
}