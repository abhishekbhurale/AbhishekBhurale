package com.sauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPagePOM 
{
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='nav-image-link']")
	WebElement Aboutpage;
	
	public boolean isdislpayedAboutpage()
	{
	    boolean result  =	Aboutpage.isDisplayed();
		return  result;
	}
	
	
	public AboutPagePOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
