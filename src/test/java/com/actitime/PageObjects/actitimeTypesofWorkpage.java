package com.actitime.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimeTypesofWorkpage {
@FindBy(xpath=("//span[.='Create Type of Work']"))
private WebElement CreateTypeofWorkButton;
@FindBy(xpath=("//input[@onclick=\"filterTypes()\"]"))
private WebElement ShowtypeofworkButton;
public actitimeTypesofWorkpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void NewTypeofWorkMehod() {
	CreateTypeofWorkButton.click();
}


}
