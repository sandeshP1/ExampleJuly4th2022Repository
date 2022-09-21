package com.sgtesting.linkspractice;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinsDemo {
	public static WebDriver oBrowser=null;
	public static PageW3cDemo oPage=null;
	public static void main(String[] args) {
		openBrowser();
		navigate();
		LinksCount();
	}
	private static void openBrowser()
	{
		try
		{System.setProperty("webdriver.chrome.driver","C:\\EXAMPLEAUTOMATION\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		oPage=new PageW3cDemo(oBrowser);
		oBrowser.manage().window().maximize();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try {
			oBrowser.get("https://en.wikipedia.org/wiki/World_Wide_Web");
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void LinksCount() {
		try
		{
			List<WebElement> oList=oPage.getlinksCount();
			for(int i=0;i<oList.size();i++)
			{
				String links=oList.get(i).getText();
				System.out.println(links);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
