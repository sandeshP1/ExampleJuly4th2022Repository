package com.sgAutomation.Assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatTaskChromeDemo {
	public static WebDriver oBrowser =null;
	public static ActiTimePage oPage = null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createCustomer();
		CreateProject();
		createTask();
		deleteTask();
		DeleteProject();
		DeleteCustomer();
		logout();
		closeBrowser();

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
	private static void createCustomer()
	{
		try 
		{
			oPage.getTasksClick().click();
			Thread.sleep(3000);
			oPage.getclickonAddnewinTasks().click();
			Thread.sleep(3000);
			oPage.getClickOnNewCustomerBtn().click();
			Thread.sleep(2000);
			oPage.getcustmernametextField().sendKeys("LOBRO Comapany");
			oPage.getCstmrdescriFie().sendKeys("LBRO IS SUBPARTNER OF THE BOSCH COMPANY WITH MANUFACTURES QUALITY PRODUCT AND PROVIDES GOOD BUSINESS");
			Thread.sleep(2000);
			oPage.getclickOnCreateCustomer().click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void CreateProject()
	{
		try {
			oPage.getclickonAddnewinTasks().click();
			Thread.sleep(2000);
			oPage.getclickonNewProject().click();
			Thread.sleep(2000);
			oPage.getcreateProjectName().sendKeys("Project IT");
			oPage.getprojectDesc().sendKeys("At AnyCost Get into IT");
			Thread.sleep(2000);
			oPage.getclickonCretprjctbtn().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createTask()
	{
		try 
		{
			oPage.getclickOnAddnewTaskbtn().click();
			Thread.sleep(3000);
			oPage.getclickonCreateNewTasks().click();
			Thread.sleep(3000);
			oPage.getclickonTAskdescription().sendKeys("Counting Logic");
			Thread.sleep(3000);
			oPage.getclickonCreteTAskbtn().click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();

		}
	}
	private static void deleteTask()
	{
		try {
			oPage.getSelecttaskcheckboxbtntoDelete().click();
			Thread.sleep(2000);
			oPage.getclickondeleteTaskbtn().click();
			Thread.sleep(2000);
			oPage.getclickondeletepermenabtn().click();
			Thread.sleep(3000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void DeleteProject()
	{
		try
		{
			oPage.getprojetcSetingicon().click();
			Thread.sleep(3000);
			oPage.getprojectActionsclickbtn().click();
			Thread.sleep(2000);
			oPage.getprojectdeleteicon().click();
			Thread.sleep(2000);
			oPage.getprojectpermanentdeleteicon().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void DeleteCustomer()
	{
		try {
			oPage.getcustomersettingicon().click();
			Thread.sleep(2000);
			oPage.getcustomerActionicon().click();
			Thread.sleep(2000);
			oPage.getcustomerDeletebtn().click();
			Thread.sleep(2000);
			oPage.getdeleteCustomerpermanently().click();
			Thread.sleep(2000);
			
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







