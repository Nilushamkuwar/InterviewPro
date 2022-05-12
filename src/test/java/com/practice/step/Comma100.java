package com.practice.step;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;

import com.pageobjectmodel.HomePage;
import com.pageobjectmodel.LoginBase;
import com.pageobjectmodel.LoginTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Comma100 extends LoginTest
{
	   

	
		@Given("^open browser $")
		public void open(String browser)
		{
	        LoginTest.initialization();
		}
		
		@When("^user enter email and pass$")
		public void loginpad()
		{
			LoginBase loginBase = new LoginBase();

			loginBase.login(prop.getProperty("email"), prop.getProperty("passw"));
			
			
		}
		

	}

