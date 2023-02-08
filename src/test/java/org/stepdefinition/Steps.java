package org.stepdefinition;


 
import org.apache.logging.log4j.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.pageobject.AddCustomer;
import org.pageobject.LoginPage;
import org.pageobject.PageObjectManager;
import org.pageobject.SearchCustomer;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
@Test
public class Steps extends BaseClass {

	 LoginPage l;
	 AddCustomer addc;
     SearchCustomer scus;
     public static Logger logger= LogManager.getLogger(Steps.class.getName());
    // static PageObjectManager page;
@Given("User launch chrome browser")
public void user_launch_chrome_browser() {
	System.out.println("The browser is launched from hooks class"); 
	logger.info("The browser is launched");
}

@When("User opens URL {string}")
public void user_opens_URL(String URL) {
	// adding logs

	urlLaunch(URL);
	l= new LoginPage(driver);
	addc = new AddCustomer(driver);
	scus = new SearchCustomer(driver);
	/*page= PageObjectManager.getPageManager();
	l = page.getLoginPage();
	addc = page.getAddCustomer();
	scus= page.getSeachCustomer();*/
	logger.info("The user has opened the url");
}

@When("User enters Email as {string} and Password as {string}")
public void user_enters_Email_as_and_Password_as(String email, String pass) {
logger.info("-------Url Has been successfully---------");
	l.setUserName(email);
	l.setPassword(pass);

}

@When("Click on Login button")
public void click_on_Login_button() {
	l.clickLogin();
}

@Then("User can view the Dashboard")
public void user_can_view_the_Dashboard() {
	Assert.assertEquals("Dashboard / nopCommerce administration", driver.getTitle());
	logger.info("---------------User successfully signed in-------------------");
}

@When("User click on customer menu")
public void user_click_on_customer_menu() throws InterruptedException {
	Thread.sleep(3000);

	// addc.clickOnCustomerMenu();

	driver.findElement(By.xpath("(//li[contains(@class,\"nav-item has-treevi\")])[4]")).click();
}

@When("User click on Customer Menu item")
public void user_click_on_Customer_Menu_item() {
	//addc.clickonCustomermenuItem();
			driver.findElement(By.xpath("(//a[@class=\"nav-link\"])[22]")).click();
		}


@When("click on Add new button")
public void click_on_Add_new_button() {
	logger.info("---------Adding new customer-------------------------");
	//addc.clickAddUser();
			driver.findElement(By.xpath("//a[@class=\"btn btn-primary\"]")).click();
    }

@Then("user can view Add new customer page")
public void user_can_view_Add_new_customer_page() {
	Assert.assertEquals("Add a new customer / nopCommerce administration", driver.getTitle());

}

@When("user enter customer info")
public void user_enter_customer_info() {
	logger.info("------------Typing in the customer details----------------------");
	addc.email(randomString(8) + "@gmail.com");
	addc.password("12345rfgt");
	addc.firstName("Deepak");
	addc.lastName("Sharma");
	addc.gender("male");
	addc.TxtDateofBirth("10/11/1995");
	addc.typeCompanyName("Sharma.net");
	addc.taxExemptOption();
	addc.newsletter("test store2");
	addc.customerRoles("Administrators");
	addc.setManagerVendor("Vendor 2");
	addc.adminComment("The page info is complete");

}

@When("click on save button")
public void click_on_save_button() {
	logger.info("----------------New user added------------------");
	addc.save();
   }

@Then("User can view conformation message {string}")
public void user_can_view_conformation_message(String string) {
	//Assert.assertTrue(driver.findElement(By.tagName("title")).getText().contains(string));
	Assert.assertEquals(string, driver.getTitle());
}

@Then("Close browser")
public void close_browser() {
    System.out.println("The browser not closed yet");
}

@When("Enter customer email id")
public void enter_customer_email_id() throws InterruptedException {
	logger.info("------------Finding user by email id----------------------");
	 scus.emailid("victoria_victoria@nopCommerce.com");  
}

@When("click on search button")
public void click_on_search_button() throws InterruptedException {
	 scus.clickSearch();
	    Thread.sleep(3000);
}

@Then("User should be able to find email in search table")
public void user_should_be_able_to_find_email_in_search_table() throws InterruptedException {
	 boolean status=scus.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
	   System.out.println(status);
	   Thread.sleep(15000);

}

@When("User type first name")
public void user_type_first_name() {
	logger.info("-----------Finding user by name-----------------------");
	scus.firstName("Victoria");
}

@When("User type last name")
public void user_type_last_name() {
	scus.lastName("Terces");
}

@Then("User should be able to find customer by name")
public void user_should_be_able_to_find_customer_by_name() {
	   boolean status=scus.searchCustomerByUsername("Victoria Terces");
	   Assert.assertEquals(true, status); 
	   System.out.println(status);
}

@Then("Page title should be {string}")
public void page_title_should_be(String title) {
	if (driver.getPageSource().contains("Login was unsuccessful")) {
		driver.close();
	} else {
		System.out.println("The test is ok");
	}
}

@When("User click on the logout link")
public void user_click_on_the_logout_link() {
  l.clickLogout();
}



}
