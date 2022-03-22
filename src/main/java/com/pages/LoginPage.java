package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By emailId = By.id("formLogin:username");
	private By password = By.id("formLogin:password");
	private By signIn = By.id("formLogin:login_button");
	private By lostPwdLink = By.xpath("//*[text()='Lost your password?']");
	private By homePageHeader = By.xpath("//*[text()='Welcome on Fitnet Manager!!']");
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean isLostPasswordLInk() {
		return driver.findElement(lostPwdLink).isDisplayed();
	}
	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}
	public void enterPassword(String userPassword) {
		driver.findElement(password).sendKeys(userPassword);
	}
	public void clickSignIn() {
		driver.findElement(signIn).click();
	}
	public boolean getHomepageTitle() {
		return driver.findElement(homePageHeader).isDisplayed();
	}
	public HomePage doLogin(String un,String pwd) {
		enterUserName(un);
		enterPassword(pwd);
		clickSignIn();
		return new HomePage(driver);
	}
	
}
