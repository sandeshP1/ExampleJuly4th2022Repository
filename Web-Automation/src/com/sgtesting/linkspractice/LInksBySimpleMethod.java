package com.sgtesting.linkspractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LInksBySimpleMethod {
	public static WebDriver oBrowser =null;

	public static void main(String[] args) {

		openDriver();
		openUrl();
		noOfLinks();
	}
	private static void openDriver()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\\\EXAMPLEAUTOMATION\\\\Automation\\\\Web-Automation\\\\Library\\\\drivers\\\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void openUrl()
	{
		try {
			oBrowser.get("https://en.wikipedia.org/wiki/World_Wide_Web");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void noOfLinks()
	{
		try {
			List<WebElement> oLinks = oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<oLinks.size();i++)
			{
				System.out.println(oLinks.get(i).getSize());
		//		String linknames =oLinks.get(i).getText();
		//		System.out.println(linknames);
			}
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}



}
