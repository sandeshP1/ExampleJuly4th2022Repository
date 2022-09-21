package com.sgAutomation.TypesXpathsPractice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemos {
public static WebDriver oBrowser= null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	InputFrUserName();
	//	inputFrUsernameRe();
	//	UserName();
	//	relativeXpathUsingTagNameWithIndex();
	//	realtiveXpathUsingtagNameWithAttributeNameValue();
	//	 relativeXpathUsingIrrespectiveTagNameWithAttributeNameAndValue()
//	//	reltiveXpathAttributeUsingValueAlone();
	//	relativeXpathWithMultipleAttributesAndValueCombination();
	//	relativeXpathWithMultipleAttriutenameAndValueUSingAndOperator();
	//	relativeXpathWithMultipleAttributeNameAndValueUsingOrOperator();
	//	relativeXpathWithPatialMatchingAttributeValue();
	//	relativexpathWithTaganameAttributecombi();
	//	relativexpathWithTaganameAttributecombi1();
	//	relativexpathWithTaganameAttributecombi2();
		relativeXpathWithAttributeComb3();
	}
	private static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\EXAMPLEAUTOMATION\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		oBrowser =new ChromeDriver();
		oBrowser.manage().window().maximize();
		
	}
	private static void navigate() 
	{
		try {
		oBrowser.get("file:///C:/Users/sandy/Downloads/xpathdemo_3_sept_2022/Sample.html");
		Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/*private static void InputFrUserName()
	{
		try
		{
			oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("Omanuja");
			Thread.sleep(3000);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}*/
		private static void UserName()
		//Relative xpath USing Only TagName
		//Syntax :<//Input>
		{
			try {
				oBrowser.findElement(By.xpath("//input")).sendKeys("oManuja");
			}catch(Exception e)
			{
				e.printStackTrace();
				
			}
		}
		private static void relativeXpathUsingTagNameWithIndex()
		{
			//Syntax //<tagName>[index];
			try {
				oBrowser.findElement(By.xpath("//input[2]")).sendKeys("oManuja");
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//input[3]")).click();
		        Alert s=oBrowser.switchTo().alert();
		        s.accept();
		        System.out.print(s.getText());
				
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void realtiveXpathUsingtagNameWithAttributeNameValue()
		{
			//Syntax://<tagname>[@Attribute='AttributeAvlue']
			try {
				oBrowser.findElement(By.xpath("//input[@name='user1name1']")).sendKeys("oManuja");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//input[@name='pass1word1']")).sendKeys("Omanuja#123");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//input[@name='submit1btn1']")).click();
				Thread.sleep(2000);
				 Alert s=oBrowser.switchTo().alert();
			        s.accept();
			        System.out.print(s.getText());
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
//		case 4: Irrespective of Tagname with AttributeName And Attribute VAlue
//		Syntax://*[@attributename='Attribute'value']
		
		
		private static void relativeXpathUsingIrrespectiveTagNameWithAttributeNameAndValue()
		{
			try 
			{
				oBrowser.findElement(By.xpath("//*[@name='user1name1']")).sendKeys("LoRanSan");
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
//	case:5	Irrespective of tagName and AtributeName using Value Alone
//		 * Syntax: //*[@*='attributevalue']
		private static void reltiveXpathAttributeUsingValueAlone()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();
				
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		/**
		 * Case 6: Using tagName with Multiple AtributeName and Value combination
		 * Syntax: //<tagName>[@Attribute='attributevalue'][@Attribute='attributevalue']
		 */
		private static void relativeXpathWithMultipleAttributesAndValueCombination()
		{
			try 
			{
				oBrowser.findElement(By.xpath("//input[@id='btn1submit1button1'][@value='Submit']")).click();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		/**
		 * Case 7: Using tagName with Multiple AtributeName and Value combination using and operator
		 * Syntax: //<tagName>[@Attribute='attributevalue' and @Attribute='attributevalue']
		 */
		private static void relativeXpathWithMultipleAttriutenameAndValueUSingAndOperator()
		{
			try 
			{
			   oBrowser.findElement(By.xpath("//input[@name='submit1btn1' and @value='Submit']")).click();
			   
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		/**
		 * Case 8: Using tagName with Multiple AtributeName and Value combination using OR operator
		 * Syntax: //<tagName>[@Attribute='attributevalue' and @Attribute='attributevalue']
		 */
		private static void relativeXpathWithMultipleAttributeNameAndValueUsingOrOperator()
		{
			try
			{
				oBrowser.findElement(By.xpath("//input[@id='btn1submit1button1' or @value='Submit']")).click();
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		/**
		 * Case 9: Based on Partial MAtching of Attribute Value 
		 *  starts-with(@attributename,'attributevalue')
		 *  ends-with(@attributename,'attributevalue')
		 *  contains(@attributename,'attributevalue')
		 * Syntax: //<tagName>[starts-with(@attributename,'attributevalue')]
		 * Syntax: //<tagName>[ends-with(@attributename,'attributevalue')]
		 * Syntax: //<tagName>[contains(@attributename,'attributevalue')]
		 */
		private static void relativeXpathWithPatialMatchingAttributeValue()
		{
			try
			{
				//oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn1')]")).click();
			    //we cant use EndsWith in xpath to find Element
		 //	oBrowser.findElement(By.xpath("//input[ends-with(@value,'mit')]")).click();
				oBrowser.findElement(By.xpath("//input[contains(@name,'mit1')]")).click();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		/**
		 * Case 10: Using tagName with AtributeName combination
		 * Syntax: //<tagName>[@Attribute]
		 */
		private static void relativexpathWithTaganameAttributecombi()
		{
			try 
			{
				//Find out no of Links in a webPage
		         List<WebElement> oLinks  	=oBrowser.findElements(By.xpath("//a[@href]"));
		         System.out.println(oLinks.size());
		         
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		private static void relativexpathWithTaganameAttributecombi1()
		{
			try 
			{
			 	List<WebElement> olinks = oBrowser.findElements(By.xpath("//a[@href]"));
			 	for(int i=0;i<olinks.size();i++)
			 	{
			 		String LinkNames =olinks.get(i).getText();
			 		System.out.println(LinkNames);
			 		
			 	}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void  relativexpathWithTaganameAttributecombi2()
		{
			try 
			{
				List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
				for(int i=0;i<oLinks.size();i++)
				{
					String Linkname=oLinks.get(i).getText();
					if(Linkname.endsWith("HQ"))
					{
						oLinks.get(i).click();
						break;
					}
				}
				Thread.sleep(3000);
				oBrowser.navigate().back();
				Thread.sleep(3000);
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		private static void relativeXpathWithAttributeComb3()
		{
			try
			{
				oBrowser.findElement(By.xpath("//a[text()='POI Apache']")).click();
			    Thread.sleep(3000);
				oBrowser.navigate().back();
				
			}catch( Exception e)
			{
				e.printStackTrace();
			}
		}
	
}
