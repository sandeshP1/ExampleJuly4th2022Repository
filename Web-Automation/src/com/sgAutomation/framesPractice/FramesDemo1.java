package com.sgAutomation.framesPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class FramesDemo1 {
	public static WebDriver oBrowser =null;
	public static void main(String[] args) {

		launching();
		navigating();
	    HandleFrames();

	}
	private static void launching()
	{
		try{
			System.setProperty("webdriver.chrome.driver", "C:\\EXAMPLEAUTOMATION\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser =new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void navigating()
	{ 
		try 
		{
			oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");	
			Thread.sleep(4000);

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
	private static void HandleFrames()
	{
		try 
		{
			oBrowser.switchTo().frame(0);
			oBrowser.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
			oBrowser.switchTo().defaultContent();
			Thread.sleep(3000);
			oBrowser.switchTo().frame("packageFrame");			
			oBrowser.findElement(By.xpath("//span[text()='WebDriver']")).click();
			oBrowser.switchTo().defaultContent();
			Thread.sleep(4000);
//			oBrowser.switchTo().frame("rightIframe");
			WebElement OEle=oBrowser.findElement(By.xpath("//iframe[@class='rightIframe']"));
			oBrowser.switchTo().frame(OEle);
			String 	content =oBrowser.findElement(By.xpath("/html/body/main/div[2]/div[1]/ul/li/div")).getText();
			System.out.println(content);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
