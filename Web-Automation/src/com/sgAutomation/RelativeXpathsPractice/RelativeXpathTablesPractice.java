package com.sgAutomation.RelativeXpathsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathTablesPractice {
	public static WebDriver oBrowser =null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//entireSalaryForPersonSachinTendulkar();
		//EnterTheSalaryForThePersonWhoIsNextToRahulDravid();
		//statusAsActiveForIndiaFreedomFighter();
		//personSachinTendulkarHis2ndRecordStatusActive();
		//basedOnTextFieldGetTheTableIDAttributeValue();
		basedOnTableEnterSalaryFor6thRecord();
	}
	private static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\\\EXAMPLEAUTOMATION\\\\Automation\\\\Web-Automation\\\\Library\\\\drivers\\\\chromedriver.exe");
			oBrowser = new ChromeDriver();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try 
		{
			oBrowser.get("file:///C:/Users/sandy/Downloads/xpathaxes_04_sept_2022/WebTableHTML.html");

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Case 1: following-sibling
	 * Enter the salary for the Person Sachin Tendulkar
	 */
	private static void entireSalaryForPersonSachinTendulkar()

	{
		try 
		{
			oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("20000");

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void EnterTheSalaryForThePersonWhoIsNextToRahulDravid()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[1]/td[6]/input")).sendKeys("15000");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Case 3: preceding-sibling
	 *  Mark the status as Active for India Fredom Fighter
	 */
	private static void statusAsActiveForIndiaFreedomFighter()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[2]/input")).click();

		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	/**
	 * Case 4: preceding
	 *  From the Person Sachin Tendulkar,His Previous 2ndRecord ,Mark the status as Active 
	 */
	private static void personSachinTendulkarHis2ndRecordStatusActive()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[1]/preceding::tr[1]/td[1]/input")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Case 5: ancestor
	 *  Based on the TextFiled of the Sachin Tendulkar Record, get the table id attribute value
	 */
	private static void basedOnTextFieldGetTheTableIDAttributeValue()
	{
		try 
		{
			WebElement oEle= oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor ::td/ancestor::tr/ancestor::table"));
			String val =oEle.getAttribute("id");
		    System.out.println(val);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Case 6: descendant
	 *  Based on the Table Enter The Salary for 6th Record
	 */
	private static void basedOnTableEnterSalaryFor6thRecord()
	{
		try
		{
oBrowser.findElement(By.xpath("//table/descendant::tr[6]/td[6]/input")).sendKeys("45000");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
