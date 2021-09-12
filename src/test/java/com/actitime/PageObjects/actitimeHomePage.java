package com.actitime.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimeHomePage {
	WebDriver driver;

@FindBy(xpath="//div[.='Tasks']")
private WebElement TasksLink;
@FindBy(xpath="//div[.='Reports']")
private WebElement ReportsLink;
@FindBy(xpath="//div[@id=\"container_users\"]")
private WebElement UsersLink;
@FindBy(xpath="//div[contains(@onclick,\"('#popup_menu_calendar'))\")]")
private WebElement popupmenucalendar;
@FindBy(xpath="//div[contains(@onclick,\"('#popup_menu_settings'))\")]")
private WebElement popupmenusettings;
@FindBy(id="popup_menu_button_addons")
private WebElement popupmenubuttonaddons;
@FindBy(xpath="//div[contains(@onclick,\"openHelpAndSupportMenu\")]")
private WebElement openHelpAndSupportMenu;
@FindBy(xpath="//div[contains(@class,\"popup_menu_icon tips_icon_light_on\")]")
private WebElement popupmenuicontipsiconlighton;
@FindBy(id="logoutLink")
private WebElement logoutbuttonofHomepage;
@FindBy(xpath="//a[contains(@class,\"userProfileLink \")]")
private WebElement userProfileLinkofHomepage ;

public actitimeHomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
	
}
public void homepageTaskmethod() {
	TasksLink.click();
	
}
public void homepagesettingmethod() {
	JavascriptExecutor	js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click()", popupmenusettings );
}
public void Homepagelogoutmethod() {
	logoutbuttonofHomepage.click();	
}
}
