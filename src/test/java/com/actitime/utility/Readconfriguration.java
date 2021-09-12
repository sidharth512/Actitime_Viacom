package com.actitime.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Readconfriguration {
	Properties pro;
	public Readconfriguration (){
	
	try {
		File src=new File("./Confriguction\\congfig.propertiesfile");
		
		FileInputStream fis = new FileInputStream(src);
		pro=new Properties(); 
		pro.load(fis);

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		
	}
	public String getApplicationUrl() {
	String url=pro.getProperty("Baseurl");
	return url;
	
	}
	public String getusername() {
		String username=pro.getProperty("username");
		return username;
		
	}
	public String getPassword() {
	String	password= pro.getProperty("password");
	return password;
	}
	public String getChromeDriver() {
		String	chromepath= pro.getProperty("chromepath");
		return chromepath;
		}
	public String getIeDriver() {
		String edgepath=pro.getProperty("edgepath");
		return edgepath;
	}
	
}
	
	
