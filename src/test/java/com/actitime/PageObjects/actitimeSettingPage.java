package com.actitime.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimeSettingPage {
	WebDriver driver;
	@FindBy(xpath=("//a[.='Types of Work']"))
	private WebElement TypesofWorkLink;
	@FindBy(xpath=("//a[.='Workflow Settings']"))
	private WebElement WorkflowSettingsLink;
	@FindBy(xpath=("//a[.='Leave Types']"))
	private WebElement LeaveTypesLink;
	@FindBy(xpath=("//a[.='Notifications']"))
	private WebElement NotificationsLink;
	@FindBy(xpath=("//a[.='Logo Settings']"))
	private WebElement LogoSettingsLink;
	@FindBy(xpath=("//div[.='Turn Features On / Off']"))
	private WebElement TurnFeaturesLink;
	@FindBy(xpath=("//div[.='Licenses']"))
	private WebElement LicensesLink;
	public actitimeSettingPage  (WebDriver driver) 
	{ 
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}	 

   public void TypeofworkMethod() throws InterruptedException {
	   JavascriptExecutor	js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()", TypesofWorkLink );
	   
}
   public void LeaveTypeMethods() {
	   JavascriptExecutor	js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()",LeaveTypesLink  );

   }
	}
	


