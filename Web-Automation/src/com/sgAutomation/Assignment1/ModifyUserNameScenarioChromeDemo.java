package com.sgAutomation.Assignment1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUserNameScenarioChromeDemo {
	public static WebDriver oBrowser =null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createUser();
		addUser();
		ModifyUser();
		deleteUserName();
		logout();
		closeBrowser();
	}
	private static void launchBrowser()
	{
		try
		{
			String path =System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser =new ChromeDriver();
			oBrowser.manage().window().maximize();



		}catch(Exception e)
		{
			e.printStackTrace();

		}
	}
	private static void navigate()
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
	private static void  login()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);

		}catch (Exception e) 
		{
			e.printStackTrace();

		}
	}
	private static void createUser()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);

		}catch (Exception e) {

			e.printStackTrace();
		}
	}
	private static void addUser()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("D");
			oBrowser.findElement(By.name("email")).sendKeys("DemoD@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("DemoD1");
			oBrowser.findElement(By.name("password")).sendKeys("DemoD#123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("DemoD#123");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']")).click();
			Thread.sleep(4000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void ModifyUser()
	{
		try 
		{
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).clear();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo1");
			oBrowser.findElement(By.name("lastName")).clear();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("lastName")).sendKeys("D1");
			oBrowser.findElement(By.name("username")).clear();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("username")).sendKeys("DemoD2");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void deleteUserName()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//span[text()='D1, Demo1']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert oAlert= oBrowser.switchTo().alert();

			System.out.println(oAlert.getText());
			Thread.sleep(1000);
			oAlert.accept();
			Thread.sleep(3000);

		} catch (Exception e) 
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
			oBrowser.quit();

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	


}
