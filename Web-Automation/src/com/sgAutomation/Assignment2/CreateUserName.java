package com.sgAutomation.Assignment2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserName {
	public static WebDriver oBrowser =null;
	public static ActiTimePage oPage = null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		userClick();
		addUser();
		deleteUserName();
	}
	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\EXAMPLEAUTOMATION\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		oBrowser =new ChromeDriver();
		oPage= new ActiTimePage(oBrowser);
		oBrowser.manage().window().maximize();
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
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void userClick()
	{
		try 
		{
			oPage.getUsersclick().click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void addUser()
	{
		try
		{
			oPage.getAddUserClick().click();
			Thread.sleep(3000);
			oPage.getfirstNameInUser().sendKeys("Demo");
			oPage.getlastNameinUser().sendKeys("d1");
			oPage.getemailFieldinUser().sendKeys("demod1@gmail.com");
			oPage.getusernameFieldinUsername().sendKeys("Demod1");
			oPage.getpswrdinUser().sendKeys("demod1#123");
			oPage.getcopypswrdinUser().sendKeys("demod1#123");
			oPage.getaddUserbtn().click();
			Thread.sleep(3000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUserName()
	{
		try 
		{
			oPage.getmodifiedUSerNAmeForDelting().click();
			Thread.sleep(3000);
			oPage.getDeleteBtn().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			System.out.println(oAlert.getText());
			oAlert.accept();
			Thread.sleep(3000);
			
		} catch (Exception e) {
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
