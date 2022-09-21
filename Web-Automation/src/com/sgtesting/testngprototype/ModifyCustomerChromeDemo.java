package com.sgtesting.testngprototype;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ModifyCustomerChromeDemo {
	public static WebDriver oBrowser =null;

//	public static void main(String[] args) {
//		launchBrowser();
//		navigate();
//		login();
//		createCustomer();
//		modifyCustomer();
//		DeleteCustomer();
//	logout();
//		closeBrowser();
//	}
	@Test(priority=1)
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
	@Test(priority=2)
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
			Thread.sleep(2000);
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
	@Test(priority = 4,dataProvider = "CustomerDetails")
	private static void createCustomer(String customername,String custDesc)
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys(customername);
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys(custDesc);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@DataProvider
	public Object[][] CustomerDetails(){
		return new Object[][]
				{
			{"LBRO Customer","LBRO IS SUBPARTNER OF THE BOSCH COMPANY WITH MANUFACTURES QUALITY PRODUCT AND PROVIDES GOOD BUSINESS"}
				};
	}
	@Test(priority=5,dataProvider = "modifiedCustomer")
	private static void modifyCustomer(String mc) 
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(3000);
			//oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")).clear();
			//Thread.sleep(2000);
		//	oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")).sendKeys("LBRO REMODIFIED");
			//Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).clear();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys(mc);
			Thread.sleep(3000);		
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@DataProvider
	public Object[][] modifiedCustomer(){
		return new Object[][]
				{
			{"LBRO REMODIFIED THE WHOLE BUSINESS PLAN"}
				};
	}
	@Test(priority=6)
	private static void DeleteCustomer()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(3000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[10]/div[2]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")).click();
			Thread.sleep(3000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 7)
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
	@Test(priority = 8)
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


