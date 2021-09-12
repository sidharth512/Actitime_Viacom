package com.actitime.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimeLoginPage {

	@FindBy(id="username")
	private WebElement usernameTextfield;
	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement usernamePasswordTestfield;
	@FindBy(xpath="//input[@type=\"checkbox\"]")
	private WebElement keepmeloggedinCheckbox;
	@FindBy(xpath="//a[.='Login ']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement ForgotyourpasswordLink;
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;
	@FindBy(id="logoutLink")
	private WebElement logoutbuttonofHomepage;
	public actitimeLoginPage(WebDriver driver) 
	{ 
		PageFactory.initElements(driver,this);
	}	 
	public void setUsername(String username){
		usernameTextfield.clear();
		 usernameTextfield.sendKeys(username);
		
	}
	public void setPassword(String password){
		usernamePasswordTestfield.clear();
		usernamePasswordTestfield.sendKeys(password);
	}	
		public void ClickSubmit() throws InterruptedException{
			loginButton.click();
			Thread.sleep(5000);
	}
		public void Homepagelogoutmethod() {
			logoutbuttonofHomepage.click();	
}
}

