package com.sgtesting.youtubeassign;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YoutubePage {

	public YoutubePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}
	@FindBy(xpath="//input[@id]")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}
	@FindBy(xpath="//*[@id=\'button\']/yt-icon")
	private WebElement serchBtn;  
	public WebElement ClickSearch()
	{
		return ClickSearch();
	}
		
	@FindBy(xpath="//*[@id='img']")
	private List<WebElement> img;
	public List<WebElement> getImgLinks() {
		return  img;
	}
	
	
}
