package com.actitime.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimeLeavePage {
	@FindBy(id="ext-gen6")
	private WebElement CreateLeaveTypeLink;

	@FindBy(id="leaveTypeLightBox_nameField")
	private WebElement leaveTypeLightBoxnameField;
	@FindBy(xpath="(//span[.='Create Leave Type'])[2]")
	private WebElement CreateLeavetypeLink;
	public actitimeLeavePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void LeavePageMethod() {
		CreateLeaveTypeLink.click();
	}
		public void CreatLeaveMethod() {
		leaveTypeLightBoxnameField.sendKeys("PubgDay");
		CreateLeavetypeLink.click();
	}
	
}
