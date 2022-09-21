package com.sgtesting.CssSelectorPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
	public static WebDriver oBrowser =null;
	public static void main(String[] args) {
		launching();
		navigating();
		//absoluteCssPath();
		//relativeCSSUsingTagName();
		//relativeCSSUsingTagNameWithIDAttributeValue();
		//relativeCSSUsingIDAttributeValue();
	//	relativeCSSusingTagNamewithClassAttributeValue();
		//relativeCSSUsingClassAttributeValue();
		//relativeCSSUsingTagNameWithAttributeNameValue();
	//	relativeCSSUsingTagNameWithMultipleAttributeNameValue();
		//relativeCSSUsingWithoutTagNameOnlyAttributeNameValue();
		//relativeCSSUsingTagNameWithPartialAttributeValue();
		//relativeCSSUsingTagNameWithAttributeName();
		//relativeCSSUsingTagNameWithAttributeName_1();
		//relativeCSSUsingTagNameWithAttributeName_2();
		//relativeCSSUsingParentElementReference();
		relativeCSSUsingNthChildConcept();
	}
	/**
	 * Case 11: Identify the Element based on Parent Tag Details
	 * Syntax: parent Element > child Element
	 */
	private static void relativeCSSUsingParentElementReference()
	{
		oBrowser.findElement(By.cssSelector("form#frm2 > input")).click();
	}
	/**
	 * Case 12: Identify the Element based on nth-child
	 * Syntax: nth-child(number)
	 */
	private static void relativeCSSUsingNthChildConcept()
	{
	//	oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(5)")).sendKeys("DemoUser5");
		//oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(7)")).sendKeys("DemoUser7");
	oBrowser.findElement(By.cssSelector("form#frm3 >:nth-child(2)")).sendKeys("username2");
	
	}
	

	private static void relativeCSSUsingTagNameWithAttributeName_2() {
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement olink= olinks.get(i);
			String linkname =olink.getText();
			if(linkname.endsWith("Apache"))
			{
				olink.click();
			}
			
		}
	}

	private static void relativeCSSUsingTagNameWithAttributeName_1() {
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement olink= olinks.get(i);
			String linkname =olink.getText();
		    System.out.println(linkname);
			
		}
	}

	/**
	 * Case 10: Identify the Element based on TagName With Attribute Name 
	 * Syntax: <tagName>[attributename]
	 */
	private static void relativeCSSUsingTagNameWithAttributeName()
	{
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
	     System.out.println("no links :"+olinks.size());
	}
	

	/**
	 * Case 9: Identify the Element based on Partial Matching of Attribute Value combination
	 * 
	 * Syntax: <tagName>[attributename ^='partial attributevalue']
	 * Syntax: <tagName>[attributename $='partial attributevalue']
	 * Syntax: <tagName>[attributename *='partial attributevalue']
	 */	
	private static void relativeCSSUsingTagNameWithPartialAttributeValue() 
	{
		//oBrowser.findElement(By.cssSelector("input[id ^='uid1']")).sendKeys("usernamejdnal");
		//oBrowser.findElement(By.cssSelector("input[id $='name1']")).sendKeys("Usernamendswith");
		oBrowser.findElement(By.cssSelector("input[id *='user1']")).sendKeys("sldnlasndlsndlsa");
	}


	/**
	 * Case 8: Identify the Element based on TagName With Attribute Name and Value combination
	 * Syntax: *[attributename='attributevalue']
	 */
	private static void relativeCSSUsingWithoutTagNameOnlyAttributeNameValue() {
		
		oBrowser.findElement(By.cssSelector("*[id='uid1user1name1']")).sendKeys("USername1");
	}
	/**
	 * Case 7: Identify the Element based on TagName With Multiple Attribute Name and Value combination
	 * Syntax: <tagName>[attributename='attributevalue'][attributename='attributevalue']
	 */
	private static void relativeCSSUsingTagNameWithMultipleAttributeNameValue() {
		oBrowser.findElement(By.cssSelector("input[id='btn1submit1button1'][name='submit1btn1']")).click();
	}
	/**
	 * Case 6: Identify the Element based on TagName With Attribute Name and Value combination
	 * Syntax: <tagName>[attributename='attributevalue']
	 */
	private static void relativeCSSUsingTagNameWithAttributeNameValue() {
		oBrowser.findElement(By.cssSelector("input[id='pwd1pass1word1']")).sendKeys("userName");
	}
	/**
	 * Case 5: Identify the Element based on class attribute value alone
	 * Syntax: .<class attribute value>
	 */
	private static void relativeCSSUsingClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("DemoUser1");
	}
	
	/**
	 * Case 4: Identify the Element based on <tagName> with class attribute value
	 * Syntax: <tagName>.<class attribute value>
	 */
	
	private static void relativeCSSusingTagNamewithClassAttributeValue() 
	{
		oBrowser.findElement(By.cssSelector("input.user1name1")).sendKeys("username");
	}

	/**
	 * Case 3: Identify the Element based on id attribute value alone
	 * Syntax: #<id attribute value>
	 */
	private static void relativeCSSUsingIDAttributeValue() {
		oBrowser.findElement(By.cssSelector("#uid1user1name1")).sendKeys("USerNAme");
	}

	/**
	 * Case 2: Identify the Element based on <tagName> with id attribute value
	 * Syntax: <tagName>#<id attribute value>
	 */
	private static void relativeCSSUsingTagNameWithIDAttributeValue() {
		oBrowser.findElement(By.cssSelector("input#uid1user1name1")).sendKeys("Username");
		
	}
	
	private static void relativeCSSUsingTagName() 
	{
		oBrowser.findElement(By.cssSelector("input")).sendKeys("username");
		
	}
	private static void absoluteCssPath() 
	{
		try 
		{
			oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("USrname1");
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
		
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
			oBrowser.get("file:///C:/Users/sandy/Downloads/xpathdemo_3_sept_2022/Sample.html");	
			Thread.sleep(4000);

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
