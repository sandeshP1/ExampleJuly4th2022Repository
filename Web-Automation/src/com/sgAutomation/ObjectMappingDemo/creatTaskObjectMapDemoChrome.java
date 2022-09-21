package com.sgAutomation.ObjectMappingDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class creatTaskObjectMapDemoChrome {
	public static WebDriver oBrowser  =null;
	public static ObjectMap objectmap =null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createCustomer();
		createProject();
		createTask();
		DeleteTask();
		DeleteProject();
		DeleteCustomer();
		logout();
		
		
		
		
		
		
	}private static void launchBrowser()
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
	private static void createCustomer()
	{
		try 
		{
			oBrowser.findElement(objectmap.getLocator("TasksClick")).click();
			Thread.sleep(4000);
			oBrowser.findElement(objectmap.getLocator("AddnewBtn")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("newCustomerbtn")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("customernameTextField")).sendKeys("LBBRO");
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("AddCustomerDesc")).sendKeys("LBRO IS SUBPARTNER OF THE BOSCH COMPANY WITH MANUFACTURES QUALITY PRODUCT AND PROVIDES GOOD BUSINESS");
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("createCustomerBtn")).click();
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			
		}
		
	}
	private static void createProject()
	{
		try 
		{
			oBrowser.findElement(objectmap.getLocator("AddnewBtn")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("newProjectBtn")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("EnterProjectName")).sendKeys("MissionImppossible");
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("EnterprojectDescRiption")).sendKeys("Nothing is impossible in this impossible world");
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("CreatProjectBtn")).click();
			Thread.sleep(3000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	private static void createTask()
	{
		try 
		{
			oBrowser.findElement(objectmap.getLocator("AddNewTask")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("CreatNewTask")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("EnterTaskName")).sendKeys("JAVAWORking");
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("CreateTasks")).click();
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	private static void DeleteTask()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("selectDeleteTask")).click();
			Thread.sleep(3000);
	       oBrowser.findElement(objectmap.getLocator("DeleteBtn")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("DeletePermenantly")).click();
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void DeleteProject()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("projectseticon")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("projectclosebtn")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("projectseticon")).click();
			Thread.sleep(3000);
			
	       oBrowser.findElement(objectmap.getLocator("ActionsBtninproje")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("DeletebtninPRo")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("DeletepermeninPRoje")).click();
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void DeleteCustomer()
	{
		try 
		{
			oBrowser.findElement(objectmap.getLocator("Customerseticon")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("CustcloseBtn")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("Customerseticon")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("CustActionsBtn")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("Delieteincust")).click();
			Thread.sleep(3000);
			oBrowser.findElement(objectmap.getLocator("DeleteinpermenCust")).click();
			Thread.sleep(3000);

		} catch (Exception e) 
		{
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
