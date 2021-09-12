package com.actitime.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeTaskPage {
	public WebDriver driver;
	@FindBy(xpath="//div[@class=\"title ellipsis\"]")
	private WebElement  Addnewdownlistbutton;
	@FindBy(xpath="//div[@class=\"item createNewCustomer\"]")
	private WebElement createNewCustomerLink;
	@FindBy(xpath="//div[@class=\"item createNewProject\"]")
	private WebElement createNewProjectLink;
	@FindBy(xpath="//div[@class=\"item createNewTasks\"]")
	private WebElement createNewTasksLink;
	@FindBy(xpath="//div[@class=\"item importTasks\"]")
	private WebElement itemimportTasksLink;
	@FindBy(xpath="//div[.='Export list to CSV']")
	private WebElement ExportlisttoCSVlink;
	@FindBy(xpath="//div[.='Configure columns']")
	private WebElement ConfigurecolumnsList;

	public actiTimeTaskPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void TaskPagemethod() {
		JavascriptExecutor	js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()", Addnewdownlistbutton );
		 createNewCustomerLink.click();
		 
    
	
      }

}