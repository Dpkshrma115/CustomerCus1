package org.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(id = "Password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(linkText = "Logout")
	@CacheLookup
	WebElement lnkLogout;

	public WebDriver getDriver() {
		return driver;
	}

	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);

	}

	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}

	public void clickLogout() {
		lnkLogout.click();
	}
}

/*
 * public void setDriver(WebDriver driver) { this.driver = driver; }
 * 
 * public WebElement getTxtEmail() { return txtEmail; }
 * 
 * public void setTxtEmail(WebElement txtEmail) { this.txtEmail = txtEmail; }
 * 
 * public WebElement getTxtPassword() { return txtPassword; }
 * 
 * public void setTxtPassword(WebElement txtPassword) { this.txtPassword =
 * txtPassword; }
 * 
 * public WebElement getBtnLogin() { return btnLogin; }
 * 
 * public void setBtnLogin(WebElement btnLogin) { this.btnLogin = btnLogin; }
 * 
 * public WebElement getLnkLogout() { return lnkLogout; }
 * 
 * public void setLnkLogout(WebElement lnkLogout) { this.lnkLogout = lnkLogout;
 * }
 */


