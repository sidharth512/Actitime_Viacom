
package com.actitime.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.actitime.PageObjects.actitimeHomePage;
import com.actitime.PageObjects.actitimeLoginPage;
import com.actitime.utility.XLUtils;


public class TC_loginDDt_002 extends LoginBaseClass{
	@Test(dataProvider="LoginData")
public void loginDDT(String uname,String pwd) throws InterruptedException, IOException {
		actitimeLoginPage page=new actitimeLoginPage(driver);
		page.setUsername(uname);
		page.setPassword(pwd);;
		page.ClickSubmit();
		if(driver.getTitle().contains("actiTIME - Login")) {
			System.out.println("fail");
			driver.switchTo().defaultContent();
			
			
			
		}
		else {
			capturescreen(driver,"loginDDT");
			System.out.println("pass");
			actitimeHomePage logout=new actitimeHomePage(driver);
			logout.Homepagelogoutmethod();
			
		}
		
		
	}
	@DataProvider(name="LoginData")
	String[][]getData() throws IOException{
	String path="C:\\Users\\User 1\\Desktop\\ecplics\\actitime\\src\\test\\java\\com\\actitime\\testData\\loginData.xlsx";
	XLUtils Xlutil=new XLUtils(path);
	int totalrows=Xlutil.getRowCount("Sheet1");
	int totalcols=Xlutil.getCellcount("Sheet1",totalrows );
	String loginData[][]=new String [totalrows][totalcols];
	for(int i=1;i<= totalrows;i++) {
		for(int j=0;j<totalcols;j++) {
			loginData[i-1][j]=Xlutil.getCellData("Sheet1", i, j);
				
			}
		}
	
	
	
	return loginData;
	}
}
	/*
	 * @DataProvider(name="LoginData") String[][] getData() throws IOException{
	 * 
	 * String
	 * path="C:\\Users\\User 1\\Desktop\\ecplics\\actitime\\src\\test\\java\\com\\actitime\\testData\\loginData.xlsx"
	 * ; int rownum=XLUtils.getRowCount(path,"sheet1" ); int
	 * cellcount=XLUtils.getCellcount(path, "sheet1",rownum ); String
	 * loginData[][]=new String [rownum][cellcount]; for(int i=1;i<=rownum;i++) {
	 * for(int j=0;i<cellcount;j++) { String logindata=XLUtils.getCellData(path,
	 * "sheet1", i, j);
	 * 
	 * 
	 * } } return loginData; }
	 */
	
	


