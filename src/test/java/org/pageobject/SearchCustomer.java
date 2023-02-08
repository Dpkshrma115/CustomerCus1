package org.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class SearchCustomer {
	WebDriver driver;
	
	
	public SearchCustomer(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="SearchEmail")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="SearchFirstName")
	@CacheLookup
	WebElement txtFirstName;
	
	@FindBy(id="SearchLastName")
	@CacheLookup
	WebElement txtLastName;
	
	@FindBy(id="SearchMonthOfBirth")
	@CacheLookup
	WebElement drpMonth;
	
	@FindBy(id="SearchDayOfBirth")
	@CacheLookup
	WebElement drpDay;
	
	@FindBy(id="SearchCompany")
	@CacheLookup
	WebElement txtComapany;
	
	@FindBy(id="SearchIpAddress")
	@CacheLookup
	WebElement txtIPAddress;
	
	@FindBy(xpath="//div[@role=\"listbox\"]")
	@CacheLookup
	WebElement slctCustomerrole;
	
	@FindBy(id="search-customers")
	@CacheLookup
	WebElement srchbtn;
	
	@FindBy(xpath="//table[@id=\"customers-grid\"]/tbody/tr")
	@CacheLookup
	List<WebElement> tableRows;
	
	@FindBy(xpath="//table[@id=\"customers-grid\"]/tbody/tr/td")
	@CacheLookup
	List<WebElement> tableColumns;
	
	
	public void emailid(String a) throws InterruptedException {
		
		txtEmail.clear();
		txtEmail.sendKeys(a);
	}
	
	public void firstName(String a) {
		txtFirstName.sendKeys(a);
	}
	
	public void lastName(String a) {
		txtLastName.sendKeys(a);
	}
	public void month(String a) {
	Select month=new Select(drpMonth);
	month.selectByVisibleText(a);
	}
	
	public void day(String a) {
		Select day = new Select(drpDay);
		day.selectByVisibleText(a);
	}
	
	public void company(String a) {
		txtComapany.sendKeys(a);
	}
	public void ipAddress(String a) {
		txtIPAddress.sendKeys(a);
	}
	public void customerRole(String a) {
		slctCustomerrole.click();
		
		if(a.equals("Vendors")) {
			driver.findElement(By.xpath("(//li[@class=\"k-item\"])[4]")).click();
		}
		else if(a.equals("Guests")) {
			driver.findElement(By.xpath("(//li[@class=\"k-item\"])[3]")).click();
		}
		else if (a.equals("Administrators")) {
			driver.findElement(By.xpath("(//li[@class=\"k-item\"])[1]")).click();
		}
		else {
			driver.findElement(By.xpath("(//li[@class=\"k-item\"])[2]")).click();
		}
	}
	
	public void clickSearch() {
		srchbtn.click();
	}
	
	public int getNumberofRows() {
		int rowSize= tableRows.size();
		return rowSize;
	}   
	
	public int getNumberofColumns() {
		int columnSize= tableColumns.size();
		return columnSize;
	} 
	 public boolean searchCustomerByEmail(String email) {
		 boolean flag=false;
		 for(int i=1; i<=getNumberofRows();i++) {
		String emailid= driver.findElement(By.xpath("//table[@id=\"customers-grid\"]/tbody/tr["+i+"]/td[2]")).getText();
		System.out.println(emailid);
		if(emailid.equals(email)){
			flag=true;
		}
		 }
		return flag;
	 }
	 
	
	 public boolean searchCustomerByUsername(String uname) {
		 boolean flag=false;
		 for(int i=1; i<=getNumberofRows();i++) {
		String Username= driver.findElement(By.xpath("//table[@id=\"customers-grid\"]/tbody/tr[1]/td[3]")).getText();
		System.out.println(Username);
		String name[] = Username.split(" ");
		
		if(name[0].equals("Victoria")&& name[1].equals("Terces")){
			flag=true;
		}
		 }
		return flag;
	 }
	
	
	
}
