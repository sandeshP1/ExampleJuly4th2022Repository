package com.sgAutomation.ObjectMappingDemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {
	public static WebDriver oBrowser  =null;
	public static ObjectMap objectmap =null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
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
