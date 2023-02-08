package org.pageobject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	//lazy instantiating of page objects.
	static	AddCustomer addcus;
	static LoginPage login;  
	static	SearchCustomer scus; 
	static PageObjectManager manager;
	
	//Importing webdriver
	 static WebDriver driver;
	 // private constructor so multiple instances of objects cannot be instantiated outside the class
	 private PageObjectManager(){
		 
	 }
	 
	 // Creating the method public so it can be accessed outside the class
	 
	 public static PageObjectManager getPageManager() {
		 if(manager==null) {
			 manager= new PageObjectManager();
		 }
		 return manager;
	 }
	 
	 public AddCustomer getAddCustomer() {
		
		return (addcus ==null)? addcus= new AddCustomer(driver):addcus;
	 }
	 public LoginPage getLoginPage() {
		
		 
		 return (login ==null)? login = new LoginPage(driver):login;
	 }
	 public SearchCustomer getSeachCustomer() {
		
		 return (scus == null)? scus = new SearchCustomer(driver): scus;
	 }

}
