package com.sgAutomation.ObjectMappingDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class modifyCustomerObjectMapingChromeDemo {
	public static WebDriver oBrowser  =null;
	public static ObjectMap objectmap =null;
	public static String FirstName ="demi";
	public static String lastName="God";
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		userCreate();
		modifyUser();
		deleteUser();
		logout();
	}
	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser =new ChromeDriver();
			objectmap =new ObjectMap("objectmap.properties");

		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void navigate()
	{
		try 
		{
			oBrowser.get("http://localhost:81/login.do"); 
			oBrowser.manage().window().maximize();
			Thread.sleep(4000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("admin");
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("manager");
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void userCreate()
	{
		try 
		{
			oBrowser.findElement(objectmap.getLocator("usersClick")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("addUserBtn")).click();
			Thread.sleep(4000);
			oBrowser.findElement(objectmap.getLocator("firstnameinCretUser")).sendKeys("demi");
			oBrowser.findElement(objectmap.getLocator("LastnameinCreateuser")).sendKeys("God");
			oBrowser.findElement(objectmap.getLocator("emialidinCretUse")).sendKeys("demigod@gmail.com");
			oBrowser.findElement(objectmap.getLocator("loginUsername")).sendKeys("demigod");
			oBrowser.findElement(objectmap.getLocator("paswrd")).sendKeys("demo#123");
			oBrowser.findElement(objectmap.getLocator("retypepswrd")).sendKeys("demo#123");
			oBrowser.findElement(objectmap.getLocator("createUserbtn")).click();
			Thread.sleep(4000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void modifyUser()
	{
		try 
		{
			oBrowser.findElement(objectmap.getLocator("modifyUsername")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("firstnameinCretUser")).clear();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("firstnameinCretUser")).sendKeys("demi1");
			oBrowser.findElement(objectmap.getLocator("LastnameinCreateuser")).clear();
			oBrowser.findElement(objectmap.getLocator("LastnameinCreateuser")).sendKeys("God2");
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("saveChangesBtn")).click();
			Thread.sleep(3000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("modifyUsername")).click();
			//oBrowser.findElement(objectmap.getLocator("deletemodifyclick")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("deleteButton")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String msginalert=oAlert.getText();
			System.out.println(msginalert);
			oAlert.accept();
			Thread.sleep(4000);
		} catch (Exception e) {
		}
	}
	private static void logout() 
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("logoutbtn")).click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
