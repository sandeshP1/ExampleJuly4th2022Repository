package com.sgtesting.testngprototype;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateUserScenariodemoChrome {
	public static WebDriver oBrowser =null;
//	public static void main(String[] args) {
//		launchBrowser();
//		navigate();
//		login();
//		createUser();
//		deleteUserName();
//		logout();
//		closeBrowser();
//	}
	@Test(priority = 1)
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "H:\\\\EXAMPLEAUTOMATION\\\\Automation\\\\Web-Automation\\\\Library\\\\drivers\\\\chromedriver.exe");
			oBrowser =new ChromeDriver();
			oBrowser.manage().window().maximize();



		}catch(Exception e)
		{
			e.printStackTrace();

		}
	}
	@Test(priority = 2)
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
	@Test(priority=3,dataProvider = "loginDetails")
	private static void  login(String UN,String password)
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys(UN);
			oBrowser.findElement(By.name("pwd")).sendKeys(password);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			//	oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			//	Thread.sleep(4000);

		}catch (Exception e) 
		{
			e.printStackTrace();

		}
	}
	@DataProvider
	public Object[][] loginDetails(){
		return new Object[][]
				{
			{"admin","manager"}
				};
	}
	@Test(priority=4,dataProvider = "UserDetails")
	private static void createUser(String fn,String ln,String mail,String un,String pswrd,String pwdcpy)
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.name("firstName")).sendKeys(fn);
			oBrowser.findElement(By.name("lastName")).sendKeys(ln);
			oBrowser.findElement(By.name("email")).sendKeys(mail);
			oBrowser.findElement(By.name("username")).sendKeys(un);
			oBrowser.findElement(By.name("password")).sendKeys(pswrd);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwdcpy);
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']")).click();
			Thread.sleep(3000);

		}catch (Exception e) {

			e.printStackTrace();
		}
	}@DataProvider
	public Object[][] UserDetails(){
		return new Object[][]
				{
			{"Demo","D","DemoD@gmail.com","DemoD1","DemoD#123","DemoD#123"}
				};
	}

@Test(priority = 5)
	private static void deleteUserName()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//span[text()='D, Demo']")).click();
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
@Test(priority=6)
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
@Test(priority=7)
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




