package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchingbrowsers {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","C:\\EXAMPLEAUTOMATION\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		WebDriver wb =new ChromeDriver(); 
		wb.get("http://localhost:81/login.do");
		Thread.sleep(5000);
		wb.close();
	}

}
