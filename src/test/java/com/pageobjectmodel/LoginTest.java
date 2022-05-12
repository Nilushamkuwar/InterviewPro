package com.pageobjectmodel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import com.practice.utility.commanUtility;



public class LoginTest 
{
	 
	public static Properties prop;
	
	public LoginTest ()
	{
	     try
	     {
	    	 prop =new Properties();
	    	 FileInputStream fs= new FileInputStream("src//test//resources//Comma100.properties");
				prop.load(fs);
	     }
	     catch(IOException e)
	     {
	    	 e.getMessage();
	     }
	  }


  public static void initialization()

  {
	  String browserName= prop.getProperty("browser");
	  
	  if(browserName.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		  commanUtility.driver= new ChromeDriver();
		  
	  }
	  else  if(browserName.equals("IE"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Documents\\IE\\IEDriverServer.exe");
		  commanUtility.driver= new InternetExplorerDriver(); 
	  }
	  
	  commanUtility.driver.manage().window().maximize();
	  commanUtility.driver.get(prop.getProperty("url"));
  }
}

