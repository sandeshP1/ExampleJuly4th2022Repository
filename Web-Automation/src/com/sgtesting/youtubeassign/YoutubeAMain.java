package com.sgtesting.youtubeassign;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeAMain {
	public static WebDriver oBrowser =null;
	public static YoutubePage oPage=null;
	public static void main(String[] args) {

		launchBrowser();
		enterUrl();
		search();

	}
	private static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\EXAMPLEAUTOMATION\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
			oPage =new YoutubePage(oBrowser);
			oBrowser.manage().window().maximize();
			Thread.sleep(3000);
		} catch (Exception e) {

			e.printStackTrace();}
	}
	private static void enterUrl()
	{
		try {
			oBrowser.get("https://www.youtube.com/");
			Thread.sleep(20000);
		} catch (Exception e) {

			e.printStackTrace();}
	}
	private static void search()
	{
		try {
			oPage.getSearch().sendKeys("kgf");
			Thread.sleep(3000);
			oPage.ClickSearch().click();
			Thread.sleep(15000);
			List<WebElement> oLinks =oPage.getImgLinks();
			for(int i=0;i<oLinks.size();i++)
			{
				//System.out.println(oLinks.get(i).getAttribute("img"));
				System.out.println(oLinks.get(i).getText());

			}

		} catch (Exception e) {

			e.printStackTrace();}
	}


}
