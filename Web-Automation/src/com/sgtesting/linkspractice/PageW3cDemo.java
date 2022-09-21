package com.sgtesting.linkspractice;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageW3cDemo {
	public  PageW3cDemo( WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	
	@FindBy(xpath="//a[@href]")
	private List<WebElement> getLinks;
	public List<WebElement> getlinksCount()
	{
		return getLinks;
	}
	//public 
}
