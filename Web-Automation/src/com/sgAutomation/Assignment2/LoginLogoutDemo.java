package com.sgAutomation.Assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {
	public static WebDriver oBrowser =null;
	public static ActiTimePage oPage = null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		logout();
		closeBrowser();
	}
	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\EXAMPLEAUTOMATION\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		oBrowser =new ChromeDriver();
		oPage= new ActiTimePage(oBrowser);
	}
	public static void navigate()
	{
		oBrowser.navigate().to("http://localhost:81/login.do");

	}
	public static void login()
	{
		try
		{
			oPage.getUsername().sendKeys("admin");
			oPage.getpwd().sendKeys("manager");
			oPage.getologin().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logout()
	{
		try {
			oPage.getologout().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void closeBrowser()
	{
		try 
		{
			oBrowser.quit();

		} catch (Exception e) 
		{
			e.printStackTrace();		
		}
	}

}
