package com.actitime.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.actitime.utility.Readconfriguration;

public class LoginBaseClass {
	Readconfriguration readconfi=new Readconfriguration();
	public String Baseurl=readconfi.getApplicationUrl();
	public String username=readconfi.getusername();
	public String password=readconfi.getPassword();
    public WebDriver driver;
		
     @Parameters("browser")
		
		@BeforeClass
		public void setup(String br) throws InterruptedException
		{
		
			if(br.contains("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", readconfi.getChromeDriver());
			driver=new ChromeDriver();
			}

 		else if(br.equalsIgnoreCase("edge"))
 		{
 			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
 			driver=new EdgeDriver();
 		} 
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get(Baseurl);
			
			
		}
		
	
		
		@AfterMethod
		public void teardown()
		{
			//driver.quit();
		}
		public void capturescreen(WebDriver driver,String tname) throws IOException {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			File target = new File(".\\ScreenShots\\"+tname+".png");
			FileUtils.copyFile(source, target);
			System.out.println("screenshorttaken");
			
		}
}	
   
    	  
    	  
    	  
	

		
	

