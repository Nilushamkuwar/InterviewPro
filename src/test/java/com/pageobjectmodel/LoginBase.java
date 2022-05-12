package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.practice.utility.commanUtility;

public class LoginBase extends LoginTest
{


	WebDriver driver;
	
  
  public LoginBase(WebDriver driver) 
  {
	 this.driver=driver; 
  }
  
  @FindBy(xpath =  "//*[@id=\"txtEmail\"]")
   WebElement email;
  
  @FindBy(xpath = "//*[@id=\"txtPassword\"]")
  WebElement passw;
  
  @FindBy(xpath = "//*[@id=\"chkAutoLogin\"]")
  WebElement rem;
  
  @FindBy(xpath = "//*[@id=\"lblLogin\"]")
  WebElement sign;
  
  public LoginBase()
  {
	 PageFactory.initElements(commanUtility.driver, this); 
  }
  
  public String validateLoginPageTitle()
  {
	  return commanUtility.driver.getTitle();
  }
  public HomePage login(String em , String pm)
  {
	  email.sendKeys(em);
	  passw.sendKeys(pm);
	  rem.click();
	  sign.click();
	  
	  return new HomePage();
	  
 }
  
}


