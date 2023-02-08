package org.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseClass;

public class AddCustomer  extends BaseClass {
	
public WebDriver driver;
	public AddCustomer(WebDriver driver) {
	driver=BaseClass.driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//li[contains(@class,\"nav-item has-treevi\")])[4]")
	@CacheLookup
	WebElement clkCustomer;
	
	@FindBy(xpath="(//a[@class=\"nav-link\"])[22]")
	@CacheLookup
	WebElement clkCustomer1;
	
	@FindBy(xpath="(//a[@class=\"btn btn-primary\"])")
	@CacheLookup
	WebElement clkAddUser;
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(id="FirstName")
	@CacheLookup
	WebElement txtFirstName;
	
	@FindBy(id="LastName")
	@CacheLookup
	WebElement txtLastName;
	
	@FindBy(id="Gender_Male")
	@CacheLookup
	WebElement btnMaleGender;
	
	@FindBy(id="Gender_Female")
	@CacheLookup
	WebElement btnFemaleGender;
	
	@FindBy(id="DateOfBirth")
	@CacheLookup
	WebElement txtDateOfBirth;
	
	@FindBy(id="Company")
	@CacheLookup
	WebElement txtCompany;
	
	@FindBy(xpath="(//input[@type=\"checkbox\"])[1]")
	@CacheLookup
	WebElement btnTaxExpmt;
	
	@FindBy(xpath="(//div[contains(@class,\"k-multiselect-wrap k-floatwr\")])[1]")
	@CacheLookup
	WebElement clickNewsletter;
	

	
	@FindBy(xpath="(//li[@role=\"option\"])[2]")
	@CacheLookup
	WebElement clickYourStoreName;
	
	@FindBy(xpath="(//li[@role=\"option\"])[3]")
	@CacheLookup
	WebElement clickTestStore2;
	
	@FindBy(xpath="(//div[contains(@class,\"k-multiselect-wrap k-floatwr\")])[2]")
	@CacheLookup
	WebElement clickCustomerRoles;
	
	@FindBy(xpath="//li[text()=\"Administrators\"]")
	@CacheLookup
	WebElement clickCustomerRolesAdministrators;
	
	@FindBy(xpath="//li[text()=\"Registered\"]")
	@CacheLookup
	WebElement clickCustomerRoleRegistered;
	
	@FindBy(xpath="//li[text()=\"Robot\"]")
	@CacheLookup
	WebElement clickCustomerRolesRobot;
	
	@FindBy(xpath="//li[text()=\"Sales Person\"]")
	@CacheLookup
	WebElement clickCustomerRolesSalePerson;
	
	@FindBy (id="VendorId")
	@CacheLookup
	WebElement clickMngrOfVendor;
	
	@FindBy(xpath="//option[text()=\"Vendor 1\"]")
	@CacheLookup
	WebElement clickMngrOfVendorVendor1;
	
	@FindBy(xpath="//option[text()=\"Vendor 2\"]")
	@CacheLookup
	WebElement clickMngrOfVendorVendor2;
	
	@FindBy(id="AdminComment")
    @CacheLookup
    WebElement txtAdminComment;
	
	@FindBy(name="save")
	@CacheLookup
	WebElement btnSave;
	
	//Action Methods
	
	public void clickOnCustomerMenu() {
		javascriptClick(clkCustomer);
	}
	
	public void clickonCustomermenuItem() {
		clkCustomer1.click();
	}
	public void clickAddUser() {
		clkAddUser.click();
	}
    public void email(String a) {
    	txtEmail.sendKeys(a);
    	
    }
    
    public void password(String a) {
    	txtPassword.sendKeys(a);
    	
    }
    
    public void firstName(String a) {
    	txtFirstName.sendKeys(a);
    	
    }
    public void lastName(String a) {
    	txtLastName.sendKeys(a);
    	
    }
    
    public void gender(String a) {
    	if(a.equals("male")) {
    		btnMaleGender.click();
    	}
    	else {
    		btnFemaleGender.click();
    	}
    	
    }
    
    public void TxtDateofBirth(String a) {
    	txtDateOfBirth.sendKeys(a);
    }
    
    public void typeCompanyName(String a) {
    	txtCompany.sendKeys(a);
    }
    
    public void taxExemptOption() {
    	btnTaxExpmt.click();
    }
    public void newsletter(String a) {
    	clickNewsletter.click();
    	
    	if(a.equals("yourstore")) {
    		clickYourStoreName.click();
    	}
    	else {
    		clickTestStore2.click();
    	}
    }
    
    public void customerRoles(String a) {
    	javascriptClick(clickCustomerRoles);
    	if(a.equals("Administrators")) {
    		javascriptClick(clickCustomerRolesAdministrators);
    	}
    	else if (a.equals("Registered")) {
    		javascriptClick(clickCustomerRoleRegistered);
    	}
    	else if(a.equals("Sales")) {
    		javascriptClick(clickCustomerRolesSalePerson);
    	}
    	else {
    		javascriptClick(clickCustomerRolesRobot);
    	}
    }
	
	
	public void setManagerVendor(String a) {
		Select drp = new Select(clickMngrOfVendor);
		drp.selectByVisibleText(a);
	}
    public void adminComment(String a) {
    	txtAdminComment.sendKeys(a);
    }
    
    	
    
	public void save() {
		btnSave.click();
	}
	


}
