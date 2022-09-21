package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutChromeBrowser {
public static  WebDriver oBrowser =null;

	public static void main(String[] args) 
	{
		launchBrowser();
		enterUrl();
		Login();
		logout();
		closeBrowser();
	}

	private static void launchBrowser()
	{
		try 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\EXAMPLEAUTOMATION\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void enterUrl()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try
		{
			/*By by =By.id("username");
			WebElement oEe=oBrowser.findElement(by);
			oEe.sendKeys("admin");*/
			oBrowser.findElement(By.id("username")).sendKeys("admin");
	        oBrowser.findElement(By.name("pwd")).sendKeys("manager");
	        oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(5000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void  closeBrowser()
	{
		try
		{
			oBrowser.close();
			
		}
		catch (Exception e)
			{
				e.printStackTrace();
			}
	}
}